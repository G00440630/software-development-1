/*
 
*****
 ***
  *
  
 */

public class Loop_Example {
    public static void main (String[] args){
        int rows = 3;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            

            int cols = 2 * (rows - i) - 1; // 5 on first/loop, 3 on the second, 1 on the third;
            for(int k = 0; k < cols; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}