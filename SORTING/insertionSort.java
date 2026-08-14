public class insertionSort {
    public static void insertionS(int[] arr){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct position to insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,5,7,8,4,1};
        insertionS(arr);
        printArr(arr);


    }
}
