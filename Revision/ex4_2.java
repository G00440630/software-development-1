public class ex4_2{
    public static void main (String[] args){
        
        String output = " ";
        int total = 0;
        for(int i = 1; i <= 9; i +=2){
            output = output + i + " + ";
            total += i;
        }
        System.out.println(output.substring(1,output.length()-3) + " = " + total);
    }
}