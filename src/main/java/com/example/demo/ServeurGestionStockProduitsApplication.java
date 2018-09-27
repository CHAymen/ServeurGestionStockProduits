package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Role;
import com.example.demo.entity.Utilisateurs;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class ServeurGestionStockProduitsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(ServeurGestionStockProduitsApplication.class, args);
	
		

		
	}
}
