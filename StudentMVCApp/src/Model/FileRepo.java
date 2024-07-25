package Model;

import Controller.iGetModel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileRepo implements iGetModel {
    private String fileName;
    private List<Student> students;
    public FileRepo(String fileName) {
        this.fileName = fileName;
        this.students = new ArrayList<>();
        try (FileWriter fw = new FileWriter(fileName, true)){
         fw.flush();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void addStudentsList(List<Student> students){
        for (Student pers: students){
            this.students.add(pers);
        }

    }

    public void readAllStudentsFromFile(){
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null){
                String[] param = line.split(" ");
                Student person = new Student(param[0], param[1], Integer.parseInt(param[2]), Long.parseLong(param[3]) );
                students.add(person);
                line = reader.readLine();
            }

        }
        catch (Exception e){
            e.getMessage();
        }
    }

    public void saveAllStudentsToFile(){
        try (FileWriter fw = new FileWriter(fileName, true)){
            for (Student persons: students){
                fw.write(persons.getFirstName() + " " + persons.getLastName()+ " " + persons.getAge() +" " +  persons.getId() + "\n");
            }
            fw.flush();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void saveAllStudentsToNEWFile(String newFileName){
        try (FileWriter fw = new FileWriter(newFileName, true)){
            for (Student persons: students){
                fw.write(persons.getFirstName() + " " + persons.getLastName()+ " " + persons.getAge() +" " +  persons.getId() + "\n");
            }
            fw.flush();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Student> getAllStudent() {
        readAllStudentsFromFile();
        return students;
    }
}
