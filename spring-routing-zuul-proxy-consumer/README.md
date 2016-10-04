1. Run SpringRoutingZuulProxyApplication
2. Run SpringRoutingZuulProxyConsumerApplication
3. Run consumer without proxy - http://localhost:8080/available
4. Run consumer with proxy - http://localhost/spring-routing-zuul-proxy-consumer/available

Observe the zuul proxy serves you the url's as we have mapped below property in zuul proxy application
zuul.routes.spring-routing-zuul-proxy-consumer.url=http://localhost:8080
ribbon.eureka.enabled=false