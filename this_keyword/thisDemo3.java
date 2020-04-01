class A{
    void m(){
        System.out.println("m() called here");
    }
    void n(){
        System.out.println("n() called here");
        this.m();
    }
}
class thisDemo3{
    public static void main(String[] args) {
        A a = new A();
        a.n();
    }
}