public class toggle{
    public static void main(String[] args) {
        int n = 7, k=3;
        int bitmask = 1<<(k-1);
        System.out.println(n ^ bitmask);
    }
}