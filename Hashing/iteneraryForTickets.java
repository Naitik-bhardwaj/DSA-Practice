import java.util.*;
public class iteneraryForTickets {
    public static String getStart(HashMap<String, String> hm){
        HashMap<String, String> rev = new HashMap<>();
        for(String key : hm.keySet()){
            rev.put(hm.get(key), key);
        }
        for(String key : hm.keySet()){
            if(!rev.containsKey(key)){
                return key; // starting point
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Chennai", "Bangaluru");
        hm.put("Mumbai", "Delhi");
        hm.put("Goa", "Chennai");
        hm.put("Delhi", "Goa");
        String start = getStart(hm);

        System.out.print(start);
        for(String key : hm.keySet()){
            System.out.print("->"+hm.get(start));
            start = hm.get(start);
        }
    }
}
