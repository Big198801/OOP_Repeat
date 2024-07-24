import Controllers.EmploeeController;
import Controllers.TeacherController;
import StudentDomen.*;

import java.time.Period;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {
//        User u1 = new User("Сергей", "Иванов", "Чебоксары", 39);
//        Student s1 = new Student("Николай", "Афанасьев", "Чебоксары", 35, 1);
//        Student s2 = new Student("Иван", "Петров", "Москва", 40, 121);
//        Student s3 = new Student("Егор", "Сидоров", "Киров", 15, 122);
//        Student s4 = new Student("Даша", "Самакина", "Самара", 15, 13);
//        Student s5 = new Student("Лена", "Петрова", "Тольятти", 45, 124);
//        Student s6 = new Student("Оксана", "Ильина", "Чебоксары", 34, 325);
//
//        List<Student> listStud = new ArrayList<>();
//        listStud.add(s1);
//        listStud.add(s2);
//        listStud.add(s3);
//        List<Student> listStud2 = new ArrayList<>();
//        listStud2.add(s4);
//        listStud2.add(s5);
//        listStud2.add(s6);
//
//        StudentGroup group1 = new StudentGroup(listStud, 100);
//        StudentGroup group2 = new StudentGroup(listStud2, 99);
//        List<StudentGroup> groupsList = new ArrayList<>();
//        groupsList.add(group1);
//        groupsList.add(group2);
//        Collections.sort(groupsList);
//        StudentSteam course1 = new StudentSteam(groupsList, 3366);
//        Collections.sort(course1.getStudentsGroups());
//        for (StudentGroup group : course1) {
//            System.out.println(group);
//        }
        Teacher person1 = new Teacher("Sasha", "Petrov", "Moscow", 34);
        person1.setLevel("eee");
        person1.setTeacherId(456);


        Student s1 = new Student("Николай", "Афанасьев", "Чебоксары", 35, 1);
       // EmploeeController contrEmp = new EmploeeController();


        TeacherController.paySalary(person1);
        //EmploeeController.paySalary((s1); // типо-безопасный благодаря Generic
        Integer[]   studHours = {123, 123, 345, 543, 645};
        System.out.println(EmploeeController.means(studHours));
        Double empSalary[] = {23.34, 345.43, 321.12};
        System.out.printf("%.2f",EmploeeController.means(empSalary));
    }
}
