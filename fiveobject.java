
class Student {
    int id;
    String name;
 
    Student(int i, String n) {
        id = i;
        name = n;
    }
void display() {
        System.out.println("ID=" +id  " Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
 Student s1 = new Student(1, "ambia");
        Student s2 = new Student(2, "shaki");
        Student s3 = new Student(3, "promi");
        Student s4 = new Student(4, "shamiha");
        Student s5 = new Student(5, "chowdhury");
           s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
    }
}
