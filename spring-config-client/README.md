This is a client application for spring config client 

The property files are obtained from spring config server, so we have to make sure our spring-config-server is running before we run this.
Server - http://localhost:8888/

We have two files on server directory configured in spring-config-server project 
Directory - D:\micro-spring\config-files
files :-
	spring-zuul-client-dev.yml
	spring-zuul-client-prod.yml

This file name is convention e.g - "spring-zuul-client" is the app name & "dev" is a profile =   spring-zuul-client-dev.yml

we have to define below configuration here at client side inside application.properties
spring.cloud.config.uri=http://localhost:8888
spring.application.name=spring-zuul-client
spring.profiles.active=dev

You can also do more dynamic here, e.g. project name by setting up project name in system property or system environment variable
Refer https://spring.io/blog/2015/01/13/configuring-it-all-out-or-12-factor-app-style-configuration-with-spring	

For more refer
- https://spring.io/guides/gs/centralized-configuration/
- https://cloud.spring.io/spring-cloud-config/spring-cloud-config.html