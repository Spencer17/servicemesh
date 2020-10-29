package mx.com.profuturo.servicemesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@SpringCloudApplication
@EnableFeignClients
@Configuration
@EnableAutoConfiguration
public class ServicemeshApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServicemeshApplication.class, args);
	}

}
