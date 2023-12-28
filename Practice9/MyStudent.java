package Practice9;

public class MyStudent implements Comparable<MyStudent> {
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

    @Override
    public int compareTo(MyStudent other) {
        // Сравниваем студентов по итоговым баллам (убывающий порядок)
        if (this.gpa > other.gpa) {
            return -1;
        } else if (this.gpa < other.gpa) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        MyStudent student1 = new MyStudent("Alice", 3.8);
        MyStudent student2 = new MyStudent("Bob", 3.6);

        int comparisonResult = student1.compareTo(student2);

        if (comparisonResult < 0) {
            System.out.println(student1.getName() + " has a higher GPA than " + student2.getName());
        } else if (comparisonResult > 0) {
            System.out.println(student2.getName() + " has a higher GPA than " + student1.getName());
        } else {
            System.out.println(student1.getName() + " and " + student2.getName() + " have the same GPA.");
        }
    }
}

