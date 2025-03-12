public class ex5{
    public static void main (String[] args){
        String output = " ";
        for(int i = 1; i <= 5; i++){
            System.out.print(i + ": ");
            int j = 8;
            for(; j >= 4; j -= 2){
               System.out.print(j + ", ");
            }
            System.out.println(j);
        System.out.println();
        }
        
    }
}