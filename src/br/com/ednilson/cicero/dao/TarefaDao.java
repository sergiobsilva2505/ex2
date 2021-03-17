package br.com.ednilson.cicero.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.ednilson.cicero.entities.Tarefa;

@Repository
public interface TarefaDao {

	List<Tarefa> lista();

	void adiciona(Tarefa t);

}
