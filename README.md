# Project-Management-System---Assignment
Sirma Business Consulting -Assignment 
This is a simple project management system API built with Spring Boot.

# Project Management System API

This is a RESTful API for a simple project management system built with Java, Spring Boot, and H2 database.

## Setup Instructions

1. **Clone the repository:**

   ```bash
   git clone https://github.com/your-username/Project_Management_System.git
2. **Import The file in SpringSuiteTool/Eclipse**:

   ![image](https://github.com/khanubaid1800/Project-Management-System---Assignment/assets/99163264/a2a17304-cd89-4f8f-9553-0a2952d2ab76)

3.**Run the project using Spring boot App:**
![run](https://github.com/khanubaid1800/Project-Management-System---Assignment/assets/99163264/2b529f85-2294-4226-aff8-72b043b350f7)


4.**API Endpoints**
Create a Project

URL: /save

Method: POST

**Request Body:**
`{
  "id": 1,
  "name": "Project 1",
  "description": "Description of Project 1",
  "startDate": "2022-03-01",
  "endDate": "2022-03-31"
}`

**Get All Projects**
URL: /findAll
Method: GET

**Get a Project by ID**
URL: /findbyID/{id}
Method: GET

**Update a Project**
URL: /update/{id}
Method: PUT
Request Body: (Similar to create)

**Delete a Project**
URL: /deletebyID/{id}
Method: DELETE

5.**Dependencies**
Java 17
Spring Boot 3.2.3
H2 Database

6.**Watch This Video For Reference**



https://github.com/khanubaid1800/Project-Management-System---Assignment/assets/99163264/eccf6f70-85a3-44d8-8e11-44db61a716a9




Authors`
Mohammad Ubaid Khan


`khanubaid1800` 
