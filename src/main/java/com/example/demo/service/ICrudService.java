package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Utilisateurs;


public interface ICrudService {

	List<Utilisateurs> getAll();
	Utilisateurs addUtilisateur(Utilisateurs utilisateur);
	Utilisateurs updateUtilisateurs(Utilisateurs utilisateur);
	void deleteUtilisateur(Long id);
}
