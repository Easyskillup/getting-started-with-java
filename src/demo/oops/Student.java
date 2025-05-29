package demo.oops;

public class Student {

    private int rollNumber;
    private String fullName;
    private String address;
    static String syllabusCode;

    public Student() {
        System.out.println("Student constructor executed...");
    }

    /**
     * static access modifier, applied to variables, methods, blocks and nested/inner classes
     * when anything is declared static it belongs to the class rather than the instance/object
     * static content is loaded when a class is loaded
     * to initialize a static variable, we can use static blocks
     */

    // static block
    static {
        System.out.println("Static block 2 of Student");
    }

    static {
        System.out.println("Static block 1 of Student");
    }

    {
        System.out.println("Instance block");
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setFullName(String fullName) {
        // check if full name is a proper string. no numbers, or special characters
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setRollNumber(int rollNumber) {
        // check if the roll number is allocated to some other student
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }
}
