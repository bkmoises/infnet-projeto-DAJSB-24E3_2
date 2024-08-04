package br.edu.infnet.AppMoisesAndrade;

import model.domain.Avaliacao;
import model.domain.Cliente;
import model.domain.Filme;
import model.domain.Serie;
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
public class SerieLoader implements ApplicationRunner {
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

                FileReader fileSerie = new FileReader("serie.txt");
                BufferedReader dataSerie = new BufferedReader(fileSerie);

                String linhaSerie = dataSerie.readLine();

                while(linhaSerie != null) {
                    String[] camposSerie = linhaSerie.split(";");

                    Serie serie = new Serie();
                    serie.setTitulo(camposSerie[0]);
                    serie.setGenero(camposSerie[1]);
                    serie.setAnolancamento(Integer.valueOf(camposSerie[2]));
                    serie.setDuracao(Integer.valueOf(camposSerie[3]));
                    serie.setAvaliacoes(new ArrayList<>(Arrays.asList(avaliacao)));
                    serie.setTemporada(Integer.valueOf(camposSerie[4]));
                    serie.setEpisodio(Integer.valueOf(camposSerie[5]));

                    linhaSerie = dataSerie.readLine();

                    System.out.println("[SERIE] " + serie);
                }

                linhaAvaliacao = dataAvaliacao.readLine();
            }

            linhaCliente = dataCliente.readLine();
        }
    }
}
