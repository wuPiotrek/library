# Library Console Application 📚

Welcome to the **Library Console Application**, a simple and intuitive console-based program written in Java. This project provides basic functionality for managing users, books and magazines, making it an excellent starting point for learning Java and object-oriented programming .

---

## 🚀 Features

- **User Management**:
  - Create and manage library users, ensuring proper organization of borrowing privileges.
  - Handle user-specific data securely and efficiently.

- **Book Management**:
  - Add, update, and delete books from the library catalog.
  - View details of available books, including author, title, and publication date.

- **Data Persistence**:
  - Save and load data using CSV or serialized file formats.
  - Ensure data consistency and recovery across application sessions  

---

## 🔧 Architecture and Design

This application follows a modular design, with key components organized into packages:

1. **Application Layer** (`pl.javastart.library.app`):
   - Main entry point (`LibraryApp.java`) and application control logic.

2. **Model Layer** (`pl.javastart.library.model`):
   - Core entities like `Book`, `Magazine`, `LibraryUser`, and `Publication`.
   - Implements interfaces such as `CsvConvertible` for easy data exchange.

3. **I/O Layer** (`pl.javastart.library.io`):
   - Handles user input and output via `ConsolePrinter` and `DataReader`.

4. **Persistence Layer** (`pl.javastart.library.io.file`):
   - Provides file management with `CsvFileManager` and `SerializableFileManager`.

5. **Exception Handling** (`pl.javastart.library.exception`):
   - Custom exceptions like `DataImportException`, `NoSuchFileTypeException`, and `PublicationAlreadyExistsException`.

---

## 🌐 Examples of Usage

1. **Add a Book**:
   - Enter book details like title, author, and year of publication.
   - The system validates and stores the book in the library catalog.

2. **Display Books**:
   - Browse available books with detailed information.

3. **Add a User**:
   - Add a new library user by providing their information.

4. **Display Users**:
   - View a list of registered users.

---

## 🔧 Technologies Used

- **Java**:
  - Core Java concepts: OOP, Collections framework, Exception handling, and I/O operations.
- **File Management**:
  - CSV and serialization for data storage and retrieval.
- **Version Control**:
  - Managed with Git.

---
