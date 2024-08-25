package br.edu.infnet.apptalesauto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApptalesautoFrontApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApptalesautoFrontApplication.class, args);
	}

}
