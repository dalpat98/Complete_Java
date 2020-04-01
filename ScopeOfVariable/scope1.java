class Box{
    float x = 10.0f;
    float y = 20.0f;
    float w = 15.0f;

    float area(){
        return (2*(x*y + x*w + y*w));
    }
}

class Circle{
    float x = 0.0f;
    float y = 0.0f;
    float r = 5.0f;

    float area(){
        return ((22/7)*r*r);
    }
}

class scope1{
    public static void main(String[] args) {
        float x = 50f;
        float y = 60f;
        
        Box b = new Box();
        Circle c = new Circle();
        System.out.println("scope1 data : x = "+ x);
        System.out.println("Box data : x = "+b.x);
        System.out.println("Box Area = "+b.area());
        System.out.println("Circle data : x = "+c.x);
        System.out.println("Circel Area = "+c.area());
    }
}