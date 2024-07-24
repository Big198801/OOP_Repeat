package Controllers;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.Teacher;
import StudentService.StudentService;

public class StudentController implements iUserController<Student, Teacher>{
    private final StudentService dataService = new StudentService();
    private final StudentService groupService = new StudentService();
    @Override
    public void create(String firstName, String lastName, String adress, int age) {
        dataService.create(firstName, lastName, adress, age);
    }
}
