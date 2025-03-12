import java.util.Scanner;
public class SquarePattern{
    public static void main (String []args){
        Scanner input = new Scanner (System.in);
        int i = 0;
        System.out.print("Enter size: ");
        i = input.nextInt();
        for(int r = 1; r < i; r++){
            for(int j = 1; j < i; j++){
                System.out.print("+ ");
            }
            System.out.println();
        }
        input.close();
    }
}