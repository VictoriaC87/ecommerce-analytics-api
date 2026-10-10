# E-Commerce Analytics API

A RESTful API built with Java and Spring Boot that processes e-commerce sales data to calculate and return business analytics.

This project demonstrates backend software engineering principles, including Object-Relational Mapping (ORM) with Spring Data JPA, relational database initialization, and custom JPQL querying.

## Technologies Used
* **Language:** Java 17
* **Framework:** Spring Boot 3.2.4 (Spring Web, Spring Data JPA)
* **Database:** H2 In-Memory Database
* **Build Tool:** Maven
* **IDE:** Eclipse / VS Code

## Project Architecture
* **Entities:** Maps Object-Oriented Java classes directly to SQL database tables.
* **Repositories:** Extends 'JpaRepository' to handle standard CRUD operations and executes custom '@Query' analytical functions.
* **Controllers:** Exposes REST endpoints to serve data to the web in JSON format.
* **Seed Data:** Automatically builds the schema and populates the database with an e-commerce dataset on startup via 'schema.sql' and 'data.sql'.

## How to Run Locally

1. Clone this repository to your local machine.
2. Open the project in your preferred IDE (Eclipse, IntelliJ, or VS Code) as a Maven project.
3. Allow Maven to download the required Spring Boot dependencies from the 'pom.xml' file.
4. Run the 'AnalyticsApplication.java' file to start the embedded Tomcat server.
5. The API will be hosted locally at 'http://localhost:8080'.

## API Endpoints

Once the application is running, you can access the following endpoints via your web browser or a tool like Postman.

### 1. View All Sales Data
* **URL:** '/api/analytics/all-sales'
* **Method:** 'GET'
* **Description:** Returns the complete, raw dataset of all e-commerce sales records.

### 2. View Total Revenue
* **URL:** '/api/analytics/total-revenue'
* **Method:** 'GET'
* **Description:** Executes a calculation across the database to return the sum of all generated revenue (Price * Quantity).

### 3. View Sales by Category
* **URL:** '/api/analytics/category-sales'
* **Method:** 'GET'
* **Description:** Groups the sales records by their category and returns the total number of items sold per category.

## Database Console
To visually inspect the SQL tables and run your own queries while the app is running, navigate to:
* **URL:** 'http://localhost:8080/h2-console'
* **JDBC URL:** 'jdbc:h2:mem:ecommerce_db'
* **Username:** 'sa'
* **Password:** 'password'