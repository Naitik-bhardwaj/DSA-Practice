public class GetIthBit {
    public static int getIth(int n, int i){
        int bitmask = 1<<i;
        if((n&bitmask)==0){
            return 0;
        } return 1;
    }
    public static void main(String[] args) {
        System.out.println(getIth(8,3));
    }
}
