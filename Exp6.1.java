import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void display() {
        System.out.println(name + " (" + age + ", " + salary + ")");
    }
}

public class EmployeeSorting {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Lakshay", 30, 50000));
        employees.add(new Employee("Divit", 25, 60000));
        employees.add(new Employee("Rohan", 35, 55000));
        employees.add(new Employee("Aryan", 28, 45000));
        employees.add(new Employee("Kabir", 32, 47000));
        employees.add(new Employee("Aditya", 25, 46000));
        employees.add(new Employee("Samar", 29, 50000));
        employees.add(new Employee("Vihan", 31, 50000));
        employees.add(new Employee("Ishaan", 27, 50000));

    
        System.out.println("Sorted by Name:");
        employees.stream()
                 .sorted(Comparator.comparing(Employee::getName))
                 .forEach(Employee::display);

        System.out.println();

        System.out.println("Sorted by Age:");
        employees.stream()
                 .sorted(Comparator.comparingInt(Employee::getAge))
                 .forEach(Employee::display);

        System.out.println();

     
        System.out.println("Sorted by Salary:");
        employees.stream()
                 .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                 .forEach(Employee::display);

        System.out.println();

        System.out.println("Sorted by Name then Age:");
        employees.stream()
                 .sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getAge))
                 .forEach(Employee::display);

        System.out.println();

      
        System.out.println("Sorted by Salary then Name:");
        employees.stream()
                 .sorted(Comparator.comparingDouble(Employee::getSalary).thenComparing(Employee::getName))
                 .forEach(Employee::display);
    }
}
