import java.util.*;

public class pq{
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.add(4);
        p.add(3);
        p.add(6);
        p.add(1);
        p.add(2);
        while(!p.isEmpty()){
            System.out.print(p.peek()+" ");
            p.remove();
        }
    }
}