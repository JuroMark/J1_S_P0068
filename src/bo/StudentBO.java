package bo;

import entity.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentBO {
    private List<Student> students;

    public StudentBO() {
        this.students = new ArrayList<>();
    }

    public StudentBO(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Sorts the list of students by name (A-Z)
     *
     * @param students The list of students to sort.
     */
    public void sortStudent() {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareToIgnoreCase(s2.getName());
            }
        });
    }

    /**
     * Displays the list of students.
     *
     * @param students The list of students to display.
     */
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
