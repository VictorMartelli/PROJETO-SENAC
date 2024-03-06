package com.projeto.senac.demo.controller;

import com.projeto.senac.demo.dao.PessoaRepository;
import com.projeto.senac.demo.model.Pessoa;
import com.projeto.senac.demo.model.RoleEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public  class CadastrarPessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping("/cad_pessoa")
    public String abrirCadastroPessoa(Pessoa pessoa) {
        return "cadastro_pessoa";
    }

    @PostMapping("/add_pessoa")
    public String addPessoa(Pessoa pessoa){

        BCryptPasswordEncoder cript = new BCryptPasswordEncoder();
        pessoa.setSenha(cript.encode(pessoa.getSenha()));
        pessoa.setRole(RoleEnum.USER);

        pessoaRepository.save(pessoa);
        return "redirect:/";
    }
}