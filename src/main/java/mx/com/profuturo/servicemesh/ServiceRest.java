package mx.com.profuturo.servicemesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceRest {

	@Autowired(required = false)
	private FeignCliente fc;
	

	public String feingClient() {
		return fc.getUser("pending").toString(); 
	}
	
}
