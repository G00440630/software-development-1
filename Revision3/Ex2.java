import java.util.Scanner;
public class Ex2{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int numberone = 0;
        int numbertwo = 0;
        int total = 0;

        System.out.print("Enter first number: ");
        numberone = input.nextInt();

        System.out.print("Enter second number: ");
        numbertwo = input.nextInt();

        total = (numberone+numbertwo)*4; 
        System.out.println("(" + numberone + " + " + numbertwo + ")" + " * " + "4 = " + total); 
    }
}