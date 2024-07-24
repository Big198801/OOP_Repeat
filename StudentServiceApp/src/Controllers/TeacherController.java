package Controllers;

import StudentDomen.Emploee;
import StudentDomen.Teacher;
import StudentDomen.User;
import StudentService.TeacherService;

public class TeacherController implements iUserController<User, Teacher> {
    private final TeacherService dataService = new TeacherService();

    @Override
    public void create(String firstName, String lastName, String adress, int age) {
        dataService.create(firstName, lastName, adress, age);

    }

    public static <T extends Teacher> void paySalary(T person) {
        System.out.println(((Teacher) person).getFirstName() + " зп 1_003_434 р ");
    }
}
