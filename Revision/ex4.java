public class ex4{
    public static void main (String []args){
        String output = " ";
        int total = 0;
        for(int i = 1; i <= 9; i++){
            output = output + i + " + ";
            total += i; 
        }
        System.out.println(output.substring(0, output.length()-3) + " = " + total);
        
    }
}