import java.util.Scanner;

public class Takes_A_Use_Input_String {
    public static void main (String[] args ) {
       

int trygain = 0;
      do{
       Scanner input1 = new Scanner(System.in); 

        System.out.println("Write a program that takes a use input string and performs the following operations: ");
        System.out.println("");
        System.out.println("1. Find and print the length of the string.\r\n" + //
                           "2. Cnvert the string to Upper case and print it.\r\n" + //
                           "3. Convert the String to Lower case and print it.\r\n" + //
                           "4. Print the First character of the string. \r\n" + //
                           "5. Print the last character of the string.\r\n" + //
                           "6. print the substring starting from the second charater to the fifth the charater of the string.");
        System.out.println("");
        System.out.println("Enter the string");
       
      String Input = input1.nextLine();
 
      System.out.println(Input.length());
      System.out.println(Input.toUpperCase());
      System.out.println(Input.toLowerCase());
      System.out.println(Input.charAt(0));
      Character Last = Input.charAt(Input.length() - 1);
     
      System.out.println(Last);
     
      if (true == true) {
      
      System.out.println(Input.toUpperCase());
      System.out.println(Input.toLowerCase());
      System.out.println(Input.charAt(0));
      Character LastIn =Input.charAt(Input.length() - 1);
        System.out.println(LastIn);
        
      }
      System.out.println(" You want to try again \n" + //
                "  1:Press number one continue and Press number \\n" + 
                  " 2: if you want to STOP " );
    
    }while(trygain ==1 );
    System.out.println("Stop");

      
      

    }
    
   
}
 


