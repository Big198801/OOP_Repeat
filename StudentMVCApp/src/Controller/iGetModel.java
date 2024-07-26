package Controller;

import Model.Student;

import java.util.List;

public interface iGetModel  {
    public List<Student> getAllStudent();

    <E extends Number> void  deleteStudent(E number);
}
