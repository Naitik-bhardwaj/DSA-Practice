import java.util.*;
public class bstToBalancedBST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void inorder(Node root, ArrayList<Integer> ans){
        if(root == null) return ;
        inorder(root.left, ans);
        ans.add(root.data);
        inorder(root.right, ans);
    }
    public static Node balancedbst(ArrayList<Integer> ans, int st, int end){
        if(st > end) return null;
        int mid = (st+end)/2;
        Node newRoot = new Node(ans.get(mid)) ;
        newRoot.left = balancedbst(ans, st, mid-1);
        newRoot.right = balancedbst(ans, mid+1, end);
        return newRoot;
    }
    public static void inorderAns(Node root){
        if(root == null) return;
        inorderAns(root.left);
        System.out.print(root.data+" ");
        inorderAns(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.right = new Node(10);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        Node s = balancedbst(ans, 0, ans.size()-1);
        inorderAns(s);
    }
}
