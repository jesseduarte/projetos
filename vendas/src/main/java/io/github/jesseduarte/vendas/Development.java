package io.github.jesseduarte.vendas;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

//interface criada para criar anotações customizadas para o amb de desenv

@Target(ElementType.TYPE) //Só pode ser para classe!
@Retention(RetentionPolicy.RUNTIME)
@Configuration
@Profile("development")
public @interface Development {
	
}
