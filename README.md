# 📚 BooksWebApp

A Java EE web application developed using **NetBeans**, **Apache Derby (Java DB)**, **Servlets**, **JSP**, and **Enterprise Java Beans (EJB)**.  

The system performs full **CRUD operations** (Create, Read, Update, Delete) on a book database.

---

## 🚀 Features

- 📖 Add new books
- 📚 View all books
- 🔍 Search for a book
- ✏️ Edit book details
- ❌ Remove book
- 💾 Persistent storage using Apache Derby database

---

## 🛠️ Technologies Used

- Java EE (Jakarta EE concepts)
- Servlets
- JSP (JavaServer Pages)
- EJB (Enterprise Java Beans)
- Apache Derby (Java DB)
- NetBeans IDE
- HTML

---

## 📁 Project Structure

### 🌐 Web Pages (JSP & HTML)

web/
├── add_book.html
├── add_book_outcome.jsp
├── edit_book.html
├── edit_book_outcome.jsp
├── get_book_to_edit_outcome.jsp
├── index.html
├── menu.html
├── remove_book.html
├── remove_book_outcome.jsp
├── view_book.html
├── view_book_outcome.jsp
├── view_books.html
├── view_books_outcome.jsp


---

### 🧠 Business Logic Layer (EJB / Facade Pattern)
za.ac.tut.model.bl
├── AbstractFacade.java
├── BookFacade.java
└── BookFacadeLocal.java


- Handles database operations (CRUD logic)
- Acts as a bridge between Entity and Web Layer

### 📦 Entity Layer (Database Model)
za.ac.tut.model.entity
└── Book.java


- Represents the BOOK table in the database
- Maps object fields to database columns

### 🌍 Web Layer (Servlet Controllers)
za.ac.tut.web
├── AddBookServlet.java
├── EditBookServlet.java
├── GetBookToEditServlet.java
├── RemoveBookServlet.java
├── ViewBookServlet.java
└── ViewBooksServlet.java


- Handles HTTP requests
- Communicates between JSP pages and EJB layer
- Controls application flow

### 🧩 Enterprise Beans
Enterprise Beans:
└── BookFacade (Session Bean)


- Implements business logic using EJB
- Provides database access methods

### ⚙️ Configuration
WEB-INF/
└── web.xml

- Deployment descriptor
- Maps servlets and application configuration

---

## 🗄️ Database Setup (Derby / Java DB)

Example table structure:

CREATE TABLE BOOK (
    ID BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    TITLE VARCHAR(150),
    PRICE DOUBLE,
    DESCRIPTION VARCHAR(1000),
    ISBN VARCHAR(50),
    ILLUSTRATIONS BOOLEAN,
    NUMOFPAGES INT,
    CREATIONDATE TIMESTAMP
);

## ▶️ How to Run the Project

1. Open the project in NetBeans
2. Start Apache Derby (Java DB)
3. Clean and Build the project
4. Deploy to GlassFish Server
5. Run the application
6. Open browser:
   http://localhost:8080/BooksWebApp

## 💡 Learning Outcomes

- Implementing CRUD operations in a Java EE environment
- Using Servlets and JSP for web development
- Applying MVC architecture principles
- Connecting Java applications to a relational database (Derby)
- Using EJB for business logic separation

## 👨‍💻 Author

Developed by: [Rebaona Radebe]  
Project: BooksWebApp – Java EE CRUD System













