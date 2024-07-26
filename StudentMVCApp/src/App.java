import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.FileRepo;
import Model.Model;
import Model.*;
import View.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {

       Student s2 = new Student("Иван", "Петров", 40, 121);
        Student s3 = new Student("Егор", "Сидоров", 15, 122);
        Student s4 = new Student("Даша", "Самакина", 15, 13);
        Student s5 = new Student("Лена", "Петрова", 45, 124);
        Student s6 = new Student("Оксана", "Ильина", 34, 325);
        List<Student> students = new ArrayList<>();
        HashMap <Long, Student> studentHashMap = new HashMap<>();
        studentHashMap.put(s2.getId(), s2);
        studentHashMap.put(s3.getId(), s3);
        studentHashMap.put(s4.getId(), s4);
        studentHashMap.put(s5.getId(), s5);
        studentHashMap.put(s6.getId(), s6);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        FileRepo filerepo = new FileRepo("StudentDB.txt");




        iGetModel model = new ModelHash(studentHashMap);
        iGetView view = chooseProgrammLanguage();
        Controller control = new Controller(view, model);
        control.run();

    }
    /**
     * метод для выбора интерфейса языка
     * @return экземпляр View или ViewEng
     */
    public static iGetView chooseProgrammLanguage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("выберите язык: 'r' -ru,  'e' -eng  :  ");
        String command = sc.nextLine();
        if (command.charAt(0) == 'r'){
            System.out.println("выбран русский язык");
            return new View();


        } else if (command.charAt(0) == 'e'){
            System.out.println("english language");
            return new ViewEng();
        }else {
            System.out.println("неверный ввод");
            chooseProgrammLanguage();
            return null;
        }
    }

}
