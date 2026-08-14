import java.util.*;
public class Solution{
    public static void main(String[] args) {
        
        int[] arr = {6, 8, 0, 1, 3};
        int[] ans = new int[arr.length];
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=i+1;j<arr.length;j++){
                
        //         if(arr[i] < arr[j]){
        //             ans[i] = arr[j];
        //             break;
        //         } else if(j == arr.length-1) ans[i] = -1;
        //          else{
        //             ans[i] = -1;
        //         }
                
        //     }
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(ans[i]+" ");
        // }

        Stack<Integer> s = new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            if(s.isEmpty()) ans[i] = -1;
            else ans[i] = arr[s.peek()];
            s.push(i);
        }
         for(int i=0;i<arr.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}