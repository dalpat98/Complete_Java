class A{

    //Constructor 2
    A(int x){
        this(5,6); // this is used to call constructor 3 within costructor 2
        System.out.println("This is Constructor 2 :"+"x = "+x);
    }

    //Constructor 3
    A(int x,int y){
        System.out.println("This is Constructor 3 :"+"x = "+x+" y = "+y);
    }
    //Constructor 1
    A(){
        this(5); // this is used to call constructor 2 within costructor 1
        System.out.println("This is Constructor 1");
    }

}
class thisDemo4{
    public static void main(String[] args) {
        A a = new A();
        // as soon the object "a" is created the "A" classes 
        // default constructor i.e. A() is automatically called
        //here A() is default constructor because while creating object
        // "a" we used new A()..... if we use new A(5) then default
        //constructor will be A(int x)
    }
}