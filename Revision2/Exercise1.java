public class Exercise1{
    public static void main (String[]args){
        int [] x = {2, 4, 6, 8, 10};

        System.out.println("Before\tupdate");
        for(int i = 0; i < x.length; i++){
            System.out.println(i + "\t" + x[i]);
        }
        System.out.println();
        System.out.println("Afer\tupdate");
        for(int i = 0; i < x.length; i++){
            int value;
            value = x[i] * i;
            System.out.println(i + "\t" + value);
        }
    }
}