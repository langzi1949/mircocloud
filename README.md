# Microcloud Project

This is a practice project based on Spring Cloud 2024.x and Spring Boot 3.4.1, using JDK 21. The purpose of this project is to review and practice the development concepts and techniques learned over the past few years. 
This project does not contain any business-related logic and is purely for hands-on practice and review.

## Table of Contents

- [Introduction](#introduction)
- [Technologies Used](#technologies-used)
- [Prerequisites](#prerequisites)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This project is a Spring Cloud-based application designed to help developers review and practice various development concepts and techniques. It includes multiple microservices and demonstrates how to use Spring Cloud components to build a distributed system.

## Technologies Used

- **Spring Cloud**: 2024.x
- **Spring Boot**: 3.4.1
- **JDK**: 21

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) 21 installed
- Maven
- An IDE such as IntelliJ IDEA
- 
## Project Structure

The project is organized into multiple microservices, each demonstrating different aspects of Spring Cloud:

- **[microcloud-api](microcloud-api)**: Common API module
- **[microcloud-dept-consumer](microcloud-dept-consumer)**: Consumer service discovery using Eureka
- **[microcloud-dept-provider](microcloud-dept-provider)**: Provider service discovery using Eureka

## Getting Started

To get a local copy up and running, follow these simple steps:

1. **Clone the repository**:
    ```sh
    git clone git@github.com:langzi1949/mircocloud.git
    cd mircocloud
    ```

2. **Build the project**:
    ```sh
    mvn clean install
    ```

3. **Run the services**:
    ```sh
    java -jar xxx.jar
    ```

## Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

Distributed under the MIT License. See `LICENSE` for more information.