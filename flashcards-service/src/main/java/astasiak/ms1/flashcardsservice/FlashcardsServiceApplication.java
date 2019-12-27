package astasiak.ms1.flashcardsservice;

import astasiak.ms1.flashcardsservice.db.FlashcardsMemoryRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class FlashcardsServiceApplication {

	@Bean
	public FlashcardsMemoryRepository createRepository() {
		return new FlashcardsMemoryRepository();
	}


	public static void main(String[] args) {
		SpringApplication.run(FlashcardsServiceApplication.class, args);
	}

}
