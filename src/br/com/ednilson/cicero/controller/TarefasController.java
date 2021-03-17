package br.com.ednilson.cicero.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.ednilson.cicero.dao.JpaTarefaDao;
import br.com.ednilson.cicero.dao.TarefaDao;
import br.com.ednilson.cicero.entities.Tarefa;

@Transactional
@Controller
@RequestMapping("/boasVindas")
public class TarefasController {
	
	@Autowired
	//@Qualifier("JpaTarefaDao")
	

	@RequestMapping()
	public String form() {
		return "boasVindas";
	}

	@RequestMapping("adicionaTarefa")
	public String adicionaTarefa(Tarefa tarefa, BindingResult result) {

		if (result.hasFieldErrors("descricao")) {
			System.out.println("Erro desc!");
			return "tarefa/formulario";
		}

		dao.adiciona(tarefa);
		System.out.println("Adicionado!!");
		return "tarefa/adicionada";
	}

	@RequestMapping("listaTarefas")
	public ModelAndView listaTarefa() {
		List<Tarefa> tarefas = dao.lista();
		ModelAndView mv = new ModelAndView("tarefa/lista");
		mv.addObject("tarefas", tarefas);
		return mv;
	}

}
