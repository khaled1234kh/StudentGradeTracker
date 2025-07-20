# 🎓 Student Grade Tracker

A simple **Java Swing GUI application** that allows users to input student names and grades, maintain a list of records, and generate a performance summary including highest, lowest, and average grades with corresponding letter grades.

## 📌 Features

* 🧾 **Add Student Records**: Enter student names and grades (0–100), with input validation.
* 📊 **Generate Summary**: Calculate highest, lowest, and average grades along with letter grades.
* ❌ **Clear Records**: Easily reset the student list.
* 🔡 **Letter Grade Conversion**: Automatically converts numeric grades into letter grades based on standard thresholds.
* 👨‍💻 **Java Swing Interface**: Simple, interactive graphical interface for desktop use.

## 🖼️ Application Overview

<img width="1919" height="1015" alt="Screenshot 2025-07-20 125130" src="https://github.com/user-attachments/assets/92b860a3-9fb9-44f7-8162-309e24d56a14" />


## 🚀 Getting Started

### Prerequisites

* Java 8 or higher
* Any Java IDE (like IntelliJ IDEA or NetBeans)

### Running the Project

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/student-grade-tracker.git
   cd student-grade-tracker
   ```

2. Compile and run:

   * Open the project in your IDE.
   * Run the `StudentGradeTracker.java` file.

> 💡 The main class launches the GUI automatically via `new Student();`.

## 🧠 How It Works

* Inputs are taken via `JTextField` for both name and grade.
* Validations ensure:

  * Name doesn't include numbers.
  * Grades are numeric and within the 0–100 range.
* All valid entries are stored in `ArrayList`s.
* Summary includes:

  * Highest scoring student
  * Lowest scoring student
  * Average grade
  * Each with converted letter grades

## 📎 Sample Letter Grade Scale

| Grade Range | Letter |
| ----------- | ------ |
| 90–100      | A      |
| 85–89       | A−     |
| 80–84       | B+     |
| 75–79       | B      |
| 70–74       | B−     |
| 65–69       | C+     |
| 60–64       | C      |
| 55–59       | C−     |
| 50–54       | D      |
| 0–49        | F      |

## 📂 File Structure

```
student-grade-tracker/
├── com/mycompany/studentgradetracker/
│   ├── Student.java
│   └── StudentGradeTracker.java
```

## 🏆 Achievements

✅ Fully functional Swing-based desktop GUI
✅ Strong input validation and error handling
✅ Clean summary reporting logic
✅ Practiced Java OOP principles and event-driven programming

## 🧑‍💻 Author

**Khaled Mohamed**
Java Developer | Passionate about GUI Applications
[LinkedIn](https://www.linkedin.com/in/khaled-mohamed-22a22a325/) • [GitHub](https://github.com/khaled1234kh)
