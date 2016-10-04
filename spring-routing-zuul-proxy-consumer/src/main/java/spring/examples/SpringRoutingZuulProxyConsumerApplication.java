package spring.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringRoutingZuulProxyConsumerApplication {

	@RequestMapping(value = "/available")
	public String available() {
		System.out.println("SpringRoutingZuulProxyConsumerApplication.available()");
		return "Spring in Action";
	}

	@RequestMapping(value = "/checked-out")
	public String checkedOut() {
		System.out.println("SpringRoutingZuulProxyConsumerApplication.checkedOut()");
		return "Spring Boot in Action";
	}

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "spring-routing-zuul-proxy-consumer");
		SpringApplication.run(SpringRoutingZuulProxyConsumerApplication.class, args);
	}
}
