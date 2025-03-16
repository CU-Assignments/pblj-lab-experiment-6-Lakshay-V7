import java.util.*;
import java.util.stream.Collectors;

class Student {
    private String name;
    private double marks;

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public void display() {
        System.out.println(name + " (" + marks + ")");
    }
}

public class StudentFilterSort {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Aarav", 80),
            new Student("Vihaan", 72),
            new Student("Rohan", 90),
            new Student("Ishaan", 65),
            new Student("Sanya", 85),
            new Student("Kabir", 70),
            new Student("Aryan", 78),
            new Student("Samar", 88)
        );

        List<Student> filteredSortedStudents = students.stream()
            .filter(s -> s.getMarks() > 75)
            .sorted(Comparator.comparingDouble(Student::getMarks).reversed()
                    .thenComparing(Student::getName))
            .collect(Collectors.toList());

        System.out.println("Students scoring above 75%, sorted by marks:");
        filteredSortedStudents.forEach(Student::display);
    }
}
