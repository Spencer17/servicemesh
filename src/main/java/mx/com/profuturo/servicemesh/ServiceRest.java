package mx.com.profuturo.servicemesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ServiceRest {

	@Autowired(required = false)
	private FeignCliente fc;
	

	public String feingClient() {
		return fc.getUser("pending").toString(); 
	}
	
	@HystrixCommand(fallbackMethod = "defaultGreeting")
    public String falla() throws Exception {
		throw new Exception("Exception message");
    }
 
    private String defaultGreeting() {
        return "Hello Falla User!";
    }
}
