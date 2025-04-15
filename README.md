# Simple Java Selenium Project

This is a simple Java project that demonstrates how to use Selenium WebDriver to automate a web browser. The project includes a demo script that retrieves and prints the text of all anchor (`<a>`) elements from a specified webpage.

## Prerequisites

Before running the project, ensure you have the following installed:

- **Java Development Kit (JDK)**: Make sure you have JDK 8 or higher installed on your machine.
- **Apache Maven** (optional): If you want to manage dependencies easily.
- **Selenium WebDriver**: The necessary WebDriver executables for the browsers you want to test (Chrome, Firefox, Edge).

## Project Structure

```
/TestDemo
│
├── /Driver
│   ├── chromedriver.exe
│   ├── geckodriver.exe
│   └── msedgedriver.exe
│
└── /src
    └── Demo
        └── Demo.java
```

## Setup Instructions

1. **Clone the Repository**: If this project is hosted on a version control system, clone it to your local machine.

2. **Download WebDriver Executables**:
   - Download the appropriate WebDriver executables for your browser:
     - [ChromeDriver](https://sites.google.com/chromium.org/driver/)
     - [GeckoDriver](https://github.com/mozilla/geckodriver/releases)
     - [EdgeDriver](https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/)
   - Place the downloaded executables in the `Driver` folder of the project.

3. **Set Up Your IDE**:
   - Open your IDE (e.g., Eclipse, IntelliJ IDEA).
   - Import the project or create a new Java project and copy the `src` and `Driver` folders into it.

4. **Add Selenium Dependency**:
   - If you are using Maven, add the following dependency to your `pom.xml`:
     ```xml
     <dependency>
         <groupId>org.seleniumhq.selenium</groupId>
         <artifactId>selenium-java</artifactId>
         <version>4.0.0</version> <!-- Check for the latest version -->
     </dependency>
     ```
   - If you are not using Maven, download the Selenium Java client and add the JAR files to your project's build path.

## Running the Demo

1. Open a terminal or command prompt.
2. Navigate to the `src` directory where `Demo.java` is located.
3. Compile the Java file:
   ```bash
   javac Demo.java
   ```
4. Run the compiled Java program:
   ```bash
   java Demo.Demo
   ```
5. When prompted, enter the browser you want to use (e.g., `chrome`, `firefox`, or `edge`).

## Example Output

When you run the program, it will open the specified browser, navigate to `https://omayo.blogspot.com/`, and print the text of all anchor elements on the page.

```
Enter the browser you want to use (chrome/firefox/edge): chrome
Link 1
Link 2
...
```

## Notes

- Ensure that the paths to the WebDriver executables in the `Demo.java` file are correct for your system.
- The program will close the browser automatically after printing the link texts.
- If you encounter any issues, make sure that the WebDriver version matches the version of the browser you are using.
