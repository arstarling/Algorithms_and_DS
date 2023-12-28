package Practice9;

class Student implements Comparable<Student> {
    private String name;
    private int iDNumber;

    public Student(String name, int iDNumber) {
        this.name = name;
        this.iDNumber = iDNumber;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.iDNumber, other.iDNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", iDNumber=" + iDNumber +
                '}';
    }
}

public class StudentSortTest {

    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 123),
                new Student("Bob", 456),
                new Student("Charlie", 789),
                new Student("David", 234),
                new Student("Eve", 567)
        };

        System.out.println("Before sorting:");
        printStudents(students);

        // Сортировка массива по iDNumber методом вставки
        insertionSort(students);

        System.out.println("After sorting:");
        printStudents(students);
    }

    public static void insertionSort(Student[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Student key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

