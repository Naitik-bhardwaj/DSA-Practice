public class tilingProblem {
    public static int tilesWay(int n){
        if(n==0 || n==1){
            return 1;
        }
        //vertical
        int fnm1 = tilesWay(n-1);

        //horizontal
        int fnm2 = tilesWay(n-2);
        return fnm1+fnm2;
    }
    public static void main(String[] args) {
        System.out.println(tilesWay(4));
    }
}
