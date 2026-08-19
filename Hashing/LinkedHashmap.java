import java.util.*;
public class LinkedHashmap {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India" , 30);
        lhm.put("China", 39);
        lhm.put("Rusia", 30);
        // It has a proper order...
        System.out.println(lhm);
    }
}
