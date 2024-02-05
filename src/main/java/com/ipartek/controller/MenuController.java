package com.ipartek.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ipartek.model.Dificultad;
import com.ipartek.model.Receta;
import com.ipartek.repository.DificultadRepository;
import com.ipartek.repository.RecetaRepository;

@Controller
public class MenuController {

	
	@Autowired
	private RecetaRepository recetaRepo;
	@Autowired
	private DificultadRepository dificultadRepo;
	
	@RequestMapping("/menu_recetas")
	public String menu_recetas() {
	
		return "redirect:/";
	}
	
	@RequestMapping("/menu_insertar")
	public String menu_insertar(Model model) {
		
		List<Dificultad> listaDifilcutades = dificultadRepo.findAll();

		model.addAttribute("atr_lista_difilcutades", listaDifilcutades);
		model.addAttribute("objeto_entidad", new Receta());

		return "insertar";
	}
	
}
