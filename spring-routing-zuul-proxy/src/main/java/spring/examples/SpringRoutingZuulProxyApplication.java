package spring.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import spring.examples.filters.SimpleFilter;

@EnableZuulProxy
@SpringBootApplication
public class SpringRoutingZuulProxyApplication {

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "spring-routing-zuul-proxy");
		SpringApplication.run(SpringRoutingZuulProxyApplication.class, args);
	}

	@Bean
	public SimpleFilter simpleFilter() {
		return new SimpleFilter();
	}
}
