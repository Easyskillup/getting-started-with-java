package demo.collections;

import java.util.Comparator;
import java.util.List;

/**
 * Supply default sorting logic to student class. For this we can use java.lang.Comparable interface
 * and then override the compare() method.
 */
public class Student implements Comparable<Student> {
    private int rollNumber;
    private String name;
    private List<Integer> marks;

    public Student() {
    }

    public Student(int rollNumber, String name, List<Integer> marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    public int getTotalMarks() {
        int sum = 0;
        for (var mark : marks) {
            sum += mark;
        }
        return sum;
    }

    public double getAverageMarks() {
        return getTotalMarks() / Double.valueOf(marks.size());
    }

    public String print() {
        return "Roll Number: " + getRollNumber() + " Name: " + getName() + " Marks: " + getTotalMarks() + " Average: " + getAverageMarks();
    }

    // Provided by object class, returns a string representation of this object
    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(getRollNumber(), o.getRollNumber());
    }

    public static class TotalMarksComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return Integer.compare(o1.getTotalMarks(), o2.getTotalMarks());
        }
    }

    public static class AverageMarksComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return Double.compare(o1.getAverageMarks(), o2.getAverageMarks());
        }
    }
}
