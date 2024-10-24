# Observability of Spring Boot with Grafana Stack

Observability of spring boot service using spring actuator, prometheus, grafana, loki,tempo and docker compose support 

![Observability Grafana Stack (1)](https://github.com/user-attachments/assets/cbad7e7e-77e2-40ad-8212-6a5231afdde6)

## Technologies

- [Spring Boot](https://docs.spring.io/spring-boot/index.html)
- [Spring Actuator](https://docs.spring.io/spring-boot/reference/actuator/index.html)
- [Prometheus](https://prometheus.io/)
- [Zipkin](https://zipkin.io/)
- [Loki](https://loki4j.github.io/loki-logback-appender/)
- [Grafana Tempo](https://grafana.com/docs/tempo/latest/)
- [Docker compose](https://docs.docker.com/compose/)

## Setup & Running

- Ensure you have Java 21 and Maven installed on your system
- Clone the repository

```bash
    git clone [repository-url]
```
- Go into the project directory
```bash
   cd [repository-name]
```
- Run the application
```bash
   mvn spring-boot:run
```

## Testing

```bash
   mvn test
```
