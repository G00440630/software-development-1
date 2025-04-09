public class Loops {
    public static void main (String[] args){
        for(int i = 1; i <=7; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 7; i >=1; i--){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 1, j = 7; i <= 7 && j >= 1; i++, j--){
            System.out.print(i + " " + j + " ");
        }
        System.out.println();
    }
}