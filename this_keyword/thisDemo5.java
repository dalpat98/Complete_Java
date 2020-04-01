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
        this(0.0,0.0,r);
    }
    circle(circle c){
        this(c.x,c.y,c.r);
    }
    circle(){
        this(0.0,0.0,1.0);
    }
}
class thisDemo5{
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