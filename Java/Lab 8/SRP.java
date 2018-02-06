import java.lang.*;
import java.util.*;

class Grade {
    private String grade;

    public Grade(String grade) {
        if(validateGrade(grade)) {
            this.grade = grade;
        } else {
            throw new RuntimeException("Not a valid grade");
        }
    }

    private boolean validateGrade(String grade) {
        String regex = "[ABCDF]";
        
        if (grade.matches(regex)) {
            return true;
        }
        
        return false;
    }

    public String grade() {
        return this.grade;
    }
}
class Student {
    private String name;
    private String id;
    private Grade grade;

    public Student(String name, String id, Grade grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public void printInfo() {
        System.out.println("Student: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Grade: " + this.grade.grade());
    }
}


public class SRP {

    public static void main(String[] args) {
        Grade grade = new Grade("A");
        Grade grade1 = new Grade("F");

        Student s = new Student("George Suarez", "006098556", grade);
        Student h = new Student("Harry Hacker", "006098334", grade1);

        s.printInfo();
        h.printInfo(); // Error cannot have grade "E"
    }
}