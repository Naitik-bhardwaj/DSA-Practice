import java.util.*;
public class unionIntersection {
    public static int union(int[] arr1, int[] arr2){
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            h.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            h.add(arr2[i]);
        }
        return h.size();
    }
    public static int intersection(int[] arr1, int[] arr2){
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            h.add(arr1[i]);
        }
        int count = 0;
        for(int i=0;i<arr2.length;i++){
            if(h.contains(arr2[i])){
                count++;
                h.remove(arr2[i]);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 7, 5, 4};
        int[] arr2 = {5, 4, 9};
        System.out.println(union(arr1, arr2));
        System.out.println(intersection(arr1, arr2));
    }
}
