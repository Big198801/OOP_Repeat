package StudentService;

import StudentDomen.Student;
import StudentDomen.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements iUserService<Student> {
    private int count;
    private List<Student> students;


    public StudentService() {
        this.students = new ArrayList<>();
        // count++;
    }

    @Override
    public List<Student> getAll() {
        return this.students;
    }

    @Override
    public void create(String firstName, String lastName, String adress, int age) {
        Student person = new Student(firstName, lastName, adress, age, count);
        count++;
        students.add(person);
    }
}
