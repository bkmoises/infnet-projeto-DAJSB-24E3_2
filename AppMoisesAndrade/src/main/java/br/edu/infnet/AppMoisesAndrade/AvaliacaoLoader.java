package br.edu.infnet.AppMoisesAndrade;

import br.edu.infnet.AppMoisesAndrade.model.domain.Avaliacao;
import br.edu.infnet.AppMoisesAndrade.model.domain.Cliente;
import br.edu.infnet.AppMoisesAndrade.model.service.AvaliacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

@Component
public class AvaliacaoLoader implements ApplicationRunner {
    @Autowired
    private AvaliacaoService avaliacaoService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");

        FileReader file = new FileReader("avaliacao.txt");
        BufferedReader data = new BufferedReader(file);

        String linha = data.readLine();
        String[] campos = null;

        Cliente cliente = null;

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
                    Avaliacao avaliacao = new Avaliacao();
                    avaliacao.setNota(Float.valueOf(campos[1]));
                    avaliacao.setComentario(campos[2]);
                    avaliacao.setCliente(cliente);

                    avaliacaoService.incluir(avaliacao);
                break;

                default:
                    break;
            }

            linha = data.readLine();
        }

        for(Avaliacao avaliacao : avaliacaoService.obterLista()) {
            System.out.println("[AVALIACAO] " + avaliacao);
        }

    }
}
