package br.edu.infnet.AppMoisesAndrade;

import br.edu.infnet.AppMoisesAndrade.model.domain.Avaliacao;
import br.edu.infnet.AppMoisesAndrade.model.domain.Cliente;
import br.edu.infnet.AppMoisesAndrade.model.domain.Filme;
import br.edu.infnet.AppMoisesAndrade.model.domain.Serie;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.*;

@Component
public class SerieLoader implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Map<Integer, Serie> mapa = new HashMap<Integer, Serie>();
        Integer id = 0;

        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");

        FileReader file = new FileReader("serie.txt");
        BufferedReader data = new BufferedReader(file);

        String linha = data.readLine();
        String[] campos = null;

        Cliente cliente = null;
        Avaliacao avaliacao = null;
        Serie serie  = null;

        while(linha != null) {

            campos = linha.split(";");

            switch (campos[0].toUpperCase()) {
                case "C":
                    cliente = new Cliente();
                    cliente.setNome(campos[1]);
                    cliente.setCpf(campos[2]);
                    cliente.setEmail(campos[3]);
                    cliente.setDataNascimento(dateFormat.parse(campos[4]));
                    cliente.setAssinante(Boolean.valueOf(campos[5]));
                    break;

                case "A":
                    avaliacao = new Avaliacao();
                    avaliacao.setNota(Float.valueOf(campos[1]));
                    avaliacao.setComentario(campos[2]);
                    avaliacao.setCliente(cliente);
                    serie.getAvaliacoes().add(avaliacao);
                    break;

                case "S":
                    serie = new Serie();
                    serie.setId(id++);
                    serie.setTitulo(campos[1]);
                    serie.setGenero(campos[2]);
                    serie.setAnolancamento(Integer.valueOf(campos[3]));
                    serie.setDuracao(Integer.valueOf(campos[4]));
                    serie.setTemporada(Integer.valueOf(campos[5]));
                    serie.setEpisodio(Integer.valueOf(campos[6]));

                    mapa.put(serie.getId(), serie);

                default:
                    break;
            }

            linha = data.readLine();
        }

        for(Serie s : mapa.values()) {
            System.out.println("[SÉRIE] " + s);
        }
    }
}