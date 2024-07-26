package View;

import Controller.iGetView;
import Model.Student;

import java.util.List;
import java.util.Scanner;

public class View implements iGetView {
    public void printAllStudent(List<Student> students) {
        System.out.println("\t\t---вывод списка студентов---");
        for (Student person :
                students) {
            System.out.println(person);
        }
        System.out.println("\t\t---конец списка---");
    }

    public String promt(){
        System.out.println("введите команду ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public int promtInt(){
        System.out.println("номер строки для удаления: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    @Override
    public void exitMessage() {
        System.out.println("выход из программы");
    }
}
