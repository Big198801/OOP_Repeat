package StudentDomen;

public class User {
    private String firstName;
    private String lastName;
    private String adress;
    private int age;

    public User(String firstName, String lastName, String adress, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return
               "User ФИО: " + getFirstName()+" " + getLastName()+
                       " Адрес: "+ getAdress()+  " Возраст: " + getAge() + "\n";

    }
}