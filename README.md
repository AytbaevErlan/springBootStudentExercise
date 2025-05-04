# 🎓 Spring Boot Student Management API

A simple, scalable RESTful API for managing student data built with **Java Spring Boot** and **MySQL** (or H2).



## 🛠 Tech Stack

- Java 17  
- Spring Boot  
- Spring Data JPA  
- Hibernate  
- MySQL (or H2 for testing)  
- Maven  
- Lombok (optional)  

## 🧪 Features

- [x] CRUD operations for **Student** entities  
- [x] **DTOs & Mappers** (via MapStruct or Lombok) for clean data transfer  
- [x] **Age calculation** from date of birth (computed, not stored)  
- [x] **Unique email** validation on create & update  
- [ ] RESTful API endpoints secured with Spring Security (TBD)  
- [ ] Integration tests  
- [ ] Swagger / OpenAPI documentation  



## 🖥️ How to Run

### Prerequisites

- Java 17+  
- MySQL (or use H2 in-memory)  
- Maven  

### Steps

```bash
# Clone the repository
git clone https://github.com/AytbaevErlan/springBootStudentExercise.git
cd springBootStudentExercise

# Configure your database in src/main/resources/application.properties

# Build & run
./mvnw clean install
./mvnw spring-boot:run
```

## The application will start at:
📍 http://localhost:8080

## 📡 API Endpoints

| Method | Endpoint                  | Description                 |
|--------|---------------------------|-----------------------------|
| GET    | `/api/v1/student`         | Retrieve all students       |
| POST   | `/api/v1/student`         | Create a new student        |
| DELETE | `/api/v1/student/{id}`    | Delete a student by ID      |
| PUT    | `/api/v1/student/{id}`    | Update student name & email |

**Example POST body**:

```json
{
  "name": "Jane Doe",
  "email": "jane.doe@example.com",
  "dob": "2001-05-15"
}
```

## 👤 Author
**Erlan Aytbaev**  
📍 Warsaw, Poland

---

## 📌 Notes
✅ Sample data loaded at startup via StudentConfig

🔒 Security and validation enhancements coming soon

🛠️ README will be updated as features progress

