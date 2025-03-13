package entity;

import constant.IConstant;
import utils.Validate;

/**
 * The Student class represents a student with a name, a mark (score), and a
 * class.
 * It provides constructors, getters/setters, and a toString() method for
 * displaying student information.
 */
public class Student {
    private String name;
    private float mark;
    private String classes;

    public Student() {
    }

    public Student(String name, float mark, String classes) {
        this.name = name;
        this.mark = mark;
        this.classes = classes;
    }

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

    @Override
    public String toString() {
        return String.format("Name: %s\nClasses: %s\nMark: %.1f", name, classes, mark);
    }

    public void input() {
        this.name = Validate.getString("Name: ", IConstant.REGEX_NAME,
                "Name can only contain letters and spaces.");
        this.classes = Validate.getString("Classes: ", IConstant.REGEX_CLASS,
                "Invalid class.");
        this.mark = (float) Validate.getDouble("Mark: ", "Mark must be between 0 and 100.",
                "Please enter a valid number.", "Mark cannot be empty.", 0, 100);
    }
}
