# PayFlow — Real-Time Payment Processing Platform

A portfolio-grade fintech demo built with Java, Spring Boot, Spring Data JPA, MySQL, React, Redis, Kafka, Docker, JWT authentication, concurrency controls, microservices, REST APIs and GitHub Actions CI/CD.

## Services
- Gateway: 8080
- Auth: 8081
- Account: 8082
- Payment: 8083
- Transaction: 8084
- Notification: 8085
- MySQL: 3306
- Redis: 6379
- Kafka: 9092

## Run
```bash
docker compose up --build
```
Open http://localhost:5173

Demo login: `demo@payflow.local` / `Password@123`

## Architecture
React -> API Gateway -> Auth / Account / Payment / Transaction
Payment -> Account REST + Redis idempotency + Kafka events
Kafka -> Transaction + Notification consumers
MySQL is shared for this portfolio demo; each service owns its tables/schema logically.
