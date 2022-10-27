package com.example.oficinaco.jpa.dao;
import com.example.oficinaco.jpa.entidade.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueDao extends JpaRepository<Estoque, Integer> {

}
