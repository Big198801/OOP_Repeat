package Model;

import Controller.iGetModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ModelHash  implements iGetModel {
    private HashMap<Long, Student> studentHashMap;

    public ModelHash(HashMap<Long, Student> studentHashMap){
        this.studentHashMap = studentHashMap;
    }

    /**
     * метод для возвращения списка студентов из hashMap
     * @return List список
     */
    public List<Student> getAllStudent(){
        List<Student> studentList = new ArrayList<>();
        for (var pers: studentHashMap.entrySet()){
            studentList.add(pers.getValue());

        }
        return studentList;
    }
}
