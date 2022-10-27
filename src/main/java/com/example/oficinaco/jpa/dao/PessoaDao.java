package com.example.oficinaco.jpa.dao;

import com.example.oficinaco.jpa.entidade.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaDao extends JpaRepository<Pessoa, Integer> {
}
