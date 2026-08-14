public class firstOcc {
    public static int first(int[] arr, int key, int i){
        if(i == arr.length) return -1;
        if(arr[i] == key) return i;
        return first(arr, key, i+1);
    }
    public static int last(int[] arr, int key, int i){
        if(i==arr.length) return -1;
        int isFound = last(arr, key, i+1);
        if(isFound == -1 && arr[i]==key) return i;
        return isFound;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 3,5, 7, 5, 7};
        int key = 5;
        //System.out.println(first(arr, key, 0));
        System.out.println(last(arr, 5, 0));
    }
}
