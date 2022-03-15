package com.jordanschreier.lifewaychallenge;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Starter class for the SpringBoot application.
 *
 * @author Jordan Schreier
 */
@SpringBootApplication
public class LifewayChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LifewayChallengeApplication.class, args);
	}

	/**
	 * The {@link OpenAPI} to be used in the Swagger page.
	 *
	 * @return An {@link OpenAPI}
	 */
	@Bean
	public OpenAPI openAPI() {
		return new OpenAPI().info(new Info()
			.title("Lifeway Java Word Count Challenge")
			.description("Jordan Schreier's submission for Lifeway's software engineer Java code challenge."));
	}

}
