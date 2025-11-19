# Quiz App Backend

## Description
This is the backend of a Quiz Application built with **Spring Boot**, **Spring Data JPA**, and **REST APIs**.  
It supports **admin functionalities** (adding questions, creating quizzes) and **user functionalities** (attempting quizzes and calculating results).  

> This backend can be extended to a **microservices architecture** by separating admin and user functionalities into independent services.

---

## Features
- Add, update, and fetch quiz questions (Admin)
- Create quizzes based on categories
- Fetch quiz questions for users
- Submit user responses and calculate quiz results
- RESTful APIs with JSON request/response
- JPA/Hibernate for database persistence

---

## Tech Stack
- **Backend:** Java, Spring Boot, Spring Data JPA
- **Database:** MySQL / H2 (can be configured)
- **Build Tool:** Maven
- **API:** RESTful endpoints with `@RestController`
- **Optional:** Lombok for boilerplate reduction

---

## API Endpoints

### QuestionController
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/question/allQuestions` | Get all questions |
| GET | `/question/category/{category}` | Get questions by category |
| POST | `/question/add` | Add a new question |

### QuizController
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/quiz/create` | Create a quiz with category, number of questions, and title |
| GET | `/quiz/get/{id}` | Get quiz questions for a user (by quiz ID) |
| POST | `/quiz/submit/{id}` | Submit user responses and calculate score |

---

## Database Design
**Tables:**
- `quiz` → id, title, questions (many-to-many)  
- `question` → id, questionTitle, options, rightAnswer  
- `response` → id, questionId, userResponse  

---

## Architecture Diagram
> You can create a **simple architecture diagram in Figma**:  

1. **Admin Service**  
   - Handles: Add Questions, Create Quiz  
   - Connects to Quiz & Question DB tables  

2. **User Service**  
   - Handles: Fetch Quiz, Submit Responses, Calculate Result  
   - Connects to Quiz & Question DB tables  

3. **Database**  
   - Shared or separate depending on microservice setup  

**Diagram example:**  

<img width="631" height="641" alt="image" src="https://github.com/user-attachments/assets/43dfbc0e-6026-4185-872d-8be49b1e1558" />



## How to Run
1. Clone the repo
git clone - https://github.com/shriharimohole3693/quiz-app-backend-using-springboot
2. Configure database in `application.properties` as shown below for mysql

spring.application.name=quizapp
spring.datasource.url=jdbc:mysql://localhost:3306/quizapp
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class.name=com.mysql.cj.jdbc.Driver

#Hibernate Property Here
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL8Dialect

#Hibernate auto ddl
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show_sql=true
  
3. Build & run with Maven
4. Test endpoints with Postman or frontend client

---

## Future Improvements
- Implement JWT authentication for users/admin
- Add microservices separation with independent databases
- Add Swagger/OpenAPI documentation
- Add caching for faster quiz fetch
- Implement real-time quiz timer for users

---

## Author
- Shriahri Mohole
