# CICD-1 Lab 1 - Order Service

Order Service runs on port 8082.

## Endpoints

- GET /orders
- POST /orders

## Architecture

Browser / Swagger

+--> Catalog Service :8081 --> temporary Product List<>

+--> Order Service :8082 --> temporary Order List<>

The services are stored in separate GitHub repositories.

The `productId` in an order refers to a product owned by the Catalog Service, but there is no network call between the services yet.

Catalog Service repository:
https://github.com/d4nv/cicd1-catalog-service