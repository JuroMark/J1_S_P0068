package entity;

import constant.IConstant;
import utils.Validate;
import java.util.ArrayList;
import java.util.List;

/**
 * The Student class represents a student with a name, a mark (score), and a
 * class.
 * It provides constructors for initialization, getters and setters for each
 * field,
 * and a toString() method for displaying the student's information.
 */
public class Student {
    private String name;
    private float mark;
    private String classes;

    /**
     * Default constructor.
     */
    public Student() {
    }

    /**
     * Constructs a Student with the specified name, mark, and class.
     *
     * @param name    The student's name.
     * @param mark    The student's mark (score).
     * @param classes The student's class.
     */
    public Student(String name, float mark, String classes) {
        this.name = name;
        this.mark = mark;
        this.classes = classes;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    /**
     * Returns a string representation of the student.
     *
     * @return Formatted student information.
     */
    @Override
    public String toString() {
        return String.format("Name: %s\nClasses: %s\nMark: %.1f", name, classes, mark);
    }

    public static List<Student> inputStudents() {
        List<Student> students = new ArrayList<>();
        System.out.println("====== Student Management Program ======");
        while (true) {
            System.out.println("Please enter student information:");
            String name = Validate.getString("Name: ", IConstant.REGEX_NAME,
                    "Name can only contain letters and spaces.", "Name cannot be empty.");
            String classes = Validate.getString("Classes: ", IConstant.REGEX_CLASS, "Invalid class.",
                    "Class cannot be empty.");
            float mark = (float) Validate.getDouble("Mark: ", "Mark must be between 0 and 100.",
                    "Please enter a valid number.", "Mark cannot be empty.", 0, 100);
            students.add(new Student(name, mark, classes));
            String choice = Validate.getString("Do you want to add another student? (Y/N): ",
                    IConstant.REGEX_YN,
                    "Invalid choice! Please enter only 'Y' or 'N'.",
                    "Choice cannot be empty.").toUpperCase();
            if (!choice.equals("Y")) {
                break;
            }

        }
        return students;
    }
}