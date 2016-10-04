package spring.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RibbonClient(name = "spring-eureka-client-one", configuration = RibbonConfiguration.class)
public class SpringRibbonClientApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "spring-ribbon-client-application");
		SpringApplication.run(SpringRibbonClientApplication.class, args);
	}

}

@RibbonClient(name = "spring-eureka-client-one", configuration = RibbonConfiguration.class)
@RestController
class SpringControllerTwo {

	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/invoke-another-rest-via-ribbon")
	public String hi(@RequestParam(value = "name", defaultValue = "Artaban") String name) {
		String greeting = this.restTemplate.getForObject("http://spring-eureka-client-one/greeting", String.class);
		return String.format("%s, %s!", greeting, name);
	}
}