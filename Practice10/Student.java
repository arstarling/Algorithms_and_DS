public class Student {
    private String firstName;
    private String lastName;
    private String specialty;
    private int course;
    private String group;

    public Student(String firstName, String lastName, String specialty, int course, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", specialty='" + specialty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student1 = new Student("Арина", "Скворцова", "Информатика", 2, "КВБО-04-22");
        Student student2 = new Student("Алиса", "Бышенко", "Математика", 2, "КВБО-04-22");
        Student student3 = new Student("Дарья", "Румянцева", "Информационные технологии", 2, "КВБО-04-22");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
    }
}
