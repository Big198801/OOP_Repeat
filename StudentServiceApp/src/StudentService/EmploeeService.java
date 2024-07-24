package StudentService;

import StudentDomen.*;

import java.util.ArrayList;
import java.util.List;

public class EmploeeService implements iUserService<User> {
    private int count;
    private List<User> employes;

    public EmploeeService(){
        this.employes = new ArrayList<>();
    }

    @Override
    public List<User> getAll() {
        return this.employes;
    }

    @Override
    public void create(String firstName, String lastName, String adress, int age) {
        User per = new User(firstName, lastName, adress, age);
        count++;
        employes.add(per);

    }

    public void add(User user){
        employes.add(user);
    }

    public List<User> getSortedbyFioStudentGroup(int numberGroup){
        List<User> emps = new ArrayList<>(employes);
        emps.sort(new UserComparator<User>());
        return emps;
    }


}
