package br.com.ednilson.cicero.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.ednilson.cicero.entities.Tarefa;

@Repository
public class JpaTarefaDao implements TarefaDao {

	@PersistenceContext
	private EntityManager manager;

	public void adiciona(Tarefa tarefa) {
		manager.persist(tarefa);
	}

	public List<Tarefa> lista() {
		System.out.println(manager.createQuery("select t from Tarefa t").getResultList());
		 return manager.createQuery("select t from Tarefa t").getResultList();
	}

}
