package View;

import Model.Student;

import java.util.List;

public class View {
    public void printAllStudents(List<Student> students){
        for (Student person :
                students) {
            System.out.println(person);
        }
    }
}
