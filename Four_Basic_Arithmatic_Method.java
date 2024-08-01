
import java.util.Scanner;


public class Four_Basic_Arithmatic_Method {
    public static double add(double a, double b){
        return a+b;
    }
    public static double sub(double a, double b){
        return a-b;
    }
    public static double mul(double a, double b){
        return a*b;
    }
    public static double diva(double a, double b){
       return a/b;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char c;

    System.out.println("Enter your First Number");
    double Num1Input = input.nextDouble();
    System.out.println("Enter your Second Number");
    double Num2Input = input.nextDouble();

    System.out.println("enter the arithemetic ");
     c = input.next().charAt(0);

    

    double Additon = add(Num1Input, Num2Input);
    double Subtruction = sub(Num1Input, Num2Input);
    double Multiplication = mul(Num1Input, Num2Input);
    double divides = diva(Num1Input , Num2Input);



        switch (c) {
            case '+':
            System.out.println( Additon + "  " + "additon");
                break;

            case '-':
            System.out.println( Subtruction + "  " + "Subtruction" );
                break;
            
            case '*':
             System.out.println( Multiplication + "  " + "Multiplication" );    
                break;

            case '/':
            System.out.println( Multiplication + "  " + "Multiplication" );
                break;
        
            default:
            System.out.println("Can you plss enter input the arithmatic operator");
                break;
        }
  
    }
}