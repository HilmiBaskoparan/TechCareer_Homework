
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        
        /*
            Map Interface (Key, Value)
            - A map contains values on the basis of key, i.e. key and value pair. 
            - Each key and value pair is known as an entry.
            - contains UNIQUE keys
            - A Map is useful if you have to search, update or delete elements on the basis of a key.
            
            HashMap Class
            - It allows us to store the null elements as well, but there should be only one null key.
            - Since Java 5, it is denoted as HashMap<K,V>, where K stands for key and V for value.
            - contains values based on the key.
            - contains only unique keys.
            - have one null key and multiple null values.
            - non synchronized.
            - maintains no order.
        
            LinkedHashMap Class
            - Key, Value
            - contains UNIQUE elements.
            - may have one null key and multiple null values.
            - non synchronized.
            - maintains insertion order.
        */
        
        HashMap<String, String> countries = new HashMap<>();
        
        countries.put("EN", "England");
        countries.put("TR", "Turkey");
        countries.put("USA", "United States");
        countries.put("FR", "France");
        countries.put("GB", "Germany");
        
        System.out.println(countries);
        
        System.out.println("Size    : " + countries.size());
        System.out.println("get(TR) : " + countries.get("TR"));
        
        System.out.println(countries.containsKey("TR"));
        System.out.println(countries.containsValue("Turkey"));
        countries.remove("FR");
        System.out.println("Size    : " + countries.size());
        countries.clear();
        System.out.println("Size    : " + countries.size());
        
        
        // LinkedHashMap
        System.out.println("\n");
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        
        lhm.put(5012, "Hilmi");
        lhm.put(1234, "Hacer");
        lhm.put(5555, "Ahmet");
        
        System.out.println(lhm);
        System.out.println(lhm.size());
        System.out.println(lhm.get(1111));
        System.out.println(lhm.isEmpty());
        System.out.println(lhm.containsKey(5012));
        System.out.println(lhm.containsValue("Mehmet"));
        lhm.remove(5555);
        System.out.println("Last view of MAP: " + lhm);
        
    }
}
