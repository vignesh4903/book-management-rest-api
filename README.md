# book-management-rest-api
# 📚 Book Management REST API

## 🚀 Overview

A backend REST API built using Spring Boot to manage books.
Supports CRUD operations with validation and global exception handling.

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* MySQL

---

## 📌 Features

* Create, Read, Update, Delete books
* Input validation
* Global exception handling
* Clean layered architecture

---

## 🔗 API Endpoints

| Method | Endpoint    | Description    |
| ------ | ----------- | -------------- |
| POST   | /books      | Add book       |
| GET    | /books      | Get all books  |
| GET    | /books/{id} | Get book by ID |
| PUT    | /books/{id} | Update book    |
| DELETE | /books/{id} | Delete book    |

---

## 🧪 Sample Request

```json
{
  "title": "Clean Code",
  "author": "Robert Martin",
  "publicationYear": 2008
}
```

---

## ⚠️ Error Response

```json
{
  "message": "Book not found"
}
```

---

## 📂 Structure

```
controller/
service/
repository/
entity/
exception/
```

---

## ▶️ Run

1. Clone the repo
2. Configure MySQL
3. Run Spring Boot application
4. Test using Postman

---
