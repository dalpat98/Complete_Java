// prints maximum of two numbers
import java.util.Scanner;

public class Scanner2{
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        //calculating maximum of two

        System.out.println("Enter Two Numbers seperated by space :");
        int a = scnr.nextInt();
        int b = scnr.nextInt();

        if(a>b){
            System.out.printf("Between %d and %d, the maximum is %d",a,b,a);
        }
        else{
            System.out.printf("Between %d and %d, the maximum is %d",a,b,b);
        }
    }
}