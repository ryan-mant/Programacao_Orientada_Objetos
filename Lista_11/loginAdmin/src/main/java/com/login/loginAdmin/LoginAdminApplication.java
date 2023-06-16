package com.login.loginAdmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/login")

public class LoginAdminApplication {
	@GetMapping("/{user}")
	public boolean verificaAdmin(@PathVariable String user){
		if(user.equals("admin")){
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(LoginAdminApplication.class, args);
	}

}
