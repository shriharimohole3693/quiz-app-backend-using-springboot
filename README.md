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
