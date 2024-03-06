package com.projeto.senac.demo.controller;

import com.projeto.senac.demo.dao.PessoaRepository;
import com.projeto.senac.demo.model.Pessoa;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlakController {

    private PessoaRepository pessoaRepository;

    @GetMapping("/blak_pessoa")
    public String abrirBlack(Pessoa pessoa) {
        return "Blak_Hood";
    }
}
