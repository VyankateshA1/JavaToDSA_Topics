package OOPS_01;

class Student {

    int rollNo = 07;
    String name;
    float marks;
    Student() {
        this.rollNo=002;
    }
    Student(int roll,String me){
        this.rollNo=roll;
        this.name = me;

    }
    void greeting(){
        System.out.println("how are you "+this.name);
    }
    void changname(String newName){
        name = newName;
    }
    void St(int marks){
        this.marks=this.marks;
    }
}
public class Main {
    public static void main(String[] args) {


        Student Vyan = new Student();

        Student v = new Student(2,"Boss");
        v.St(20);
        Vyan.name ="Andhale";
        Vyan.marks=73.40f;
        System.out.println(v.marks);
        System.out.println(v.rollNo);
        System.out.println(v.name);

//
//        Vyan.changname("Vyankatesh");
//
//        Vyan.greeting();
    }
}


