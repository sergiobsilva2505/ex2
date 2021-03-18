package br.com.ednilson.cicero.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
		System.out.println(tarefa.toString());
		if (result.hasFieldErrors("descrição")) {
			return "tarefa/formulario";
		} 
		
		tarefaService.adiciona(tarefa);
		return "tarefa/adicionada";
	}
	
	@RequestMapping(value="/listaTarefa", method = RequestMethod.GET)
	public String listaTarefa(Model model) {
		List<Tarefa> lista = tarefaService.lista();
		model.addAttribute("tarefas", lista);
		return "tarefa/listaTarefa";
	}
}
