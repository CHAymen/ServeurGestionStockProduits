package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Produit;
import com.example.demo.repository.ProduitRepository;
@Service
@Primary
public class ProduitServiceImpl implements IProduitService {
	
	@Autowired
	private ProduitRepository produitRepository;

	@Override
	public List<Produit> getProduits() {
	
		return produitRepository.findAll();
	}

	@Override
	public Produit addProduit(Produit produit) {
		
		return produitRepository.save(produit);
	}

	@Override
	public Produit updateProduit(Produit produit) {
	
		return produitRepository.saveAndFlush(produit);
	}

	@Override
	public void deleteProduit(Long id) {
		produitRepository.deleteById(id);

	}

}
