
import java.util.Scanner;
public class Odd_Even_Zero_Negative {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        

        System.out.println("create a program that will determine a number is odd or even? Positive or negative? Or zero?");
        int First_input = input.nextInt();
        
      
       
            if (First_input %2 == 0) {
                System.out.println("postive Even");
            }else if (First_input %2 != 0) {
                System.out.println("Postive  Odd");
               
            }else if (First_input <= 0){
                System.out.println("Negative");
            }
        
        
        
    }
  
    
}


