package StudentDomen;

public class Emploee extends User{
    private int empId;

    public Emploee(String firstName, String lastName, String adress, int age, int empId) {
        super(firstName, lastName, adress, age);
        this.empId = empId;
    }
}
