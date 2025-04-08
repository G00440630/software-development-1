public class Sample_Ex3 {
    public static void main (String [] args){
        int x;
        String grade;
        System.out.print("Enter result: ");
        x = input.nextInt();

        if(x > = 90){
            grade = "A";
        }else if ( x >= 70){
            grade = "B";
        }else if (x >= 50){
            grade = "C";
        }else{
            grade = "F";
        }
        System.out.println("Grade: " + grade);

        input.close();``
    }
}