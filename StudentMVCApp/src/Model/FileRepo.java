package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class FileRepo {
    private String filename;
    private List<Student> students;

    public FileRepo(String filename) {
        this.filename = filename;
        try (FileWriter fw = new FileWriter(filename, true)) {
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public void readAllStudentsFromFile() {
        try {
           File file =  new File(filename);
           FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line!= null){
                String[] param = line.split(" ");
                Student pers = new Student(param[0], param[1],Integer.parseInt(param[2]), Long.parseLong(param[3]));
                students.add(pers);
                line = reader.readLine();
            }


        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveStudentsToFile(){
        try (FileWriter fw = new FileWriter(filename, true)) {
            for (Student pers: students){
                fw.write(pers.getFirstName()+" "+pers.getLastName() +" "+pers.getAge()+" "+pers.getId() +"\n" );
            }
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}