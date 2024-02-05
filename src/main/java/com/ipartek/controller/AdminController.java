package com.ipartek.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ipartek.model.Receta;
import com.ipartek.repository.RecetaRepository;


@Controller
public class AdminController {
	
	@Autowired
	private RecetaRepository recetaRepo;
	
	@RequestMapping("/guardarReceta")
	public String guardarReceta(@ModelAttribute Receta objeto_entidad) {
		
		List<Receta> listaTodasRecetas = recetaRepo.findAll();

		recetaRepo.save(objeto_entidad);
		
		return "redirect:/menu_insertar";
	}
}
