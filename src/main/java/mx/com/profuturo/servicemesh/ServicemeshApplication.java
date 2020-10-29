package mx.com.profuturo.servicemesh;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@SpringCloudApplication
@Configuration
@EnableFeignClients
public class ServicemeshApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServicemeshApplication.class, args);
	}

}
