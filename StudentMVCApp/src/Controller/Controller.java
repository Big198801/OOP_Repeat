package Controller;

import Model.Student;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Student> students;
    private iGetView view;
    private iGetModel model;

    public Controller(iGetView view, iGetModel model) {
        this.students = new ArrayList<Student>();
        this.view = view;
        this.model = model;
    }

    public void getAllStudent() {
        students = model.getAllStudent();
    }

    public boolean testData() {
        if (students.size() > 0) {
            return true;
        }
        return false;
    }

    public void updateView() {
        //MVP
        getAllStudent();
        if (testData()) {
            view.printAllStudents(students);
        }
        System.out.println("список студентов пуст");

        //MVC
        //view.printAllStudents(model.getAllStudents());
    }

}
