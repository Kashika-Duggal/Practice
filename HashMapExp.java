
import java.util.HashMap;
public class HashMapExp {

    public static void main(String[] args) {

         HashMap< String, Character> map = new HashMap<String, Character>();

        // Adding elements to the Map
        // using standard put() method
        map.put("vishal", 'A');
        map.put("sachin", 'C');
        map.put("vaibhav", 'B');

        // Print size and content of the Map
        System.out.println("Orignal list " + map);
        
        Character value = map.remove("sachin");
        System.out.println("Removed value: " + value);
        
        System.out.println("Updated HashMap: " + map);

        
    }

 

}