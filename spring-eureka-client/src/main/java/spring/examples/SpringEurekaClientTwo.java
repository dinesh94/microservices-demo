package spring.examples;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringEurekaClientTwo {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "spring-eureka-client-two");
		SpringApplication.run(SpringEurekaClientTwo.class, args);
	}
}

@RestController
class SpringEurekaClientTwoRestController {

	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping("/clientTwo/service-instances/{applicationName}")
	public List<ServiceInstance> serviceInstancesByApplicationName(@PathVariable String applicationName) {
		return this.discoveryClient.getInstances(applicationName);
	}
}