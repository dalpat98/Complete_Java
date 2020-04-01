// here count is declared as static so it has only a single copy
// which is used throughout 

public class static1{
    static int count = 0; // class variable
    public double x,y,r; // instance variable

    //constructors
    public static1(double x, double y, double r){
        this.x = x; this.y = y; this.r = r;
        count++;
    }
    public static1(double r){
        this(0.0,0.0,r);
        count++;
    }
    public static1(static1 s){
        this(s.x,s.y,s.r);
        count++;
    }
    public static1(){
        this(0.0,0.0,0.1);
        count++;
    }

    //methods
    public double circumference(){
        return (2*3.14*r);
    }
    public double area(){
        return (3.14*r*r);
    }

    //main 
    public static void main(String[] args) {
        static1 s1 = new static1();
        static1 s2 = new static1(5.0);
        static1 s3 = new static1(s1);
        System.out.println("s1 :"+s1.count+ " s2 :"+s2.count+ " s3 :"+s3.count);
    }

}