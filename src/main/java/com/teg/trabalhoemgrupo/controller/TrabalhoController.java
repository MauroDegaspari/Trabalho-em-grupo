package com.teg.trabalhoemgrupo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.teg.trabalhoemgrupo.model.ParticipanteModel;
import com.teg.trabalhoemgrupo.model.TrabalhoModel;
import com.teg.trabalhoemgrupo.repository.ParticipanteRepository;
import com.teg.trabalhoemgrupo.repository.TrabalhoRepository;

@Controller
public class TrabalhoController {
	
	@Autowired
	private TrabalhoRepository repoTrabalho;
	
	@Autowired
	private ParticipanteRepository repoParticipante;

	@RequestMapping(value="/cadastraTrabalho", method=RequestMethod.GET)
	public String form() {
		return "page/formCadastroTrabalho";
	}
	
	// REQUISIÇÃO POST PARA SALVAR NO BANCO DE DADOS
	@RequestMapping(value="/cadastraTrabalho", method=RequestMethod.POST)
	public String form(TrabalhoModel trabalho) {
		
		repoTrabalho.save(trabalho);
		
		return "redirect:/cadastraTrabalho";
	}
	
	// REQUISIÇÃO POST PARA LISTAR NO BANCO DE DADOS
	@RequestMapping("/trabalhos")
	public ModelAndView listaTrabalhos() {
		ModelAndView mv = new ModelAndView("page/index");
		List<TrabalhoModel> trabalhoModel = repoTrabalho.findAll();
		mv.addObject("trabalhos",trabalhoModel);
		return mv;
	}

	//
	@RequestMapping(value="/{codigo}", method=RequestMethod.GET)
	public ModelAndView detalhes(@PathVariable("codigo") long codigo) {
		TrabalhoModel evento = repoTrabalho.findByCodigo(codigo);
		ModelAndView mv = new ModelAndView("page/formParticipante");
		mv.addObject("evento", evento);
		return mv;
	}
	
	
	@RequestMapping(value="/{codigo}", method=RequestMethod.POST)
	public String participantes(@PathVariable("codigo") long codigo, ParticipanteModel participante) {
		TrabalhoModel trabalho = repoTrabalho.findByCodigo(codigo);
		participante.setTrabalho(trabalho);
		repoParticipante.save(participante);
		return "redirect:/{codigo}";
}
	
}
