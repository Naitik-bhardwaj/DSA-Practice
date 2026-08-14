public class pairs {
    public static void pairsNonRepeated(int[] arr){
        for(int i=0;i<arr.length;i++){
            int d = arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+d+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        pairsNonRepeated(arr);
    }
}
