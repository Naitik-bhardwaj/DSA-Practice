public class secondLargest {
    public static int second(int[] arr){
        int largest = Integer.MIN_VALUE;
        int Slargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                Slargest = largest;
                largest = arr[i];
            }
            if(arr[i] > Slargest && arr[i] != largest){
                Slargest = arr[i];
            }
        }
        return Slargest;
    }
    public static void main(String[] args) {
        int arr[] = {3, 5, 2, 9, 6};
        System.out.println(second(arr));
    }
}
