package br.com.ednilson.cicero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ednilson.cicero.dao.TarefaDao;

@Service
public class TarefaService {
	
	@Autowired
	private TarefaDao dao;

}
