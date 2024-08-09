package br.edu.infnet.AppMoisesAndrade;

import br.edu.infnet.AppMoisesAndrade.model.domain.Cliente;
import br.edu.infnet.AppMoisesAndrade.model.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;

@Component
public class ClienteLoader implements ApplicationRunner {

    @Autowired
    private ClienteService clienteService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        FileReader file = new FileReader("cliente.txt");
        BufferedReader data = new BufferedReader(file);

        String linha = data.readLine();
        String[] campos = null;

        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");

        while(linha != null) {
            campos = linha.split(";");

            Cliente cliente = new Cliente();

            cliente.setNome(campos[0]);
            cliente.setCpf(campos[1]);
            cliente.setEmail(campos[2]);
            cliente.setDataNascimento(dateFormat.parse(campos[3]));
            cliente.setAssinante(Boolean.valueOf(campos[4]));

            clienteService.incluir(cliente);

            linha = data.readLine();
        }

        for(Cliente cliente : clienteService.obterLista()) {
            System.out.println("[CLIENTE] " + cliente);
        }

    }
}
