package bzh.redge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableCircuitBreaker
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableHystrix
@ComponentScan
public class ServiceB {

	public static void main(String[] args) {
		// test
		SpringApplication.run(ServiceB.class, args);
	}
}