public class binaryString {
    //print all binary strings of size n without consecutive ones..
    public static void consecOnesRemove(int n, int lastPlace, String str){
        if(n==0) {
            System.out.println(str);
            return ;
        }
        if(lastPlace == 0){
            consecOnesRemove(n-1, 0, str+'0');
            consecOnesRemove(n-1, 1, str+'1');
        }
        else{
            consecOnesRemove(n-1, 0, str+'0');
        }
    }
    public static void main(String[] args) {
        consecOnesRemove(3, 0, "");
    }
}
