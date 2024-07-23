package StudentDomen;

import com.sun.source.tree.BreakTree;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {
    private List<StudentGroup> course;
    private int steamNumber;

    public StudentSteam(List<StudentGroup> course, int steamNumber){
        this.course = course;
        this.steamNumber = steamNumber;
    }
    public List<StudentGroup> getStudentsGroups(){
        return course;
    }

    public int getSteamNumber(){
        return steamNumber;
    }

    

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < course.size();
            }

            @Override
            public StudentGroup next() {
                if (!hasNext()) {
                    return null;
                }
                return course.get(index++);
            }
        };
    }
}
