import java.util.Scanner;
public class Guess1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 20, guess = 0, count = 0;
        
guess = 0;
count = 0;
while(guess != number){
    System.out.print("Guess the number: ");
    guess = input.nextInt();
    count++; 
}
System.out.println("Good Guess. It is " + number + ". It took you " + count + " attempts to guess the number.\n");
input.close();
}
}