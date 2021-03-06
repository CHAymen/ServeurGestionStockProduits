package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Utilisateurs;
@Repository
public interface UserRepository extends JpaRepository<Utilisateurs, Long>{
	Utilisateurs findByUsername(String username);

}
