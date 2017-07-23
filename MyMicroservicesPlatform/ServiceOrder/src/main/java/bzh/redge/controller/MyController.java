package bzh.redge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {

	@Autowired
	private DiscoveryClient discoveryClient;

	@Autowired
	private RestTemplate restTemplate;

	
	@RequestMapping("/service-instances/{applicationName}")
	public List<ServiceInstance> serviceInstancesByApplicationName(@PathVariable String applicationName) {
		return this.discoveryClient.getInstances(applicationName);
	}

	@RequestMapping("/servicesProduct")
	public void toto() {

		List<ServiceInstance> instances = discoveryClient.getInstances("SERVICEPRODUCT");
		if (instances != null && !instances.isEmpty()) {
			for (ServiceInstance serviceInstance : instances) {
				System.out.println(String.format("http://%s:%d", serviceInstance.getHost(), serviceInstance.getPort()));
			}
		}
	}
	
	@RequestMapping("/serviceProduct")
	public String titi() {
		return restTemplate.getForObject("http://ServiceProduct/info", String.class);
	}
}
