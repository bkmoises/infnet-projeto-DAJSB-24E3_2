package br.edu.infnet.AppMoisesAndrade;

import br.edu.infnet.AppMoisesAndrade.model.domain.Cliente;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

@Component
public class ClienteLoader implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Map<Integer, Cliente> mapa = new HashMap<Integer, Cliente>();
        Integer id = 0;

        FileReader file = new FileReader("cliente.txt");
        BufferedReader data = new BufferedReader(file);

        String linha = data.readLine();
        String[] campos = null;

        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");

        while(linha != null) {
            campos = linha.split(";");

            Cliente cliente = new Cliente();

            cliente.setId(id++);
            cliente.setNome(campos[0]);
            cliente.setCpf(campos[1]);
            cliente.setEmail(campos[2]);
            cliente.setDataNascimento(dateFormat.parse(campos[3]));
            cliente.setAssinante(Boolean.valueOf(campos[4]));

            mapa.put(cliente.getId(), cliente);

            linha = data.readLine();
        }

        for(Cliente cliente : mapa.values()) {
            System.out.println("[CLIENTE] " + cliente);
        }

    }
}
