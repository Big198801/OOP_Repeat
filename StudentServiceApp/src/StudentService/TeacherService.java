package StudentService;

import StudentDomen.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements iUserService<Teacher> {
    private int count;
    private List<Teacher> teachers;
    @Override
    public List<Teacher> getAll() {
        return this.teachers = new ArrayList<>();
    }

    @Override
    public void create(String firstName, String lastName, String adress, int age) {
        Teacher teachrrr = new Teacher(firstName,lastName,adress, age);
        teachers.add(teachrrr);
        count++;
    }
}
