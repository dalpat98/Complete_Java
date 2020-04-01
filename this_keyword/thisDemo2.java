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
    circle(double x,double y,double r){
        this.x = x; this.y = y; this.r = r;
    }
    circle(double r){
        x = 0; y = 0; this.r = r;
    }
    circle(circle c){
        x = c.x; y = c.y; r = c.r;
    }
    circle(){
        x = 0.0; y = 0.0; r = 1.0;
    }
}
class thisDemo2{
    public static void main(String[] args) {
        circle c1 = new circle(3.0, 4.0, 5.0);
        circle c2 = new circle(10.0);
        circle c3 = new circle(c1);
        circle c4 = new circle();
        System.out.println("Circumference of c1 :" + c1.circumference());
        System.out.println("Area of c1 :" + c1.area());
        System.out.println("Circumference of c2 :" + c2.circumference());
        System.out.println("Area of c2 :" + c2.area());
        System.out.println("Circumference of c3 :" + c3.circumference());
        System.out.println("Area of c3 :" + c3.area());
        System.out.println("Circumference of c4 :" + c4.circumference());
        System.out.println("Area of c4 :" + c4.area());
    }
}