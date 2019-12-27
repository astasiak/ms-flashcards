package astasiak.ms1.subscriptionsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SubscriptionsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubscriptionsServiceApplication.class, args);
	}

}
