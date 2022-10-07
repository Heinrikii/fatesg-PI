package com.example.oficinaco.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoDao extends JpaRepository<Servico, Integer>{

}
