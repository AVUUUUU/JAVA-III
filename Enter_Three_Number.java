
import java.util.Scanner;
public class Enter_Three_Number {

    public static void main(String[] args) {
         int tryagain;       
        do{
                Scanner input1 = new Scanner(System.in);
                Scanner input2 = new Scanner(System.in);
                Scanner input3 = new Scanner(System.in);
            
                
                    System.out.println("Enter three numbers: ");
                int First_number = input1.nextInt();
                int Second_number = input1.nextInt();
                int Third_number = input1.nextInt();

                    if (First_number > Second_number && First_number > Third_number) {
                        System.out.println("The Largest Number is:" + First_number);
                    }else if (Second_number>First_number && Second_number > Third_number) {
                        System.out.println("The Largest Number is: " + Second_number);

                    }else if (Third_number > First_number && Third_number > Second_number) {
                        System.out.println("The Largest number is:" + Third_number);
                    }

                System.out.println("Enter three numbers: ");
                int a1 =  input2.nextInt();
                int b2 =  input2.nextInt();
                int c3 =  input2.nextInt();

              

                    if(a1==b2 && a1==c3 && b2==a1 && b2==c3 && c3==a1 && c3==b2){
                        System.out.println("All numbers are equal");

                    }else{
                        System.out.println("they are not equal");
                    }
                    System.out.println("Do you want to try again Press number  \n1 if you want to try again  2: if you are done");
              tryagain = input3.nextInt();;
             
            }while(tryagain == 1);
    
                    System.out.println("stop");
                    
        
}

}