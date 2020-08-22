package io.github.jesseduarte.vendas;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {
	
	/*injetando o metodo applicationName, porem irei utilizar o do application.properties
	 
	@Autowired
	@Qualifier("applicationName")//Injetando a String do MInhaConfiguration nessa variavel
	*/
	@Value("${application.name}")
	private String applicationName;
	
	@GetMapping("/hello")
	public String helloWorld() {
		return applicationName;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}
}