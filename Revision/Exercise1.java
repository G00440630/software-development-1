import java.util.Scanner;
    public class Exercise1{
        public static void main(String[]args){
            Scanner input = new Scanner(System.in);
            String text= "";
            System.out.print("Enter some text: ");
            text = input.nextLine();

            System.out.println(text);
            for(int i = 1; i <= 4; i++){
                System.out.println(text + ". " + i);
            }

            //System.out.println();
            int i = 1;
            //while(i <= 4){
                //System.out.println(text + ". " + i);
                //i++;
            //}

            do{
                System.out.println(text + ". " + i);
                i++;
            }
            while(i <= 4);
            input.close();
        }
    }