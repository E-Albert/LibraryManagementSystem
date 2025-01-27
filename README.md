# Library Management System

## Description
This Java-based Library Management System (LMS) allows users to manage patrons effectively. It provides functionalities to add, remove, display, and load patron information from a file. The system uses Java classes, collections, file handling, and loops to implement the functionality.

---

## Features
- **Add Patron:** Add a new patron by providing their ID, name, address, and overdue fine.
- **Remove Patron:** Remove an existing patron by their unique ID.
- **Display All Patrons:** View a list of all patrons along with their details.
- **Load Patrons from File:** Load patron information from a file (formatted with `-` as the separator).
- **Exit:** Exit the application gracefully.

---

## How to Use
1. Clone or download the project from this repository.
2. Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse, etc.).
3. Add your text file containing patron information in the format:
   ```ID-Name-Address-OverdueFine```
4. Run the `Main` class to start the application.
5. Follow the on-screen menu to interact with the system.

---

## Code Highlights
- **Patron Class:** Encapsulates the data for each patron (ID, name, address, overdue fine).
- **LibraryManagementSystem Class:** Manages a list of patrons and provides methods for interaction and file handling.
- **Main Class:** Entry point of the program, invokes the menu-driven interaction.
