package bo;

import entity.Student;
import constant.IConstant;
import utils.Validate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * The StudentBO class provides business operations for managing Student
 * objects.
 */
public class StudentBO {
    private List<Student> students;

    public StudentBO() {
        this.students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent() {
        Student s = new Student();
        s.input();
        students.add(s);
    }

    public void inputStudents() {
        System.out.println("====== Student Management Program ======");
        while (true) {
            System.out.println("Please enter student information:");
            addStudent();
            String choice = Validate.getString("Do you want to add another student? (Y/N): ",
                    IConstant.REGEX_YN,
                    "Invalid choice! Please enter only 'Y' or 'N'.").toUpperCase();
            if (!choice.equals("Y")) {
                break;
            }
        }
    }

    public void sortStudents() {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareToIgnoreCase(s2.getName());
            }
        });
    }

    public void display() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        int count = 1;
        for (Student s : students) {
            System.out.println("------------- Student " + count + " -------------");
            System.out.println(s);
            count++;
        }
    }
}
