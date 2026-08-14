public class KadansAlgo {
    public static void kadans(int[] arr){
        int cs=0, ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs = cs+arr[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max sum is : "+ ms);
    } 
    public static void main(String[] args) {
        int[] arr = {2,5,6,4,1,9};
        kadans(arr);
    }
}
