package set;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
    public static void main(String[] args) {
        Map<String,Integer> maps= new HashMap<>();

        maps.put("SV001",100);
        maps.put("SV002",200);
        maps.put("SV003",300);
        System.out.println(maps.get("SV001"));
    }
}
