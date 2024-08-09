package br.edu.infnet.AppMoisesAndrade.controller;

import br.edu.infnet.AppMoisesAndrade.model.domain.Cliente;
import br.edu.infnet.AppMoisesAndrade.model.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping(value = "/cliente")
    public Collection<Cliente> listarTodos() {
        return clienteService.obterLista();
    }

    @GetMapping(value = "/cliente/{id}")
    public Cliente obterPorId(@PathVariable Integer id) {
        return clienteService.obterPorId(id);
    }

    @PostMapping(value = "/cliente")
    public Cliente incluir(@RequestBody Cliente cliente) {
        clienteService.incluir(cliente);
        return cliente;
    }

    @DeleteMapping(value = "/cliente/{id}")
    public String remover(@PathVariable Integer id) {
        clienteService.remover(id);
        return "item id \"" + id + "\" foi removido com sucesso!";
    }
}
