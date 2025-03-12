public class Five{
    public static void main (String[] args){
        String output = " ";
        for(int i = 5; i <= 50; i+=5){
            output = output + i + ", ";
            
        }
        System.out.println(output.substring(1, output.length()-2));
        System.out.println();

        int count = 5;
        while(count <= 49){
            System.out.print(count + ", ");
            count += 5;
        }
        System.out.print(count);
        System.out.println();
    }
}