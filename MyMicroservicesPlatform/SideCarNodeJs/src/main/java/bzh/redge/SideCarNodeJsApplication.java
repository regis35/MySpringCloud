package bzh.redge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@EnableSidecar
@SpringBootApplication
public class SideCarNodeJsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SideCarNodeJsApplication.class, args);
	}
}