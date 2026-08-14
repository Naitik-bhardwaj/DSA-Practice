public class std1 {
    public static void main(String[] args) {
        //Find all triplets in a sorted array that forms Geometric Progression


        int[] arr = {2, 8, 10, 15, 16, 30, 32, 64};
        int n = arr.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if((arr[j]*arr[j])==arr[i]*arr[k]){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
    }
}
