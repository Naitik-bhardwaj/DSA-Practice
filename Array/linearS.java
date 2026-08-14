class linearS {
    public static int findIdx(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,7,1,6};
        int idx = findIdx(arr,7);
        System.out.println(idx);
    }
}