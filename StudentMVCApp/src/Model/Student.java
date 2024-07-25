package Model;

public class Student extends User implements Comparable<Student> {
    private long studentId;
//    public Student(String firstName, String lastName, String adress, int age, long id) {
//        super(firstName, lastName, adress, age);
//        this.studentId = id;
//    }

    public Student(String firstName, String lastName, int age, long id) {
        super(firstName, lastName, age);
        this.studentId = id;
    }


    @Override
    public String toString() {
        return "Student ФИО: " + super.getFirstName() +
                " " + super.getLastName() +
                " Возраст: " + super.getAge() +
                " id: " + getId() + "\n";
    }

    public long getId() {
        return studentId;
    }

    public void setId(long id) {
        this.studentId = id;
    }

    @Override
    public int compareTo(Student o) {
        if (studentId == o.studentId) {
            if (this.getAge() == o.getAge()) {
                return 0;
            }
            if (this.getAge() < o.getAge()) {
                return -1;
            }
            return 1;
        }
        if (studentId < o.studentId) {
            return -1;
        }
        return 1;
    }
}
