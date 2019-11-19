# Spring Boot Kotlin Examples

This little project shows some examples how to use the spring project with kotlin.


### Projects:
- Spring cloud config server/client
- Spring cloud service discovery server/client
- Spring actuator
- Spring sleuth
- Spring openfeign
- Spring gateway
- Zipkin (Tracing UI)

---
### Config Repository
- URL: https://github.com/marcowuethrich/spring-kotlin-config.git

To refresh the services you can call the /refresh (POST) endpoint from the actuator project:
- `curl localhost:9001/actuator/refresh -d {} -H "Content-Type: application/json"`

---
### Gateway
- Actuator Endpoints (Routes):
  - http://localhost:8080/actuator/gateway/routes
- Routes:
  - [http://localhost:8080/api/v1/simple-rest-service/**](http://localhost:8080/api/v1/simple-rest-service/**)
  
---
### Rest Service

#### Service 1 (Car)
This little service is the entry point for building a new Card.

 - http://localhost:8080/api/v1/simple-rest-service/cars/build-default-car
 - http://localhost:8080/api/v1/simple-rest-service/cars/supplier/buy-car/smart/yellow

#### Service 2 (Reseller)
The service 2 is a middle service between service 1 and service 2.

#### Service 3 (Supplier)
The last simple rest service is the end of the chain.

---
### Swagger Endpoints

- Service 1: http://localhost:9001/swagger-ui.html

---
### Zipkin

- `docker run -d -p 9411:9411 openzipkin/zipkin`
- http://localhost:9411/zipkin
