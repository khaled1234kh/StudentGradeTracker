# Student Grade Tracker

A Java application for tracking and managing student grades. This project provides a graphical user interface for entering, storing, and managing student information and their corresponding grades.

## Features

- Add new students with their information
- Track and manage student grades
- Graphical user interface for easy interaction
- Data persistence for student records

## Project Structure

```
StudentGradeTracker/
├── src/
│   ├── main/java/com/mycompany/studentgradetracker/
│   │   ├── StudentGradeTracker.java    # Main application class
│   │   ├── Student.java                 # Student model class
│   │   └── gui.java                     # Graphical user interface
│   └── test/java/                       # Test files
├── target/                              # Compiled classes and build artifacts
├── pom.xml                              # Maven project configuration
└── README.md                            # This file
```

## Requirements

- Java 8 or higher
- Maven (for building the project)

## Building the Project

To build the project, run:

```bash
mvn clean compile
```

## Running the Application

To run the application, execute:

```bash
mvn exec:java -Dexec.mainClass="com.mycompany.studentgradetracker.StudentGradeTracker"
```

## Development

This project was developed using NetBeans IDE and follows Maven project structure conventions.

## License

This project is open source and available under the MIT License. 