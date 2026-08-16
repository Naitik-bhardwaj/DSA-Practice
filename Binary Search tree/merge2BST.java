import java.util.*;
public class merge2BST {
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
    public static void inorder(Node root,ArrayList<Integer> ans){
        if(root == null) return;

        inorder(root.left, ans);
        ans.add(root.data);
        inorder(root.right, ans);

        }
        public static Node merge(ArrayList<Integer> ans1, ArrayList<Integer> ans2){
            int i=0, j=0;
            ArrayList<Integer> ans = new ArrayList<>();

            while(i < ans1.size() && j<ans2.size()){
                if(ans1.get(i) <= ans2.get(j)){
                    ans.add(ans1.get(i));
                    i++;
                }   
                else{
                    ans.add(ans2.get(j));
                    j++;
                }
            }
            while(i < ans1.size()){
                ans.add(ans1.get(i));
                i++;
            }
            while(j < ans2.size()){
                ans.add(ans2.get(j));
                j++;
            }
            return balancedTree(ans, 0, ans.size()-1);

        }
        public static Node balancedTree(ArrayList<Integer> ans, int st, int end){
            if(st > end){
                return null;
            }
            int mid = (st+end)/2;
            Node root = new Node(ans.get(mid));
            root.left = balancedTree(ans, st, mid-1);
            root.right = balancedTree(ans, mid+1, end);

            return root;

        }
        public static void inorder2(Node root){
            if(root == null){
                return ;
            }
            inorder2(root.left);
            System.out.print(root.data+" ");
            inorder2(root.right);
        }


    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        // inorder for root1
        ArrayList<Integer> ans1 = new ArrayList<>();
        ArrayList<Integer> ans2 = new ArrayList<>();
        inorder(root1, ans1);
        inorder(root2, ans2);

        Node s = merge(ans1, ans2);

        inorder2(s);
    }
}
