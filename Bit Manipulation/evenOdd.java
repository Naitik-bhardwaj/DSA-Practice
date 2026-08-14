class evenOdd {
    public static void check(int n){
        // Way 1 
        
        // if((n&1)==0){
        //     System.out.println("Even number");
        // } else {
        //     System.out.println("Odd number");
        // }

        // Way 2

        if(((n^1) & 1) == 1) System.out.println("even");
        else System.out.println("odd");

        
        // Way 3

        // if((n^1) < n) System.out.println("odd");
        // else System.out.println("even");
    }
    public static void main(String args[]){
        check(8);
        check(9);
    }
}