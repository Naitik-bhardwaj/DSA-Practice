public class nthFib{
    public static int findFib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fbn1 = findFib(n-1);
        int fbn2 = findFib(n-2);
        return fbn1 + fbn2;
    }
    public static void main(String[] args){
        int n = 5;
        System.out.print(findFib(n));
    }
}