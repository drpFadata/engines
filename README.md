# Engines

A Spring Boot demo project showcasing a basic engine management application with modern Java technologies.

## Overview

This is a demonstration project built with Spring Boot 3.4.0 and Java 21, designed to illustrate best practices in building a modern Java application with robust data access, validation, and API capabilities.

## Features

- Spring Boot 3.4.0 with Java 21
- Spring Data JPA for database operations
- Spring Validation for input validation
- RESTful API with Spring Web
- PostgreSQL database integration
- Docker Compose for easy development setup
- Testing with JUnit and Testcontainers

## Getting Started

### Prerequisites

- Java 21 or higher
- Docker and Docker Compose

### Running the Application

1. Clone the repository:
   ```
   git clone https://github.com/drpFadata/engines.git
   cd engines
   ```

2. Start the PostgreSQL database using Docker Compose:
   ```
   docker compose up -d
   ```

3. Run the application:
   ```
   ./gradlew bootRun
   ```

## Development

This project uses Spring Boot's development tools for enhanced developer experience:

- Spring Boot DevTools for automatic restarts
- Spring Boot Actuator for monitoring and management
- Lombok for reducing boilerplate code

## Testing

The project includes a comprehensive test suite using:

- JUnit 5
- Spring Boot Test
- Testcontainers for integration testing with real PostgreSQL instances

To run tests:
```
./gradlew test
```

## Note

This is a demo project created for educational purposes and to showcase Spring Boot capabilities.
