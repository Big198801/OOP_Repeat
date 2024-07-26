package Controller;

import Model.Student;
import View.View;
import View.ViewEng;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private List<Student> students;
    private iGetView view;

    private iGetModel model;

    public Controller(iGetView view, iGetModel model) {
        this.students = new ArrayList<Student>();
        this.view = view;
        this.model = model;
    }

    public void getAllStudent() {
        students = model.getAllStudent();
    }

    public boolean testData() {
        if (students.size() > 0) {
            return true;
        }
        return false;
    }

    public void updateView() {
        //MVP
        getAllStudent();
        if (testData()) {
            view.printAllStudent(students);
        }else {
            System.out.println("список студентов пуст");
        }

        //MVC
        //view.printAllStudents(model.getAllStudents());
    }

    /**
     * метод для выбора интерфейса языка
     * @return экземпляр View или ViewEng
     */
    public iGetView chooseProgrammLanguage(){
        System.out.println("выберите язык: 'r' -ru,  'e' -eng  :  ");
        String command = view.promt();
        if (command.charAt(0) == 'r'){
            System.out.println("выбран русский язык");
            return new View();

        } else if (command.charAt(0) == 'e'){
            System.out.println("english language");
            return new ViewEng();
        }else{
            System.out.println("неверный ввод");
            chooseProgrammLanguage();
        }return null;
    }

    public void run(){

        Commands com = Commands.NONE;
        boolean getNewIteration = true;

        while (getNewIteration){
            String command = view.promt();
            com = Commands.valueOf(command.toUpperCase());
            switch (com){
                case EXIT:
                    view.exitMessage();
                    getNewIteration = false;
                    break;
                case LIST:
                    getAllStudent();
                    updateView();
                    break;
                case DELETE:
                    getAllStudent();
                    updateView();
                    int choice =  view.promtInt();
                    model.deleteStudent((long)choice);
                    break;


            }
        }
    }
}
