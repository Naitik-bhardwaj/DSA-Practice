public class xtopowern{
    public static int power(int x, int n){
        if(x == 0 || x==1){
            return x;
        }
        if(n==1) return x;
        if(n==0) return 1;
        int halfpowerSq = power(x, n/2) * power(x, n/2);
        if(n % 2 != 0){
            return x*halfpowerSq;
        }
        return halfpowerSq;
    }
    public static void main(String[] args) {
        int x = 2, n = 5;
        System.out.println(power(x, n));
    }
}