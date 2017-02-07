package bzh.redge;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import bzh.redge.filter.Filter;

@Configuration
public class GatewayConf {

	@Bean
	public Filter simpleFilter() {
		return new Filter();
	}

}
