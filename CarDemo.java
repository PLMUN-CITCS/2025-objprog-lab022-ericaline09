import java.util.Scanner;

public class // Define the Car class
class Car {
    // Declare instance variables (attributes)
    String make;
    String model;
    int year;

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}

// Main class to run the program
public class CarDemo {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car();
        
        // Assign values to the attributes of myCar
        myCar.make = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;
        
        // Call the displayInfo method to show the car information
        myCar.displayInfo();
    }
}
{

    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Variable to store the user's menu choice
        int choice;
        
        // Continuously display the menu until the user chooses to exit
        do {
            // Display the menu options
            displayMenu();
            
            // Get the user's choice
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();
            
            // Handle the user's menu choice
            handleMenuChoice(choice);
        } while (choice != 3); // Loop continues until the user selects "Exit"
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Method to display the menu options
    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
    }

    // Method to handle the menu choice and execute corresponding actions
    public static void handleMenuChoice(int choice) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        if (choice == 1) {
            // Call greetUser() method to greet the user
            greetUser();
        } else if (choice == 2) {
            // Call checkEvenOrOdd() method to check if the number is even or odd
            checkEvenOrOdd(scanner);
        } else if (choice == 3) {
            // Exit message and terminate the program
            System.out.println("Exiting program. Goodbye!");
        } else {
            // Invalid option message
            System.out.println("Invalid choice. Please select a valid option (1-3).");
        }
    }

    // Helper method to greet the user
    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    // Helper method to check if the given number is even or odd
    public static void checkEvenOrOdd(Scanner scanner) {
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Use the modulo operator to check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }
}
