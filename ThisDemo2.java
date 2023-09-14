import java.io.*;
class Student{
    int rollnumber;
    String name;
    float fee;
    Student(int rollnumber,String name , float fee){
        this.rollnumber = rollnumber;
        this.name = name;
        this.fee = fee;
    }
    void display(){
        System.out.println("Student details are:\n"+rollnumber+" "+name+" "+fee);
    }
}
public class ThisDemo2{
    public static void main(String args[]){
        Student s1 = new Student(4249,"subhash",45700);
        Student s2 = new Student(4231,"rajashekar",45700);
        s1.display();
        s2.display();
    }
}
