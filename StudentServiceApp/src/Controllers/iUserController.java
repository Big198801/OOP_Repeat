package Controllers;

import StudentDomen.User;

public interface iUserController<T extends User>  {
    void create(String firstName, String lastName, String adress, int age);
}
