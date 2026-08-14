public class BinaryS {
    public static int binaryS(int[] arr, int key){
        int start=0, end=arr.length;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                start = mid+1;
            } else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,6,7,21};
        int idx = binaryS(arr, 5);
        System.out.println(idx);
    }
}
