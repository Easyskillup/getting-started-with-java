package demo.streams;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStreamApi {
    static List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", "HR", 55000),
            new Employee(2, "Bob", "IT", 75000),
            new Employee(3, "Charlie", "IT", 82000),
            new Employee(4, "David", "HR", 50000),
            new Employee(5, "Eve", "Finance", 90000)
    );

    public static void main(String[] args) {
        System.out.println("Employees In IT");
        System.out.println(employeesInDepartment("IT"));
        System.out.println();

        System.out.println("All Employee names");
        System.out.println(getAllEmployeeNames());
        System.out.println();

        System.out.println("Average Salary of employees");
        System.out.println(getAverageSalary());
        System.out.println();

        System.out.println("Employee With highest salary");
        System.out.println(highestPaidEmployee());
        System.out.println();

        System.out.println("Sorting employee based on salary");
        sortEmployees();
        System.out.println();

        System.out.println("Employees grouped by departments");
        Set<Map.Entry<String, List<Employee>>> entries = groupEmployeeByDepartment().entrySet();
        entries.forEach(entry -> {
            System.out.println("Department: " + entry.getKey());
            entry.getValue().forEach(e -> System.out.println("\t" + e));
            System.out.println("--------------------------------------------------------------------");
        });
    }

    static Map<String, List<Employee>> groupEmployeeByDepartment() {
        return employees.stream().collect(Collectors.groupingBy(e -> e.getDepartment()));
    }

    static void sortEmployees() {
        employees.stream()
                .sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
                .forEach(e -> System.out.println(e));
    }

    static Employee highestPaidEmployee() {
        return employees.stream().max(Comparator.comparingDouble(e -> e.getSalary())).orElse(null);
    }

    static double getAverageSalary() {
        return employees.stream().mapToDouble(e -> e.getSalary()).average().orElse(0.0);
    }

    static List<String> getAllEmployeeNames() {
        return employees.stream().map(emp -> emp.getName()).toList();
    }

    static List<Employee> employeesInDepartment(String department) {
        return employees.stream().filter(emp -> emp.getDepartment().equals(department)).toList();
    }


}
