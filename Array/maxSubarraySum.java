public class maxSubarraySum {
    public static void maxSub(int[] arr){
        // int currSum=0, maxSum=Integer.MIN_VALUE;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i;j<arr.length;j++){
        //         currSum=0;
        //         for(int k=i;k<=j;k++){
        //             currSum+=arr[k];
        //         }
        //         if(maxSum<currSum){
        //             maxSum = currSum;
        //         }
        //     }
        // }

        int cs = arr[0];
        int ms = arr[0];
        for(int i=1;i<arr.length;i++){
            cs = Math.max(arr[i], cs+arr[i]);
            ms = Math.max(cs, ms);
        }
        System.out.println("Max Subarray sum is :"+ms);
    }
    public static void main(String[] args) {
        int[] arr = {4,6,-1,-6,1};
        maxSub(arr);
    }
}
