package rh.civil.apirhcivil.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloTeste {

	@GetMapping
	public String helloTeste() {
		return ("Hello Teste");
	}
}
