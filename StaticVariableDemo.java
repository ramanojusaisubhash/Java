class Student{
    int rollno;
    String name;
    static double fee = 47500.0;
    Student(int rollno,String name,double fee)
    {
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    Student(int rollno,String name)
    {
        this.rollno=rollno;
        this.name=name;
    }
    void display(){
        System.out.println("Student Details are: \nrollnumber : "+rollno+" Name : "+name+" Fees : "+fee);
    }
}
public class StaticVariableDemo{
    public static void main(String args[]){
        Student st1= new Student(4234,"Sushma sri",50000);
        Student st2= new Student(4231,"Kara rajashekar");//In this object the fees value is changed due to static fee variable
        st1.display();
        st2.display();
    }
}
