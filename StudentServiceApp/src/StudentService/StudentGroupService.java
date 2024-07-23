package StudentService;

import StudentDomen.StudentGroup;

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
}
