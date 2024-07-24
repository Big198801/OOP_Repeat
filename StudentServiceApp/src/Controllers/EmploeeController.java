package Controllers;

import StudentDomen.Emploee;
import StudentDomen.User;
import StudentService.EmploeeService;

public class EmploeeController implements iUserController<Emploee>{
    private final EmploeeService empService = new EmploeeService();

    @Override
    public void create(String firstName, String lastName, String adress, int age) {
        empService.create(firstName, lastName, adress, age);
    }

    public static  <T extends Emploee> void paySalary(T person){
        System.out.println(((User)person).getFirstName() + " зп 10000р ");
    }

    public static <T extends Number> double means(T[] num){
        double sum = 0.0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i].doubleValue();
        }
        sum = sum/num.length;
        return sum;
    }
}
