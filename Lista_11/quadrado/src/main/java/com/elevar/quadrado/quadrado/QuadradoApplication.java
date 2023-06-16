package com.elevar.quadrado.quadrado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/elevar-quadrado")

public class QuadradoApplication {

	@GetMapping("/{numero}")
	public int aoQuadrado(@PathVariable int numero){
		return (int) Math.pow(numero, 2);
	}

	public static void main(String[] args) {
		SpringApplication.run(QuadradoApplication.class, args);
	}

}
