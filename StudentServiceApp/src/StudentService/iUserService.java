package StudentService;

import java.util.List;

public interface iUserService <T>{
    List<T> getAll();
    void create(String firstName, String lastName, String adress, int age);
}
