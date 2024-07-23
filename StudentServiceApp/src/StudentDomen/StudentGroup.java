package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> students;
    private int groupId;

    public StudentGroup(List<Student> students, int groupId){
       this.students = students;
       this.groupId = groupId;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public int getgroupId(){
        return groupId;
    }

    @Override
    public String toString(){
       return "\nid группы: "+ groupId +
               "\nколичество студентов: "
               + students.size() +
               "\nСписок студентов:\n"+ getStudents();
    }

    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index<students.size();
            }

            @Override
            public Student next() {
                if (!hasNext()){
                    return null;
                }
                return students.get(index++);
            }
        };
    }

    @Override
    public int compareTo(StudentGroup o) {
        if (this.getStudents().size() == o.getStudents().size()) {
            if (this.getgroupId() == o.getgroupId()) {
                return 0;
            }
            if (this.getgroupId() < o.getgroupId()){
                return -1;
            }
            return 1;
        }
        if (this.getStudents().size() < o.getStudents().size()){
            return -1;
        }
        return 1;
    }
}
