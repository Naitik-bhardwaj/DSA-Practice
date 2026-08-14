import java.util.*;
public class ActivitySelection{
    public static int activity(int[] start, int[] end){
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 1;
        ans.add(0);
        int lastEnd = end[0];
        for(int i=1;i<start.length;i++){
            if(start[i] >= lastEnd){
                count++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println(ans);
        return count;
    }
    public static void main(String[] args) {
        int[] start ={1,3,0,5,8, 5} ;
        int[] end = {2,4,6,7,9,9};
        
        System.out.println(activity(start, end));

    }
}