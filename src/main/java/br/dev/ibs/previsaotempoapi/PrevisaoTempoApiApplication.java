package br.dev.ibs.previsaotempoapi;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.function.Function;

@SpringBootApplication
public class PrevisaoTempoApiApplication {

	public static void main(String[] args) {
//		FunctionalSpringApplication.run(PrevisaoTempoApiApplication.class, args);
	}

	@Bean
	public Function<String, String> ping() {
		return value -> new StringBuilder("# Servidor conectado: ").append(LocalDateTime.now()).toString();
	}

}
