import java.lang.*; // Math class is defined in this package

class Calculator{
    double i;
    double x;
    double k(){
        x = Math.sqrt(i);
        return x;
    }
}

class SquareRoot{
    public static void main(String[] args) {
        Calculator a = new Calculator();
        a.i = 25;
        System.out.println("Square root of " + a.i + " is :" + a.k());
    }
}