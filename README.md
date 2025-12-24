# 🏥 Hospital Management System (Spring Boot)

A **Hospital Management System (HMS)** built using **Spring Boot** to manage and automate core hospital operations such as patient records, doctor management, appointments, and billing.  
This project is designed following **RESTful architecture**, **layered design principles**, and industry best practices.

---

## 📌 Project Overview

The Hospital Management System provides a backend solution for healthcare institutions to efficiently manage hospital workflows.  
It exposes secure REST APIs that can be integrated with any frontend (Web / Mobile).

This project is suitable for:
- Academic / Final Year Projects
- Backend Development Practice
- Spring Boot & REST API Learning
- Resume & Internship Showcases

---

## ✨ Features

- 👤 Patient Registration & Management  
- 🩺 Doctor & Staff Management  
- 📅 Appointment Scheduling  
- 🧾 Billing & Payment Records  
- 🔐 Role-Based Authentication & Authorization  
- 📊 CRUD Operations with Validation  
- 🌐 RESTful APIs  
- 🗄 Persistent Data Storage  

---

## 🛠 Tech Stack

### Backend
- Java  
- Spring Boot  
- Spring MVC  
- Spring Data JPA  
- Spring Security  

### Database
- MySQL / PostgreSQL  

### Tools & Libraries
- Hibernate  
- Maven  
- Lombok  
- Postman (API Testing)  

---

## 🧱 Project Architecture
```bash
src/main/java
├── controller
├── service
├── repository
├── entity
├── dto
├── exception
└── config
```

- **Controller Layer** → Handles API requests  
- **Service Layer** → Business logic  
- **Repository Layer** → Database interaction  
- **Entity/DTO** → Data modeling  
- **Config & Security** → Authentication & authorization  

---

## 🔐 Security

- Spring Security for authentication
- Role-based access control (Admin / Doctor / Patient)
- Secure API endpoints
- Input validation & exception handling

---

## ⚙️ Setup & Installation

### Prerequisites
- Java 17+  
- Maven  
- MySQL / PostgreSQL  
- IDE (IntelliJ / Eclipse)

### Steps
1. Clone the repository
```bash
   git clone https://github.com/VivekYadavOnGit/hospital-management-system.git
```
2. Configure database in application.properties
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/hms
spring.datasource.username=root
spring.datasource.password=yourpassword
```

3. Run the application
```bash
mvn spring-boot:run
```

4. Access APIs
```bash
http://localhost:8080/api
```

---

🧪 API Testing
---

Use Postman or Swagger UI

Supports JSON-based request/response

Clean REST endpoint design

---

🚀 Future Enhancements
---

Swagger/OpenAPI documentation

Frontend integration (React / Angular)

Payment gateway integration

Email & SMS notifications

Medical report upload/download

---

🤝 Contributing
---

Contributions are welcome!
Feel free to fork the repository and submit a pull request.

---

📄 License
---
This project is licensed under the MIT License.

---

👨‍💻 Author
---

Vivek Yadav

Full Stack Developer

Spring Boot | React | Node.js

📫 Email: vivekyadavatwork@gmail.com

🌐 Portfolio: https://vivekyadavonline.vercel.app

