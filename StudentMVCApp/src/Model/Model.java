package Model;

import Controller.iGetModel;

import java.util.List;

public class Model implements iGetModel {
    private List<Student> students;

    public Model(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudent() {
        return students;
    }

    @Override
    public <E extends Number> void deleteStudent(E number) {
        if ((int)number > 0 & (int)number <=  students.size()) {
            students.remove((int) number - 1);
        }
        else{
            System.out.println("неверный ввод");
        }
    }

}



