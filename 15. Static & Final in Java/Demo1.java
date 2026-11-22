package StaticFinal;
public class Demo1 {
    public static void main(String[] args) {
        Student s1 = new Student("Aditya", 28, 101);
        Student s2 = new Student("Rohit", 30, 102);

        //Student.college = "IIT Guwahati";

        System.out.println("Student 1: " + s1.name + ", Age: " + s1.age + ", Roll No: " + s1.rollNo + ", College: " + s1.college + ", Grade: " + Student.grade);
        System.out.println("Student 2: " + s2.name + ", Age: " + s2.age + ", Roll No: " + s2.rollNo + ", College: " + Student.college + ", Grade: " + Student.grade);
    }
}

class Student {
    String name;
    int age;
    int rollNo;
    static String college = "IIT Delhi";
    static int grade;

    Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    //Static block;
    static {
        grade = 10;
    }
}
