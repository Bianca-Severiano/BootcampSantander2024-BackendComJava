package com.group.padroes_gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PadroesGofApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesGofApplication.class, args);
	}

}
