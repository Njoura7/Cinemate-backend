package dev.njoura.Cinemate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CinemateApplication {

	public static void main(String[] args) {
		SpringApplication.run(CinemateApplication.class, args);


	}

}
