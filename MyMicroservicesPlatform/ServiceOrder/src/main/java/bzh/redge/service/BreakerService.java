package bzh.redge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class BreakerService {

	@Autowired
	private RestTemplate restTemplate;
	
	public BreakerService() {
		super();
	}

	@HystrixCommand(fallbackMethod = "failMethod")
	public String checker() {
		
		return restTemplate.getForObject("http://ServiceA/info", String.class);
	}
	
	public String failMethod() {
		return "fail method";
	}
	
}
