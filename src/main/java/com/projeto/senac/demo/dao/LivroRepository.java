package com.projeto.senac.demo.dao;

import com.projeto.senac.demo.model.Pessoa;
import com.projeto.senac.demo.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {
}
