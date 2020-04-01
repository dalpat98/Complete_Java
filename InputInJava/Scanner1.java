// Scanner is one of the predefined class which is used for reading
//data dynamically from the keyboard

import java.util.Scanner;

public class Scanner1{
    public static void main(String[] args) {

        int num1, num2;
        Scanner s = new Scanner(System.in);
        // here "s" is a obj. of Scanner class & Scanner(System.in) is Constructor
        // the constructor is initialised by a obj. System.in

        System.out.println("Enter First number :");
        num1 = s.nextInt();
        //here s.nextInt() will read the integer from keyboard
        
        System.out.println("Enter Second number :");
        num2 = s.nextInt();

        System.out.println("Sum :"+(num1+num2));
    }
}
