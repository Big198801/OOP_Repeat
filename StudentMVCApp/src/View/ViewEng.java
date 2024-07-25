package View;

import Controller.iGetView;
import Model.Student;

import java.util.List;
import java.util.Scanner;

public class ViewEng implements iGetView {
    @Override
    public void printAllStudent(List<Student> students) {
        System.out.println("\t\t---print Students List---");
        for (Student person :
                students) {
            System.out.println(person);
        }
        System.out.println("\t\t---End of List---");
    }

    @Override
    public String promt() {
        System.out.println("input your command ");
            Scanner sc = new Scanner(System.in);
            System.out.println();
            return sc.nextLine();
        }

    @Override
    public void exitMessage() {
        System.out.println("exit....");
    }
}



