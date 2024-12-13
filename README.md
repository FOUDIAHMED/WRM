# WRM - Waiting Room Management API

## Table of Contents
1. [Description](#description)
2. [Features](#features)
3. [Technologies Used](#technologies-used)
4. [Project Structure](#project-structure)
5. [Setup and Installation](#setup-and-installation)
6. [API Endpoints](#api-endpoints)
7. [Configuration](#configuration)
8. [Testing](#testing)
9. [Deployment](#deployment)
10. [Contributing](#contributing)
11. [License](#license)

## Description
WRM (Waiting Room Management) is a centralized API service designed to efficiently manage visitor queues for various organizations such as medical offices, public services, and businesses. This system allows for dynamic visitor management, customizable scheduling algorithms, and performance analytics to optimize waiting room operations.

## Features
1. Dynamic Visitor Management
   - Track visitor states: Waiting, In Progress, Finished, Cancelled
2. Customizable Scheduling Algorithms
   - First-In-First-Out (FIFO)
   - Priority-based (HPF)
   - Shortest Job First (SJF)
3. Customizable Schedules and Capacity
   - Set maximum capacities for each day of the week
   - Define service hours (continuous, morning, or afternoon)
4. Performance Statistics
   - Generate KPIs such as satisfaction rates, average waiting times, and visitor turnover

## Technologies Used
- Spring Boot
- Spring Data JPA
- Spring Web
- ModelMapper or MapStruct
- MySQL (running in Docker container)
- Lombok
- JUnit and Mockito for testing
- Swagger for API documentation

## Project Structure
+---src
ª   +---main
ª   ª   +---java
ª   ª   ª   +---ahmed
ª   ª   ª       +---foudi
ª   ª   ª           +---MRW
ª   ª   ª               +---config
ª   ª   ª               +---controllers
ª   ª   ª               +---dao
ª   ª   ª               +---dto
ª   ª   ª               ª   +---error
ª   ª   ª               ª   +---visitdto
ª   ª   ª               ª   +---visitorDTO
ª   ª   ª               ª   +---waitingroomDTO
ª   ª   ª               +---entities
ª   ª   ª               +---exceptions
ª   ª   ª               ª   +---visit
ª   ª   ª               ª   +---visitor
ª   ª   ª               ª   +---waitingroom
ª   ª   ª               +---mapper
ª   ª   ª               +---services
ª   ª   ª                   +---impl
ª   ª   ª                   +---interfaces
ª   ª   +---resources
ª   ª       +---static
ª   ª       +---templates
ª   +---test
ª       +---java
ª       ª   +---ahmed
ª       ª       +---foudi
ª       ª           +---MRW
ª       ª               +---services
ª       +---resources
+---target
    +---classes
    ª   +---ahmed
    ª       +---foudi
    ª           +---MRW
    ª               +---config
    ª               +---controllers
    ª               +---dao
    ª               +---dto
    ª               ª   +---error
    ª               ª   +---visitdto
    ª               ª   +---visitorDTO
    ª               ª   +---waitingroomDTO
    ª               +---entities
    ª               +---exceptions
    ª               ª   +---visit
    ª               ª   +---visitor
    ª               ª   +---waitingroom
    ª               +---mapper
    ª               +---services
    ª                   +---impl
    ª                   +---interfaces
    +---generated-sources
    ª   +---annotations
    ª       +---ahmed
    ª           +---foudi
    ª               +---MRW
    ª                   +---mapper
    +---generated-test-sources
    ª   +---test-annotations
    +---maven-archiver
    +---maven-status
    ª   +---maven-compiler-plugin
    ª       +---compile
    ª       ª   +---default-compile
    ª       +---testCompile
    ª           +---default-testCompile
    +---test-classes

## Setup and Installation
1. Clone the repository
2. Ensure you have Java 11+ and Maven installed
3. Set up MySQL in a Docker container
4. Configure the application.yml file with your database credentials
5. Run `mvn clean install` to build the project
6. Run `mvn spring-boot:run` to start the application

## API Endpoints
- `POST /api/visitors`: Add a new visitor
- `PUT /api/visitors/{id}`: Update visitor status
- `GET /api/visitors`: Get all visitors (with pagination)
- `GET /api/statistics`: Get waiting room statistics

For a complete list of endpoints, please refer to the Swagger documentation available at `http://localhost:8080/swagger-ui.html` when the application is running.

## Configuration
The application uses YAML configuration files with different profiles:
- `application.yml`: Default configuration


To activate a specific profile, use the `spring.profiles.active` property when running the application.

## Testing
- Unit tests: `mvn test`
- Integration tests: `mvn integration-test`

## Deployment
1. Build the application: `mvn clean package`
2. The resulting JAR file can be found in the `target/` directory
3. Run the JAR file: `java -jar target/wrm-0.0.1-SNAPSHOT.jar`

## Contributing
1. Fork the repository
2. Create your feature branch: `git checkout -b feature/my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin feature/my-new-feature`
5. Submit a pull request