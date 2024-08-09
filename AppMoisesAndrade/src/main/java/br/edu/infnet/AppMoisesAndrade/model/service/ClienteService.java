package br.edu.infnet.AppMoisesAndrade.model.service;

import br.edu.infnet.AppMoisesAndrade.model.domain.Cliente;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ClienteService {
    private Map<Integer, Cliente> mapa = new HashMap<Integer, Cliente>();
    private Integer id = 0;

    public void incluir(Cliente cliente) {
        cliente.setId(id++);
        mapa.put(cliente.getId(), cliente);
    }

    public Collection<Cliente> obterLista(){
        return mapa.values();
    }

    public Cliente obterPorId(Integer id) {
        return mapa.get(id);
    }

    public void  remover(Integer id) {
        mapa.remove(id);
    }

}
