public class MSSbyPrefix {
    public static void PrefixSum(int[] arr){
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];// j is end ,, i is start...
            }
            if(maxSum<currSum){
                maxSum = currSum;
            }
        }
        System.out.println("Max Sum is " + maxSum);
    }
    public static void main(String[] args) {
        int[] arr = {5,6,4,2,9};
        PrefixSum(arr);
    }
}
