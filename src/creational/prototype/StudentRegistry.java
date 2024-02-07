package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    private Map<String, Student> studentRegistry = new HashMap<>();

    void addToRegistry(String key, Student student){
        studentRegistry.put(key, student);
    }

    Student getPrototype(String key){
        return studentRegistry.get(key);
    }
}
