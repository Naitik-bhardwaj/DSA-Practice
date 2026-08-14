import java.util.*;
public class AddToArrayFormInteger {
    public static void solution(int[] arr, int k){
        ArrayList<Integer> ans = new ArrayList<>();
        int p = arr.length-1;
        int carry = 0;
        while(p>=0 || k>0){
            int numval = 0;
            if(p>=0){
                numval = arr[p];
            }
            int d = k % 10;
            int sum = numval + d + carry;
            int digit = sum % 10;
            carry = sum / 10;
            ans.add(digit);
            p--;
            k = k/10;
        }
        if(carry > 0){
            ans.add(carry);
        }
        Collections.reverse(ans);
        System.out.print(ans);
    }
    public static void main(String[] args) {
        int[] arr = {3,5,7,2};
        int k = 342;
        solution(arr, k);
    }
}
