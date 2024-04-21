package dev.conmac.runnerz;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dev.conmac.runnerz.run.Location;
import dev.conmac.runnerz.run.Run;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		log.info("Application started...");
	
	}

	@Bean
	CommandLineRunner runner () {
		return args -> {
			Run run = new Run(1, LocalDateTime.now().getDayOfWeek()  ,"Morning Run", LocalDateTime.now(), LocalDateTime.now().plusHours(1), 10, Location.OUTDOOR);
			log.info("Run: {}", run);
		};
	}

}
