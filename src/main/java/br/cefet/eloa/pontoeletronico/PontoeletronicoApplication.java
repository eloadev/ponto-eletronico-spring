package br.cefet.eloa.pontoeletronico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class PontoeletronicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PontoeletronicoApplication.class, args);
	}
}
