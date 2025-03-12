import java.util.Scanner;
public class RectanglePattern{
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);

        int r = 0;
        int c = 0;

        System.out.print("Enter row no: ");
        r = input.nextInt();
        System.out.print("Enter col no: ");
        c = input.nextInt();

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print("+ ");
            }
            System.out.println();
        }
        input.close();
    }
}