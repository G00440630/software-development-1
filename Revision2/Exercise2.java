public class Exercise2{
    public static void main (String[]args){
       int [] x = {3, 6, 9, 12, 15, 18};

    
         for(int i = 0; i < x.length; i++){
                if( i % 2 == 0){    
            x[i] = x[i]+5;
            System.out.println("index update " + i + ": " + x[i]);
            }else{
            x[i] = x[i]-2;
            System.out.println("index update " + i + ": " + x[i]);    
            }
        }
       
    }
}