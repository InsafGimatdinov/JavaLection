import java.util.HashMap;
import java.util.Map;

public class Lection5 {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "one");
        db.put(2, "two");
        db.put(null, "!null");
        System.out.println(db); // {null = !null, 1 = "one", 2 = "two"}
        System.out.println(db.get(44));
        // db.remove(null);
        System.out.println(db); // {1 = "one"}
        System.out.println(db.containsValue("one")); // true
        // System.out.println(db.containsValue(1));  // false
        // System.out.println(db.containsKey("one")); // false
        System.out.println(db.containsKey(1));  // true
        System.out.println(db.keySet());
        System.out.println(db.values());
    }
}
