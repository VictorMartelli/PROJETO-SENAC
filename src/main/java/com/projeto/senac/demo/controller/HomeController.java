package com.projeto.senac.demo.controller;

import com.projeto.senac.demo.dao.LivroRepository;
/*import com.projeto.senac.demo.dto.LoginDTO;*/
import com.projeto.senac.demo.model.Livro;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class HomeController {

    @Autowired
    LivroRepository livroRepository;

    @GetMapping("/")
    public String abrirIndex(Model model){
        List<Livro> livros = livroRepository.findAll();
        model.addAttribute("livros", livros);
        return "home";
    }

    @GetMapping(value="/logout")
    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/";
    }
}
