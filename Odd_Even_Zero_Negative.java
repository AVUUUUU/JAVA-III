
import java.util.Scanner;
public class Odd_Even_Zero_Negative {
    
    public static void main(String[] args) {

    int trygain;

            do{
            Scanner input = new Scanner(System.in);
        
            System.out.println("create a program that will determine a number is odd or even? Positive or negative? Or zero?");
            int First_input = input.nextInt();
            
        if (First_input == 0) {
            System.out.println( "Zero");

        }else{
            if (First_input %2 == 0) {
                System.out.println("even");
            }else{
                System.out.println("Odd");
            }
        }
        if (First_input <= 0 ) {
            System.out.println("negative");
        }else{
            System.out.println("Postive");
        }
            System.out.println("do you want to try again type number? type 1 to try again and 2 for stoo stop");
        trygain = input.nextInt();
        }while(trygain == 1);
        System.out.println("Stop");     
        }
    
        
    }


