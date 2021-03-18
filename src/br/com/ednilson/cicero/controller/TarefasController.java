package br.com.ednilson.cicero.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.ednilson.cicero.entities.Tarefa;
import br.com.ednilson.cicero.service.TarefaService;

@Transactional
@Controller
public class TarefasController {
	
	@Autowired
	private TarefaService tarefaService;
	
	@RequestMapping("novaTarefa")
	public String form() {
		return "tarefa/formulario";
	}

	@RequestMapping("adicionaTarefa")
	public String adicionaTarefa(Tarefa tarefa, BindingResult result){
		if (result.hasFieldErrors("descrição")) {
			return "tarefa/formulario";
		} 
		
		tarefaService.adiciona(tarefa);
		return "tarefa/adicionada";
	}

	
	
//	public ModelAndView listaTarefas() {
//		List<Tarefa> lista = tarefaService.findAll();
//		model.addAttribute("veiculos", lista);
//		return "veiculos";
//
//	}

}
