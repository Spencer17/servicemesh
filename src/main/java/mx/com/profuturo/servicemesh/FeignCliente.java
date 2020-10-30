package mx.com.profuturo.servicemesh;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "pets", url = "https://petstore.swagger.io")
public interface FeignCliente {

	@GetMapping("v2/pet/findByStatus")
	public Collection<String> getUser(@RequestParam String status);
}
