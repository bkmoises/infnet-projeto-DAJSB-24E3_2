package br.edu.infnet.AppMoisesAndrade;

import br.edu.infnet.AppMoisesAndrade.model.domain.Avaliacao;
import br.edu.infnet.AppMoisesAndrade.model.domain.Cliente;
import br.edu.infnet.AppMoisesAndrade.model.domain.Filme;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.*;

@Component
public class FilmeLoader implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Map<Integer, Filme> mapa = new HashMap<Integer, Filme>();
        Integer id = 0;

        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");

        FileReader file = new FileReader("filme.txt");
        BufferedReader data = new BufferedReader(file);

        String linha = data.readLine();
        String[] campos = null;

        Cliente cliente = null;
        Avaliacao avaliacao = null;
        Filme filme = null;

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
                    filme.getAvaliacoes().add(avaliacao);
                    break;

                case "F":
                    filme = new Filme();
                    filme.setId(id++);
                    filme.setTitulo(campos[1]);
                    filme.setGenero(campos[2]);
                    filme.setAnolancamento(Integer.valueOf(campos[3]));
                    filme.setDuracao(Integer.valueOf(campos[4]));
                    filme.getOscar().addAll(List.of(campos[5].split(",")));

                    mapa.put(filme.getId(), filme);

                default:
                    break;
            }

            linha = data.readLine();
        }

        for(Filme f : mapa.values()) {
            System.out.println("[FILME] " + f);
        }

    }
}
