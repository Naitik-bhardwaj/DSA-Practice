public class MergeSort {
    public static void mergeSort(int arr[], int si, int ei){
        if(si>=ei) {
            return;
        }
        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int i=si;
        int j = mid+1;
        int k = 0;
        int[] temp = new int[ei-si+1];
        while(i<=mid && j<=ei){
            if(arr[i]>arr[j]){
                temp[k] = arr[j];
                j++;
            }
            else{
                temp[k] = arr[i];
                i++;
            }
            k++;
        }
        while(i<=mid){
            temp[k] = arr[i];
            i++; k++;
        }
        while(j<=ei){
            temp[k] = arr[j];
            k++; j++;
        }

        for(int m=0;m<temp.length;m++){
            arr[si] = temp[m];
            si++;
        }
        
    }
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {4,7,8,2,9};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}