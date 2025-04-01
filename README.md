# ProyectoFx-LibreriaTC - Final Library Project

## Team Members
- Santiago Castro Zuluaga

## Description
This project was developed for a programming class to learn various programming paradigms. It is a simple book library application built in Java, featuring a dynamic interface using JavaFX and structured with FXML. The application efficiently manages local data and serves as a learning tool for object-oriented and event-driven programming concepts.

## Libraries Used
The project utilizes the following libraries:
- `JavaFX`: For creating the graphical user interface (GUI) of the application.
- `FXML`: To define the structure of the GUI.

## Functionality
The system offers the following features:
- **Book Display:** Shows a list of available books.
- **Book Management:** Allows you to add, modify, and delete book records.
- **Dynamic Interface:** The GUI updates in real-time as changes are made, offering an interactive user experience.
- **Local Data Handling:** All data is managed locally without the need for external databases.

## How It Works
The project is built on the following technologies:
- **JavaFX:** For constructing a modern and responsive graphical user interface.
- **FXML:** For defining the structure and layout of the user interface.
- **Java:** To implement the business logic and component interactions.
- **Maven:** For project lifecycle management, simplifying the processes of compilation and execution.

These components are integrated to provide a modular and scalable solution, making it an excellent tool for understanding and applying different programming approaches.

## Project Structure
The repository is organized as follows:

```
ProyectoFx-LibreriaTC
├── .idea
│   ├── Project_Settings
│   ├── Workspace
│   └── Misc
├── .mvn
│   ├── Wrapper
│   └── Maven_Settings
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── Controllers
│   │   │   ├── Models
│   │   │   ├── Services
│   │   │   └── Main.java
│   │   ├── resources
│   │   │   ├── fxml
│   │   │   ├── css
│   │   │   └── images
│   ├── test
│   │   ├── java
│   │   └── test_cases
├── .gitignore
├── README.md
├── mvnw
├── mvnw.cmd
└── pom.xml
```


## Installation and Execution
To download and run the project, follow these steps:

### Steps to Clone and Run

  ### 1. Clone the repository:
  ```
  git clone https://github.com/Santag207/ProyectoFx-LibreriaTC.git
  ```

### 2. Navigate to the project directory:
  ```
  cd ProyectoFx-LibreriaTC
  ```

### 3. Compile and run the application using Maven:
  ```
  mvn clean javafx:run
  ```

Make sure you have Java and Maven installed on your system.

## Learnings and Considerations
This project was created for educational purposes and offers insights into:

- Object-Oriented Programming (OOP): Understanding code organization and modularity.

- Event-Driven Programming: Managing interactions and real-time updates in the GUI.

- Library Integration: Utilizing JavaFX and FXML for desktop application development.

- Project Management with Maven: Automating the processes of compilation and execution.

- It serves as an ideal resource for students who wish to experiment with Java application development and explore different programming methodologies.
