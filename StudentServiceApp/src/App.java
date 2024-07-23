import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {
        User u1 = new User("Сергей", "Иванов", "Чебоксары", 39);
        Student s1 = new Student("Николай", "Афанасьев", "Чебоксары", 35, 1 );
        Student s2 = new Student("Иван", "Петров", "Москва", 15, 121 );
        Student s3 = new Student("Егор", "Сидоров", "Киров", 15, 122 );
        Student s4 = new Student("Даша", "Самакина", "Самара", 15, 13 );
        Student s5 = new Student("Лена", "Петрова", "Тольятти", 28, 124 );
        Student s6 = new Student("Оксана", "Ильина", "Чебоксары", 34, 325 );
        List<Student> listStud = new ArrayList<>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);
        StudentGroup group = new StudentGroup(listStud);

        for (Student st:group) {
            System.out.println(st);
        }
        System.out.println("++++++++++++++");
        Collections.sort(listStud);

        for (Student st:group) {
            System.out.println(st);
        }
    }
}
