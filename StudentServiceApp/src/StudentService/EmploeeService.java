package StudentService;

import StudentDomen.Emploee;
import StudentDomen.StudentGroup;

import java.util.ArrayList;
import java.util.List;

public class EmploeeService implements iUserService<Emploee> {
    private int count;
    private List<Emploee> employes;

    public EmploeeService(){
        this.employes = new ArrayList<>();
    }

    @Override
    public List<Emploee> getAll() {
        return this.employes;
    }

    @Override
    public void create(String firstName, String lastName, String adress, int age) {
        Emploee per = new Emploee(firstName, lastName, adress, age, count);
        count++;
        employes.add(per);

    }


}
