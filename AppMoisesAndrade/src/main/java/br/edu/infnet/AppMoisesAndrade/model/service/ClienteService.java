package br.edu.infnet.AppMoisesAndrade.model.service;

import br.edu.infnet.AppMoisesAndrade.model.domain.Cliente;
import br.edu.infnet.AppMoisesAndrade.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public void incluir(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public Iterable<Cliente> obterLista(){
        return clienteRepository.findAll();
    }

    public Cliente obterPorId(Integer id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public void  remover(Integer id) {
        clienteRepository.deleteById(id);
    }

    public Long obterQtd() {
        return clienteRepository.count();
    }
}
