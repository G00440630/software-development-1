import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        double age = input.nextDouble(); // Using double to allow decimal ages like 0.5

        if (age < 0) {
            System.out.println("Invalid age entered.");
        } else if (age < 1) {
            System.out.println("Baby");
        } else if (age >= 1 && age < 4) {
            System.out.println("Toddler");
        } else if (age >= 4 && age < 13) {
            System.out.println("Child");
        } else if (age >= 13 && age < 20) {
            System.out.println("Teenager");
        } else if (age >= 20 && age < 65) {
            System.out.println("Adult");
        } else { // age >= 65
            System.out.println("Senior Citizen");
        }
    }
}
