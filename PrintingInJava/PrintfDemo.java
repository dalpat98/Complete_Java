//Java program to demonstrate the printf() in Java

class PrintfDemo{
    public static void main(String[] args) {
        int x = 100;
        System.out.printf("Printing a simple integer: x = %d\n",x);

        //this will print it upto 3 decimal places
        System.out.printf("Formatted with precision: PI = %.3f\n",Math.PI);

        float n = 5.2f;

        //automatically appends zero to the rightmost part of decimal
        System.out.printf("Formatted to specific width: n = %.4f\n",n);

        n = 2324435.3f;

        //here no. is formatted from right margin and occupies a width 0f 20 chars.
        System.out.printf("Formatted to right margin: n = %20.4f\n",n);
    }
}