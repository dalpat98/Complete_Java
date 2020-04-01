// this keyword is used to resolve the collision of same name variables 

class student{
    int rollno;
    String name, course;
    float fee;

    student(int rollno, String name, String course){
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }

    student(int rollno, String name, String course, float fee){
        this(rollno,name,course); //reusing constructor
        // this will call the constructor defined above
        this.fee = fee;
    }

    void display(){
        System.out.println(rollno + " " + name + " " + course + " " + fee);
    }
}

class thisDemo1{
    public static void main(String[] args) {
        student s1 = new student(111,"dalpat","java");
        student s2 = new student(112,"sumit","java",6000f); // here f is for float
        s1.display();
        s2.display();
    }
}