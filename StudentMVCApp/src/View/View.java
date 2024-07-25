package View;

import Controller.iGetView;
import Model.Student;

import java.util.List;

public class View implements iGetView {
    public void printAllStudents(List<Student> students) {
        System.out.println("___вывод списка студентов___");
        for (Student person :
                students) {
            System.out.println(person);
        }
        System.out.println("___конец списка___");
    }
}
