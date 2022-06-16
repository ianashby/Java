package tutorials;
import java.util.Scanner;

public class UserInputTutorial {
    // Public means that the method can be accessed from outside the class.
    // Static means that the method can be accessed without creating an object.
    // Void means that the method doesn't return anything.
    // Main is the name of the method.
    public static void main(String[] args) {
        // Prints to the console.
        // System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);

        System.out.println("What is you age?");
        String age = sc.nextLine();
        int ageInt = Integer.parseInt(age);

        if (ageInt >= 18) {
            System.out.println("Are you a citizen?");
            String citizen = sc.nextLine();
            if (citizen.equals("yes")) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You are not eligible to vote.");
            }
        } else {
            System.out.println("You are not old enough to vote!");
        }

        
    }
}