package br.com.ednilson.cicero.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.ednilson.cicero.entities.Tarefa;
import br.com.ednilson.cicero.service.TarefaService;

@Transactional
@Controller
@RequestMapping("/boasVindas")
public class TarefasController {
	
	@Autowired
	private TarefaService tarefaService;

//	@RequestMapping("adicionaTarefa")
//	public String adicionaTarefa(Tarefa tarefa, BindingResult result){
//		
//		if (result.hasFieldErrors("descricao")){
//			System.out.println("Erro desc!");
//			return "tarefa/formulario";
//		}
//		
//		tarefaService.adiciona(tarefa);
//		System.out.println("Adicionado!!");
//		return "tarefa/adicionada";
//	}

	@RequestMapping("listaTarefas")
	public ModelAndView listaTarefa() {
		List<Tarefa> tarefas = tarefaService.lista();
		ModelAndView mv = new ModelAndView("tarefa/lista");
		mv.addObject("tarefas", tarefas);
		return mv;
	}
	
//	public ModelAndView listaTarefas() {
//		List<Tarefa> lista = tarefaService.findAll();
//		model.addAttribute("veiculos", lista);
//		return "veiculos";
//
//	}

}
