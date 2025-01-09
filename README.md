# Selenium-Automation-Testing

## Overview

This project provides a framework for automating web application testing using the Selenium WebDriver library. It offers insights into strategies and best practices for interacting with web elements effectively.

---

## Features

- **Web Browser Interaction**: Automates tasks such as form submissions, link navigation, and UI testing.
- **Element Interaction Strategies**: Demonstrates best practices for interacting with various web elements.
- **Test Automation Framework**: Provides a structured approach to writing and executing automated tests.

---

## Tools and Libraries Used

- **Java**: Programming language for writing test scripts.
- **Selenium WebDriver**: For browser automation.
- **TestNG**: Testing framework for organizing and running tests.
- **Maven**: Build automation tool for managing project dependencies.

---

## Project Structure
Selenium-Automation-Testing/ ├── src/ │ ├── main/ │ │ └── java/ │ └── test/ │ └── java/ ├── lib/ ├── target/ ├── .gitignore ├── pom.xml └── README.md


- `src/main/java/`: Contains the main application code.
- `src/test/java/`: Contains test classes and methods.
- `lib/`: Directory for external libraries.
- `target/`: Output directory for compiled code and build artifacts.
- `pom.xml`: Maven configuration file specifying project dependencies and build settings.

---

## Getting Started

### Prerequisites

- **Java Development Kit (JDK)**: Version 8 or higher.
- **Maven**: For managing project dependencies.
- **WebDriver Executables**: Ensure that the appropriate WebDriver (e.g., ChromeDriver for Google Chrome) is installed and its path is set in the system environment variables.

### Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/Ravix-Wiz/Selenium-Automation-Testing.git
2. **Navigate to the project directory**:
   ```bash
   cd Selenium-Automation-Testing
3. **Install dependencies: Maven will handle the dependencies specified in the pom.xml file. Run the following command to download and install them**:
   ```bash
   mvn clean install
   ```
### Running Tests
Execute the following command to run the tests using Maven:
```bash
mvn test
```


