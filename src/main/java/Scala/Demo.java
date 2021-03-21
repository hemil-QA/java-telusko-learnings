package Scala;

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Navin", 99);
        Student s2 = new Student(2, "Swapnil", 90);

        System.out.println(s1.isGreater(s2));
    }
}
