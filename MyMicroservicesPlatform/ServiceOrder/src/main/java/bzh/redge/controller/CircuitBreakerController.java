package bzh.redge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bzh.redge.service.BreakerService;

@RestController
public class CircuitBreakerController {

	@Autowired
	private BreakerService bs;
	
	@RequestMapping("/circuitBreaker")
	public String circuitBreaker() {
		return bs.checker();
	}
	
}
