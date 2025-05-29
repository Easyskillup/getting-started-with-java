package demo.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StudentManager {

    static void print(List<Student> students) {
        for (var s: students) {
            System.out.println(s.print());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();

        students.add(new Student(2, "John", List.of(74, 84, 77, 82, 79)));
        students.add(new Student(3, "Lisa", List.of(77, 80, 79, 80, 79)));
        students.add(new Student(1, "Arun", List.of(72, 71, 65, 77, 88)));
        students.add(new Student(5, "Ritesh", List.of(70, 80, 66, 82, 79)));
        students.add(new Student(4, "Irshad", List.of(76, 89, 98, 63, 79)));

        System.out.println("Original List");
        print(students);

        // Sort the list using default sorting
        System.out.println("Sorting based on roll number[default sorting]");
        Collections.sort(students);
        print(students);

        // Sort the list using total marks
        System.out.println("Sorting based on total marks");
        Collections.sort(students, new Student.TotalMarksComparator());
        print(students);

        // Sort the list using average marks
        System.out.println("Sorting based on average marks");
        Collections.sort(students, new Student.AverageMarksComparator());
        print(students);

    }
}
