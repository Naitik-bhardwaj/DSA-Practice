import java.util.*;
public class CountDistinct {
    public static int count(int[] arr){
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            h.add(arr[i]);
        }
        return h.size(); 
        
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 7, 5, 2, 1, 7, 5};
        System.out.println(count(arr));
    }
}
