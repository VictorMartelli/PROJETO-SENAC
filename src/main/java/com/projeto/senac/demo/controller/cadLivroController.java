package com.projeto.senac.demo.controller;

import com.projeto.senac.demo.dao.LivroRepository;
import com.projeto.senac.demo.model.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cLivro")
public class cadLivroController {

    @Autowired
    private LivroRepository livroRepository;

    @GetMapping
    public String abrirCadlivro(Livro livro){
        return "cadLivro";
    }

    @PostMapping("/add_livro")
    public String salvarCadLivro(Livro livro){
        livroRepository.save(livro);
        return "redirect:/";
    }
}
