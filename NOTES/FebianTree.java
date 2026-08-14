import java.util.*;
public class FebianTree{
    static void build(int[] arr, int[] ft){
        int n = arr.length;
        for(int i=1;i<=n;i++){
            int j=i;
            while(j<n){
                ft[j] = ft[j] + arr[i];
                j = j + (j&-j);
            }
        }
    }
    static int rangeSum(int[] ft, int r){
        int i=r;
        int s = 0;
        while(i > 0){
            s = s+ft[i];
            i = i-(i&-i);
        }
        return s;
    }
    static void update(int[] ft, int idx, int v){
        int i = idx;
        while(i <= ft.length){
            ft[i] = ft[i] + v;
            i = i+(i&-i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 11;
        int[] arr = {0, 3, 5, 1, 2, 4, 8, 6, 9, 7, 2};
        int[] ft = new int[n+1];
        build(arr, ft);
        int t = 5;
        while(t != 0){
            int 
        }
    }
}