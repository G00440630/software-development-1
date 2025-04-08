public class Exercise2{
    public static void main (String[]args){
        int [] original = {2, 4, 6, 8, 10};
        int [] doubled = new int [original.length];

        System.out.println("Index\tOriginal\tDoubled");
        for(int i = 0; i < original.length; i++){
        doubled[i]= original[i]*2;
        System.out.println(i + "\t" + original[i] + "\t\t" + doubled[i]);
        }
    }
}