package com.ipartek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ipartek.model.Receta;
import com.ipartek.repository.RecetaRepository;

@Controller
public class MainController {

	@Autowired
	private RecetaRepository recetaRepo;

	@RequestMapping("/")
	public String cargarInicio(Model model) {
		
		List<Receta> listaTodasRecetas = recetaRepo.findAll();

		model.addAttribute("atr_lista_recetas", listaTodasRecetas);

		return "recetas";

	}

}
