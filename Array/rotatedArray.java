import java.util.Scanner;
public class rotatedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int temp = n;
        int digits = 0;
        while(temp!=0){
            digits++;
            temp = temp/10;
        }
        //System.out.println(digits);
        k = k%digits;
        if(k<0){
            k = k + digits;
        }
        int ed = n%(int)Math.pow(10, digits-k);
        ed = ed*(int)Math.pow(10, k);
        int fd = n / (int)Math.pow(10, digits-k);
        int finalNum = ed + fd;
        System.out.println(finalNum);
    }
}