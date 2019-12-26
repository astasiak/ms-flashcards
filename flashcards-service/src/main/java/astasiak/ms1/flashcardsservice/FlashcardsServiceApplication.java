package astasiak.ms1.flashcardsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class FlashcardsServiceApplication {

	@Bean
	public FlashcardsRepository createRepository() {
		return new FlashcardsRepository();
	}

	public static void main(String[] args) {
		SpringApplication.run(FlashcardsServiceApplication.class, args);
	}

}
