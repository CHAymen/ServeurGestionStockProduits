package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Utilisateurs;
import com.example.demo.service.ICrudService;


@RestController
@RequestMapping(name="/crud_user")
public class CrudUserController {
	
	@Autowired
	private ICrudService userService;
	
	@GetMapping
	public List<Utilisateurs> getUtilisateurs(){
		return userService.getAll();
	}
	
	@PostMapping
	public Utilisateurs addUtilisateur(@RequestBody Utilisateurs utilisateur) {
		return userService.addUtilisateur(utilisateur);
	}
	
	@PutMapping
	public Utilisateurs updateProduit(@RequestBody Utilisateurs utilisateur) {
		return userService.updateUtilisateurs(utilisateur);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUtilisateurs(@PathVariable Long id) {
		userService.deleteUtilisateur(id);
	}
	
}
