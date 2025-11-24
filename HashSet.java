import java.util.*;

public class HashSet {
    public static void main(String[] args) {
        Set<String> set = new java.util.HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C");
        set.add("C++");
        // set.add("C++");//Does't allow duplicates...

        System.out.println("Set Contains: " + set);
    }
}
