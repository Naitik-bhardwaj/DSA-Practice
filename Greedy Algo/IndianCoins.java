import java.util.*;
public class IndianCoins {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10, 20, 50, 100, 200, 500};
        int amount = 590;
        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=coins.length-1;i>=0;i--){
            if(coins[i] <= amount){
                while(coins[i]<=amount){
                    count++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println(count);
        System.out.println(ans);
        
    }
}
