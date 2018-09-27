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
//		RoleRepository roleRepository =ctx.getBean(RoleRepository.class);
//		Role roleUser = new Role("ROLE_USER");
//		Role roleAdmin = new Role("ROLE_ADMIN");
//		roleRepository.save(roleUser);
//		roleRepository.save(roleAdmin);
//		
//		UserRepository userRepository = ctx.getBean(UserRepository.class);
//		Utilisateurs user= new Utilisateurs("user", "password1", true);
//		user.setRoles(Arrays.asList(roleUser));
//		userRepository.save(user);
//		Utilisateurs admin= new Utilisateurs("admin", "password2", true);
//				admin.setRoles(Arrays.asList(roleUser,roleAdmin));
//				userRepository.save(admin);
		
	}
}
