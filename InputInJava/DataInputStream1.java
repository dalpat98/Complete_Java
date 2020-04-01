// Same as Scanner we can also take input using DataInputStream class

import java.io.*;

class DataInputStream1{
    public static void main(String[] args) throws Exception {

        //throws exception is used because of exception in depreciated api
        //we ca also use throw and catch block for this
        
        float principal, interest;
        int time;

        //BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        DataInputStream b = new DataInputStream(System.in);
        
        String temp;
        System.out.println("Enter Principal amount :");
        System.out.flush();
        //clears the buffer 
        temp = b.readLine();
        //this reads the entire line in String format and store it in temp
        principal = Float.valueOf(temp);
        //this is type casting... temp is changed to float value from string

        System.out.println("Enter Rate of Interest :");
        System.out.flush();
        temp = b.readLine();
        interest = Float.valueOf(temp);

        System.out.println("Enter Number of years :");
        System.out.flush();
        temp = b.readLine();
        time = Integer.parseInt(temp);

        float total = principal*interest*time;
        System.out.println("Total interest = "+ total);
    }
}