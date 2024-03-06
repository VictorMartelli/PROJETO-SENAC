package com.projeto.senac.demo.dao;

import com.projeto.senac.demo.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
    boolean existsByEmailAndSenha(String email, String senha);

    Pessoa findByEmail(String username);
}