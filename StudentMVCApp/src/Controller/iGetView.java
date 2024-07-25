package Controller;

import Model.Student;

import java.util.List;

public interface iGetView {
    void printAllStudent(List<Student> students);
    String promt();

    void exitMessage();

}
