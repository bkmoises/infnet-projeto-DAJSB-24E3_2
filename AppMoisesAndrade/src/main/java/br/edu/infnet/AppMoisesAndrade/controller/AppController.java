package br.edu.infnet.AppMoisesAndrade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping(value = "/")
    public String exibirMensagem() {
        return "Rota Raiz";
    }

    @GetMapping(value = "/home")
    public String exibirHome() {
        return "Rota Home";
    }
}
