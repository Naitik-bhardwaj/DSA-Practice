public class LinkedList {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
           head = tail = newNode;
           return;
        }
        newNode.next = head;
        head = newNode;
    }

    //  REVERSE A LINKEDLIST..
    public static void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void print(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //  remove nth node friom end of the linkedlist

    public static void removeNth(int n){
        Node temp = head;
        int sz = 0;
        while(temp!=null){
            temp = temp.next;
            sz++;
        }
        if(sz == n){
            head = head.next;
            return;
        }
        //sz - n
        int i=1;
        int iToFind = sz-n;
        Node prev = head;
        while(i<iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

//  CHECK IF A LINKEDLIST IS A PALLINDROME OR NOT ?
    public static Node findMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static boolean isPallindrome(){
        if(head == null && head.next == null){
            return true;
        }
        //find mid node
        Node mid = findMiddle(head);

        //Reverse second half
        Node curr = mid;
        Node prev = null;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        //check if equal
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(9);
        //ll.print();
        //ll.reverse();
        //ll.print();
        //removeNth(1);
        //ll.print();
        System.out.println(isPallindrome());


    }
}
