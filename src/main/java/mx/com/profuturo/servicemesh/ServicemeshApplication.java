package mx.com.profuturo.servicemesh;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class ServicemeshApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServicemeshApplication.class, args);
	}

}
