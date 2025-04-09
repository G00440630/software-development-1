public class NestedLoops{
    public static void main (String[] args){
        for(int i = 1; i <= 4; i++){
            for(int j = 0; j <= 3; j++){
                System.out.print("B");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("B");
            }
            System.out.println();
        }
    }
}