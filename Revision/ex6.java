public class ex6{
    public static void main (String[] args){

        System.out.println("Part a: ");
        for (int i = 1; i <= 6; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Part b: ");
        for (int i = 10; i <= 15; i++){
            for(int j = 10; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}