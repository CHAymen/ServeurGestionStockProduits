package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Produit;

public interface IProduitService {
	List<Produit> getProduits();
	Produit addProduit(Produit produit);
	Produit updateProduit(Produit produit);
	void deleteProduit(Long id);
}
