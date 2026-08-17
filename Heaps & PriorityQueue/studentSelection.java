import java.util.*;
public class studentSelection {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> p = new PriorityQueue<>();
        // highest rank lowest priority
        p.add(new Student("A", 5));
        p.add(new Student("B", 6));
        p.add(new Student("C", 8));
        p.add(new Student("D", 32));
        p.add(new Student("E", 43));

        while(!p.isEmpty()){
            System.out.println(p.peek().name+ "->" + p.peek().rank + " ");
            p.remove();
        }


    }
}
