package br.com.ednilson.cicero.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ednilson.cicero.dao.TarefaDao;
import br.com.ednilson.cicero.entities.Tarefa;

@Service
public class TarefaService {
	
	@Autowired
	private TarefaDao dao;

	public List<Tarefa> lista() {
		List<Tarefa> list = dao.lista();
		return list;
	}
	
	

}
