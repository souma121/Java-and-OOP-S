import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        Map<Integer, String> map=new HashMap<>();
        map.put(218, "Shruti Paul");
        map.put(229, "Soumajit Pal");
        map.put(215, "Balaram Mukherjee");

        System.out.println("The Map Contains: " + map);
        System.out.println("The Student of roll 215 is: " + map.get(215));

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
