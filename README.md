# Spring Boot JPA Basics

This repository contains my learning journey and implementation of the basics of Spring Boot JPA (Java Persistence API). Below is an overview of the concepts and functionalities explored in this project.

## Key Features
- **Spring Boot Setup:** Configured a basic Spring Boot application with JPA integration.
- **Entity Creation:** Created a `User` entity to represent database objects.
- **CRUD Operations:**
  - **Create:** Saved single and multiple `User` objects to the database.
  - **Read:** Retrieved data using methods like `findById()` and `findAll()`.
  - **Update:** Updated existing records in the database.
  - **Delete:** Deleted individual and all records from the database.
- **Repository Usage:** Utilized `UserRepository`, which extends `JpaRepository`, to simplify database operations.
- **Component Scanning:** Configured `@ComponentScan` for proper Spring Boot package management.

## Prerequisites
- **Java 8 or above**
- **Spring Boot**
- **Maven**
- **MySQL or any other relational database**
- **IDE:** Eclipse, IntelliJ, or any preferred IDE with Git integration

## Getting Started
### Clone the Repository
```bash
git clone https://github.com/yourusername/spring-boot-jpa-basics.git
cd spring-boot-jpa-basics
```

### Configure Database
Update the `application.properties` file with your database credentials:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

### Run the Application
Use the following command to run the application:
```bash
mvn spring-boot:run
```

## Code Highlights
### Save a Single User
```java
User user = new User();
user.setName("Ramkumar");
user.setCity("Kalaburagi");
user.setStatus("I am a Java Programmer");
User savedUser = userRepository.save(user);
System.out.println(savedUser);
```

### Save Multiple Users
```java
List<User> users = List.of(user1, user2);
Iterable<User> result = userRepository.saveAll(users);
result.forEach(System.out::println);
```

### Update a User
```java
Optional<User> optionalUser = userRepository.findById(1);
if (optionalUser.isPresent()) {
    User user = optionalUser.get();
    user.setName("Updated Name");
    userRepository.save(user);
}
```

### Delete a User
```java
userRepository.deleteById(1);
```

### Retrieve All Users
```java
Iterable<User> users = userRepository.findAll();
users.forEach(System.out::println);
```

## Learnings
- Basic setup of Spring Boot with JPA.
- CRUD operations using `JpaRepository`.
- Using `Optional` to handle potential null values.
- Managing database interactions using Spring Data JPA.
- Importance of component scanning and proper application context configuration.

## Future Improvements
- Implement custom queries using JPQL and Native SQL.
- Add service and controller layers for better architecture.
- Explore advanced features like pagination and sorting.

