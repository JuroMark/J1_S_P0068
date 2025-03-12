import java.util.List;
import entity.Student;
import bo.StudentBO;

/**
 * The Main class serves as the entry point for the student management program.
 * It uses the StudentBO class to input, sort, and display student data.
 */
public class Main {
    public static void main(String[] args) {
        // Input student data
        List<Student> students = Student.inputStudents();
        // Initialize StudentBO object (student list is initialized inside constructor)
        StudentBO studentBO = new StudentBO();
        // Add the newly entered students to the StudentBO list
        for (Student student : students) {
            studentBO.addStudent(student);
        }
        // Sort students by name (A-Z)
        studentBO.sortStudent();
        // Display the sorted list of students
        studentBO.display();
    }
}
