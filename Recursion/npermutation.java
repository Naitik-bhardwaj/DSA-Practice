public class npermutation {
    public static void permutation(int[] arr, int n){
        if(n==1){
            printArr(arr);
            return;
        }
        for(int i=0;i<n;i++){
            int temp = arr[i];
            arr[i] = arr[n-1];
            arr[n-1] = temp;
            permutation(arr, n-1);
            int temp2 = arr[i];
            arr[i] = arr[n-1];
            arr[n-1] = temp2;
        }
    }
    public static void printArr(int[] arr){
        for(int num : arr){
            System.out.print(num);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 3;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = i+1;  
        }
        permutation(arr, n);
    }
}
