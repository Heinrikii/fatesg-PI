package com.example.oficinaco.jpa;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoTeste {
	
	@Autowired
	private ServicoDao servicoDao;
	
	@PostConstruct
	public void executar() {
		
		List<Servico> servicos = servicoDao.findAll();
		
		for(Servico s : servicos) {
			System.out.println(s.getNome());
		}
		
		servicos.forEach(s -> {
			System.out.println(s.getNome());
			System.out.println(s.getId());
			});
		
		servicos.forEach(System.out::println);
		
	}

}
