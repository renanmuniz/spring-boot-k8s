package com.renanmuniz.springk8s;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping(path = "controller")
public class Controller {

    @GetMapping
    public String getResponse() {
        System.out.println(LocalDateTime.now() + " Requisicao recebida.");
        return "Olá!";
    }

}

