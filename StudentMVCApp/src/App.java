import Controller.Controller;
import Model.Model;
import Model.Student;
import View.View;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Student s2 = new Student("Иван", "Петров", 40, 121);
        Student s3 = new Student("Егор", "Сидоров", 15, 122);
        Student s4 = new Student("Даша", "Самакина", 15, 13);
        Student s5 = new Student("Лена", "Петрова", 45, 124);
        Student s6 = new Student("Оксана", "Ильина", 34, 325);
        List<Student> students = new ArrayList<>();
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        Model model = new Model(students);
        View view = new View();
        Controller control = new Controller(view, model);
        control.updateView();
    }
}
