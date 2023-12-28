import java.util.Comparator;

class MyStudent {
    private String name;
    private double gpa;

    public MyStudent(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return gpa;
    }
}

class SortingStudentsByGPA implements Comparator<MyStudent> {

    @Override
    public int compare(MyStudent student1, MyStudent student2) {
        if (student1.getGPA() > student2.getGPA()) {
            return -1;
        } else if (student1.getGPA() < student2.getGPA()) {
            return 1;
        } else {
            return 0;
        }
    }

    public void quickSort(MyStudent[] students, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(students, low, high);
            quickSort(students, low, pivotIndex - 1);
            quickSort(students, pivotIndex + 1, high);
        }
    }

    private int partition(MyStudent[] students, int low, int high) {
        double pivot = students[high].getGPA();
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (compare(students[j], students[high]) > 0) {
                i++;
                MyStudent temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }
        MyStudent temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;
        return i + 1;
    }
}

public class Main {
    public static void main(String[] args) {
        MyStudent[] students = {
                new MyStudent("Alice", 3.8),
                new MyStudent("Bob", 3.6),
                new MyStudent("Charlie", 4.0),
                new MyStudent("David", 3.9),
                new MyStudent("Eve", 3.5)
        };

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students, 0, students.length - 1);

        System.out.println("Sorted by GPA (descending order):");
        for (MyStudent student : students) {
            System.out.println(student.getName() + ": " + student.getGPA());
        }
    }
}
