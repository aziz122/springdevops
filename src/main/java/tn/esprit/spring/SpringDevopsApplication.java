package tn.esprit.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringDevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDevopsApplication.class, args);
	}

}
