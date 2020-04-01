import java.util.ArrayList;
import java.util.Scanner;

class Scanner3{
    public static void main(String[] args) {
        int sum = 0;
        float avg = 0;
        ArrayList <Integer> arr = new ArrayList<Integer>();
        //This is another way to declare a array

        System.out.println("Enter all the array elements :");
        Scanner s = new Scanner(System.in);
        while(s.hasNextInt()){
            arr.add(s.nextInt());
            //adds one by one value to "arr" array from input
            //hasNextInt() checks whether there is any integer or not
            //After all the input given press cnrl+z  or type  ^z to stop taking inputs
        }

        for(int i=0; i<arr.size(); i++){
            sum+=arr.get(i);
            //arr.get() read one by one value from the array "arr"
        }

        avg = sum/(arr.size());
        System.out.println("Average :"+ avg);
    }
}