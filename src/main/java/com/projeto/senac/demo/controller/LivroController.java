package com.projeto.senac.demo.controller;

import ch.qos.logback.core.model.Model;
import com.projeto.senac.demo.dao.LivroRepository;
import com.projeto.senac.demo.dao.PessoaRepository;
import com.projeto.senac.demo.model.Livro;
import com.projeto.senac.demo.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Controller
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @GetMapping("/liv_pessoa")
    public String abrirLivro (Pessoa pessoa){
        return "livros";
    }

}
