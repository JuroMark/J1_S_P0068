import bo.StudentBO;

/**
 * The Main class serves as the entry point for the student management program.
 */
public class Main {
    public static void main(String[] args) {
        StudentBO studentBO = new StudentBO();
        // import the list of students
        studentBO.inputStudents();
        // sort the list of students
        studentBO.sortStudents();
        // display the list of students
        studentBO.display();
    }
}
