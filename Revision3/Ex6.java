import java.util.Scanner;
public class Ex6{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int no1 = 0;
        int no2 = 0;
        int addition; int subtraction; int multiplication;
        System.out.print("Enter first number: ");
        no1 = input.nextInt();
        System.out.print("Enter second number: ");
        no2 = input.nextInt();

        addition = no1 + no2;
        System.out.println(no1 + " + " + no2 + " = " + addition);
        subtraction = no1 - no2;
        System.out.println(no1 + " - " + no2 + " = " + subtraction);
        multiplication = no1 * no2;
        System.out.println(no1 + " * " + no2 + " = " + multiplication);

        input.close();
    }
}