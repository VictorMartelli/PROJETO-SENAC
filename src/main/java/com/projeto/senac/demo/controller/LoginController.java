package com.projeto.senac.demo.controller;

import com.projeto.senac.demo.dao.PessoaRepository;
import com.projeto.senac.demo.model.Pessoa;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {


    private PessoaRepository pessoaRepository;

    @GetMapping("/login")
    public String abrirLogin(Pessoa pessoa){

        return "login";
    }


}
