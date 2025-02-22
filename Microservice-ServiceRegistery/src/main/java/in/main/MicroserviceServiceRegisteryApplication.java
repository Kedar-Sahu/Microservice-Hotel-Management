package in.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceServiceRegisteryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceServiceRegisteryApplication.class, args);
	}

}
