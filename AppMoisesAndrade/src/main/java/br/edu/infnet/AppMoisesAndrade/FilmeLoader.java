package br.edu.infnet.AppMoisesAndrade;

import model.domain.Avaliacao;
import model.domain.Cliente;
import model.domain.Filme;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Component
public class FilmeLoader implements ApplicationRunner {

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

                FileReader fileFilme = new FileReader("filme.txt");
                BufferedReader dataFilme = new BufferedReader(fileFilme);

                String linhaFilme = dataFilme.readLine();

                while(linhaFilme != null) {
                    String[] camposFilme = linhaFilme.split(";");

                    Filme filme = new Filme();
                    filme.setTitulo(camposFilme[0]);
                    filme.setGenero(camposFilme[1]);
                    filme.setAnolancamento(Integer.valueOf(camposFilme[2]));
                    filme.setDuracao(Integer.valueOf(camposFilme[3]));
                    filme.setAvaliacoes(new ArrayList<>(Arrays.asList(avaliacao)));
                    filme.setOscar(List.of(camposFilme[4].split(",")));

                    linhaFilme = dataFilme.readLine();

                    System.out.println("[FILME] " + filme);
                }

                linhaAvaliacao = dataAvaliacao.readLine();
            }

            linhaCliente = dataCliente.readLine();
        }
    }
}
