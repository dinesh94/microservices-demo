Ribbon is used for client-side load balancing

1. Run eureka server - spring-eureka-server & brows http://localhost:8761/
2. Run spring-eureka-clients - SpringEurekaClientOne.java & SpringEurekaClientTwo.java
3. Observe applications are registered inside - http://localhost:8761/
4. Check client instance information
	http://localhost:70/clientOne/service-instances/spring-eureka-client-one
	http://localhost:71/clientOne/service-instances/spring-eureka-client-two
	
If both services are running you can pass any application name(spring-eureka-client-one or spring-eureka-client-two)
	/clientOne/service-instances/{applicationName}
Inside controller we have discoveryClient.getInstances(applicationName); which will return thr application information
	
		
	
Reference :-
	https://spring.io/guides/gs/service-registration-and-discovery/
	http://projects.spring.io/spring-cloud/spring-cloud.html#spring-cloud-eureka-server
	https://spring.io/blog/2015/01/20/microservice-registration-and-discovery-with-spring-cloud-and-netflix-s-eureka
		