package Scala;

import java.util.Objects;

public class Student {

    int rollNo;
    String name;
    int marks;

    public Student()
    {
        rollNo = 1;
        String name = "Navin";
    }
    public Student(int rollNo, String name, int marks) {
        super();
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo && marks == student.marks
                && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, name, marks);
    }

    public boolean isGreater(Student s2)
    {
        return marks > s2.marks;
    }


}
