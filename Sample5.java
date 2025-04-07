public class Sample5{
    public static void main (String [] args){
        int[] x = {20, 30, 40, 50};
        System.out.println("Index\tValue\n-----\t-----");
        for(int i = 0; i < x.length; i++){
            System.out.println(i + "\t" + x[i]);
        }
    }
}