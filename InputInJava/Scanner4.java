import java.util.*;

public class Scanner4{
    public static void main(String[] args) {
        System.out.print("Enter the Radius :");
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();
        double area = 3.14*radius*radius;
        System.out.println("Area is :" + area);
    }
}