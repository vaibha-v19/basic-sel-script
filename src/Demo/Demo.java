package Demo; // Package declaration

import java.util.*; // Importing utility classes
import org.openqa.selenium.By; // Importing By class for locating elements
import org.openqa.selenium.WebDriver; // Importing WebDriver interface
import org.openqa.selenium.WebElement; // Importing WebElement class
import org.openqa.selenium.chrome.ChromeDriver; // Importing ChromeDriver class
import org.openqa.selenium.edge.EdgeDriver; // Importing EdgeDriver class
import org.openqa.selenium.firefox.FirefoxDriver; // Importing FirefoxDriver class

public class Demo { // Class declaration

    public static void main(String[] args) { // Main method - entry point of the program
        
        // Create a Scanner object to read user input for browser choice
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser you want to use (chrome/firefox/edge): "); // Prompt user for browser choice
        String browser = scanner.nextLine().toLowerCase(); // Read user input

        WebDriver driver = null; // Initialize WebDriver reference

        // Determine which browser to use based on user input
        if (browser.equalsIgnoreCase("chrome")) {
            // Set the path for ChromeDriver executable
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\z0053u3m\\eclipse-workspace\\TestDemo\\Driver\\chromedriver.exe");
            driver = new ChromeDriver(); // Instantiate ChromeDriver
        } else if (browser.equalsIgnoreCase("firefox")) {
            // Set the path for GeckoDriver executable
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\z0053u3m\\eclipse-workspace\\TestDemo\\Driver\\geckodriver.exe");
            driver = new FirefoxDriver(); // Instantiate FirefoxDriver
        } else if (browser.equalsIgnoreCase("edge")) {
            // Set the path for EdgeDriver executable
            System.setProperty("webdriver.edge.driver", "C:\\Users\\z0053u3m\\eclipse-workspace\\TestDemo\\Driver\\msedgedriver.exe");
            driver = new EdgeDriver(); // Instantiate EdgeDriver
        } else {
            // Handle invalid browser choice
            System.out.println("Invalid browser choice. Please enter either 'chrome' or 'firefox'.");
            scanner.close(); // Close the scanner
            return; // Exit the program
        }

        // Navigate to the specified URL
        driver.get("https://omayo.blogspot.com/");
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Find all anchor elements (<a>) on the page
        List<WebElement> ele = (List<WebElement>) driver.findElements(By.tagName("a"));
        
        // Iterate through the list of anchor elements and print their text
        for (WebElement j : ele) {
            if (j.getText().length() > 0) {
                System.out.println(j.getText());
            }
        }
        
        // Close the scanner and quit the browser
        scanner.close();
        driver.quit();
    }
}
