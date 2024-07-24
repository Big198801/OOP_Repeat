package StudentService;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.UserComparator;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupService {
    //private int count;
    private List<StudentGroup> groups;

    public StudentGroupService(){
        this.groups = new ArrayList<>();
        //count++;

    }

    public List<StudentGroup> getAll(){
        return this.groups;
    }
    public List<Student> getSortedbyFioStudentGroup(int numberGroup){
        List<Student> students = new ArrayList<>(groups.get(numberGroup).getStudents());
        students.sort(new UserComparator<Student>());
        return students;
    }
}
