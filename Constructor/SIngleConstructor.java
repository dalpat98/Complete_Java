class circle{
    double x,y;
    double r;

    double circumference(){
        return 2*3.14159*r;
    }

    double area(){
        return (22/7)*r*r;
    }
    //Here comes the constructor
    circle(double a,double b,double c){
        x = a;
        y = b;
        r = c;
    }
}
class SingleConstructor{
    public static void main(String[] args) {
        circle c1 = new circle(3.0, 4.0, 5.0);
        circle c2 = new circle(-4.0, 8.0, 10.0);
        System.out.println("Circumference of c1 :" + c1.circumference());
        System.out.println("Area of c1 :" + c1.area());
        System.out.println("Circumference of c2 :" + c2.circumference());
        System.out.println("Area of c2 :" + c2.area());
    }
}