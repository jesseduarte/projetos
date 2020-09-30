package io.github.jesseduarte.vendas;

import org.springframework.context.annotation.Configuration;


//Para essa classe so rodar em amb de desenv tenho que colocar: @Profile("development")
//Usando a classe Development.java e a anotação que criamos la, substituiriamos o 
//@Profile("development") por @Development

@Configuration
public class MinhaConfiguration {
	
	//Determina configs gerais da aplicacao...
	//Se fosse configs de banco, seria dadosConfiguration
	//Se fosse de seguranca, seria securityConfiguration
	
	
	/*Eliminando esse codigo pq inseri ele no application.properties
	 * 
	 
	@Bean(name = "applicationName") //Nome customizado. Será visto em qualquer contexto da aplicacao.
	public String applicationName() {
		return "Sistema de vendas";
	}
	*/
}

//Podemos chamar o bean de um objeto/metodo da classe Configuration. Usou eles, logo esta 
//fzd injecao de dep. O Bean tambem pode ser uma conexao com o banco, um correio de email, 
//etc.