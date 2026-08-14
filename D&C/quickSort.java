public class quickSort {
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quickS(int arr[], int si, int ei){
        if(si>=ei) return;

        int pivotIdx = partition(arr, si, ei);
        quickS(arr, si, pivotIdx-1);
        quickS(arr, pivotIdx+1, ei);
    }
    public static int partition(int arr[], int si, int ei){
        int j=si-1;
        int pivot = arr[ei];
        for(int i=si;i<ei;i++){
            if(arr[i]<pivot){
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }    
        j++;
        int temp = pivot;
        arr[ei] = arr[j];
        arr[j] = temp;
        return j;
    }
    public static void main(String[] args) {
        int arr[] = {5,6,4,3,8,1};
        quickS(arr, 0, arr.length-1);
        printArr(arr);
    }
}
