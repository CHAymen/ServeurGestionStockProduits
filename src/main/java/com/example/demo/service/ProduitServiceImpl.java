package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Produit;
@Service
public class ProduitServiceImpl implements IProduitService {
	private List<Produit> produits;
	public  ProduitServiceImpl() {
	produits = new ArrayList<Produit>();
	produits.add(new Produit("livre",50,20));
	produits.add(new Produit("cahier",20,10));
	produits.add(new Produit("stylo",10,5));
	}
	@Override
	public List<Produit> getProduits() {
	
		return produits;
	}

	@Override
	public Produit addProduit(Produit produit) {
		produits.add(produit);
		return produit;
	}

	@Override
	public Produit updateProduit(Produit produit) {
		produits.remove(produit);
		produits.add(produit);
		return produit;
	}

	@Override
	public void deleteProduit(String ref) {
		Produit produit = new Produit();
		produit.setRef(ref);
		produits.remove(produit);

	}

}
