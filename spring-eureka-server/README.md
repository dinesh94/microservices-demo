1. Run eureka server - spring-eureka-server & brows http://localhost:8761/

Talking to the Registry

Now that we’ve stood up a service registry, let’s stand up a client that both registers itself with the registry and uses the Spring Cloud DiscoveryClient abstraction to interrogate the registry for it’s own host and port. The @EnableDiscoveryClient activates the Netflix Eureka DiscoveryClient implementation. There are other implementations for other service registries like Hashicorp’s Consul or Apache Zookeeper.

For more details refer :- 
	http://projects.spring.io/spring-cloud/spring-cloud.html#spring-cloud-eureka-server
	https://spring.io/blog/2015/01/20/microservice-registration-and-discovery-with-spring-cloud-and-netflix-s-eureka
	https://spring.io/guides/gs/service-registration-and-discovery/
