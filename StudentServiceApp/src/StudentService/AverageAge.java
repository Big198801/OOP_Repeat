package StudentService;

import StudentDomen.User;

import java.util.ArrayList;
import java.util.List;

public class AverageAge <T extends User> {
    private  List<T> peoples;

    public AverageAge(List<T> peoples){
        this.peoples = peoples;
    }

    public <T extends User> int avgAge(List<T> peoples){
        int avg = 0;
        for (T pepl: peoples) {
            avg += pepl.getAge();
        }return avg/ peoples.size();

    };
}
