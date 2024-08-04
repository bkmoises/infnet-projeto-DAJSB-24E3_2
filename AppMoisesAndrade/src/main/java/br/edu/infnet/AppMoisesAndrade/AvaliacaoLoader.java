package br.edu.infnet.AppMoisesAndrade;

import br.edu.infnet.AppMoisesAndrade.model.domain.Avaliacao;
import br.edu.infnet.AppMoisesAndrade.model.domain.Cliente;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;

@Component
public class AvaliacaoLoader implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");

        FileReader fileCliente = new FileReader("cliente.txt");
        BufferedReader dataCliente = new BufferedReader(fileCliente);

        String linhaCliente = dataCliente.readLine();

        while(linhaCliente != null) {
            String[] camposCliente = linhaCliente.split(";");

            Cliente cliente = new Cliente();
            cliente.setNome(camposCliente[0]);
            cliente.setCpf(camposCliente[1]);
            cliente.setEmail(camposCliente[2]);
            cliente.setDataNascimento(dateFormat.parse(camposCliente[3]));
            cliente.setAssinante(Boolean.valueOf(camposCliente[4]));

            FileReader fileAvaliacao = new FileReader("avaliacao.txt");
            BufferedReader dataAvaliacao = new BufferedReader(fileAvaliacao);

            String linhaAvaliacao = dataAvaliacao.readLine();

            while(linhaAvaliacao != null) {
                String[] camposAvaliacao = linhaAvaliacao.split(";");

                Avaliacao avaliacao = new Avaliacao();
                avaliacao.setNota(Float.valueOf(camposAvaliacao[0]));
                avaliacao.setComentario(camposAvaliacao[1]);
                avaliacao.setCliente(cliente);

                linhaAvaliacao = dataAvaliacao.readLine();

                System.out.println("[AVALIACAO] " + avaliacao);
            }

            linhaCliente = dataCliente.readLine();
        }
    }
}
