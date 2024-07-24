package Controllers;

import StudentDomen.Teacher;
import StudentDomen.User;

public interface iUserController<T extends User, V extends Teacher>  {
    void create(String firstName, String lastName, String adress, int age);
}
