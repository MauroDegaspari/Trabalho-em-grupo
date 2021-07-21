package com.teg.trabalhoemgrupo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.teg.trabalhoemgrupo.model.TrabalhoModel;
import com.teg.trabalhoemgrupo.repository.TrabalhoRepository;

@Controller
public class TrabalhoController {
	
	@Autowired
	private TrabalhoRepository repo;

	@RequestMapping(value="/cadastraTrabalho", method=RequestMethod.GET)
	public String form() {
		return "page/formTrabalho";
	}
	
	// REQUISIÇÃO POST PARA SALVAR NO BANCO DE DADOS
	@RequestMapping(value="/cadastraTrabalho", method=RequestMethod.POST)
	public String form(TrabalhoModel trabalho) {
		
		repo.save(trabalho);
		
		return "redirect:/cadastraTrabalho";
	}
	
	// REQUISIÇÃO POST PARA SALVAR NO BANCO DE DADOS
	@RequestMapping("/trabalhos")
	public ModelAndView listaTrabalhos() {
		ModelAndView mv = new ModelAndView("page/index");
		List<TrabalhoModel> trabalhoModel = repo.findAll();
		mv.addObject("trabalhos",trabalhoModel);
		return mv;
	}
}