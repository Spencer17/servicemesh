package mx.com.profuturo.servicemesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerRest {

	@Value("${valor1}")
	private String variable;

	@Autowired
	private ServiceRest serviceRest;

	public ServiceRest getServiceRest() {
		return serviceRest;
	}

	public void setServiceRest(ServiceRest serviceRest) {
		this.serviceRest = serviceRest;
	}

	@GetMapping("/holaMundo")
	public String feingClient() {
		return serviceRest.feingClient();
	}
	
	@GetMapping("/falla")
	public String falla() throws Exception {
		return serviceRest.falla();
	}
}
