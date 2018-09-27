package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Utilisateurs;
import com.example.demo.repository.UserRepository;
@Service
@Primary
public class CrudServiceImpl implements ICrudService {
	@Autowired
	private UserRepository userRepository;
	@Override
	public List<Utilisateurs> getAll() {
		
		return userRepository.findAll();
	}

	@Override
	public Utilisateurs addUtilisateur(Utilisateurs utilisateur) {
		
		return userRepository.save(utilisateur);
	}

	@Override
	public Utilisateurs updateUtilisateurs(Utilisateurs utilisateur) {
		
		return userRepository.saveAndFlush(utilisateur);
	}

	@Override
	public void deleteUtilisateur(Long id) {
		userRepository.deleteById(id);
		
	}

}
