in.sitecontrol.net

Why not nginx ?


Spring Config Server
	- e.g. i18n

Spring Cloud Netflix Stack - http://projects.spring.io/spring-cloud/spring-cloud.html

- Service Discovery (Eureka)
- Circuit Breaker (Hystrix)
- Intelligent Routing (Zuul) 
- Client Side Load Balancing (Ribbon)


 Feign offers a solution to dynamically generate clients from the interface. Additional benefit is that we can keep the signature of the service and client identical
https://exampledriven.wordpress.com/2016/07/01/spring-cloud-eureka-ribbon-feign-example/


Install spring-cloud-cli
	how to instal Spring Boot CLI
	http://repo.spring.io/release/org/springframework/boot/spring-boot-cli/1.4.1.RELEASE/spring-boot-cli-1.4.1.RELEASE-bin.zip

		http://www.journaldev.com/8195/spring-boot-cli-setup-and-helloworld-example
		
		spring --version

Cloud Config
Config Client
spring-cloud-config Client

 Config Server
Central management for configuration via a git or svn backend

 Zookeeper Configuration
Configuration management with Zookeeper and spring-cloud-zookeeper-config

 Consul Configuration
Configuration management with Hashicorp Consul
		
spring-cloud-config Client - https://cloud.spring.io/spring-cloud-config/spring-cloud-config.html
Config Server

Consul Configuration - @EnableDiscoveryClient
https://cloud.spring.io/spring-cloud-consul/



nginx kubernetes eureka consul.io

Azure VM 
Docker extension
https://docs.docker.com/engine/security/https/

	
Step 
1. hello world spring boot microservice
2. 


nginx - OSS

http://projects.spring.io/spring-cloud/spring-cloud.html

Features
Spring Cloud focuses on providing good out of box experience for typical use cases and extensibility mechanism to cover others.

Distributed/versioned configuration
Service registration and discovery
Routing
Service-to-service calls
Load balancing
Circuit Breakers
Global locks
Leadership election and cluster state
Distributed messaging
