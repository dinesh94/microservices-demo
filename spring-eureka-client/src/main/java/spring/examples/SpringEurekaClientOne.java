package spring.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class SpringEurekaClientOne {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "spring-eureka-client-one");
		SpringApplication.run(SpringEurekaClientOne.class, args);
	}
}

@RestController
class SpringEurekaClientOneController {

	private static Logger log = LoggerFactory.getLogger(SpringEurekaClientOneController.class);
	
	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping("/clientOne/service-instances/{applicationName}")
	public List<ServiceInstance> serviceInstancesByApplicationName(@PathVariable String applicationName) {
		return this.discoveryClient.getInstances(applicationName);
	}
	

	  @RequestMapping(value = "/greeting")
	  public String greet() {
	    log.info("Access /greeting");

	    List<String> greetings = Arrays.asList("Hi there", "Greetings", "Salutations");
	    Random rand = new Random();

	    int randomNum = rand.nextInt(greetings.size());
	    return greetings.get(randomNum);
	  }
}