public class ex5_2{
    public static void main (String[] args){
        
        for(int i = 1; i <= 5; i++){
            System.out.print(i + ": ");
            int j = 9;
            for(; j >= 3; j -= 2){
                System.out.print(j + ", ");
            }
            System.out.println(j);
            System.out.println();
        }
    }
}