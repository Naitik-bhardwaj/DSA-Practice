import java.util.*;
public class build {
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
    public static Node insert(Node root, int val){
        if(root == null) {
            root = new Node(val);
            return root;
        }
        
        if(root.data > val){
            root.left = insert(root.left, val);
        } else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root == null) return ;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean search(Node root, int key){
        if(root == null) return false;
        if(root.data == key){
            return true;
        }
        else if(root.data < key){
            return search(root.right, key);
        } else{
            return search(root.left, key);
        }
    }


    public static Node delete(Node root, int val){
        if(root.data < val){
            root.right = delete(root.right, val);
        }
        else if(root.data > val){
            root.left = delete(root.left, val);
        } else{
            // case 1 - leaf node
            if(root.left == null && root.right == null){
                return null;
            }
            // case 2 - single child
            if(root.left == null) return root.right;
            else if(root.right == null) return root.left;
            
            // case 3 - both child
            Node IS = findInorder(root.right);
            root.data = IS.data;
            delete(root.right, IS.data);
        }
        return root;
    }
    public static Node findInorder(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2){
        if(root == null) return;
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data < k1){
            printInRange(root.right, k1, k2);
        } else{
            printInRange(root.left, k1, k2);
        }
    }
    
    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }
    public static void printRoot2leaf(Node root, ArrayList<Integer> path){
        if(root == null) {
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        } 
        printRoot2leaf(root.left, path);
        printRoot2leaf(root.right, path);
        path.remove(path.size()-1);

    }
    
    static Node prev = null;
    
    public static boolean validateBST(Node root){
        if(root == null) return true;
        if(!validateBST(root.left)) return false;
        if(prev != null && root.data <=prev.data) return false;

        prev = root;
        return validateBST(root.right);
    
    }
    public static void main(String[] args) {
        int values[] = {5, 1, 2, 6, 3, 4,  7};
        Node root = null;
        for(int i=0;i<values.length;i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        // System.out.println(search(root, 5));
        // root = delete(root, 1);
        // inorder(root);
        // printInRange(root, 4, 7);
        // printRoot2leaf(root, new ArrayList<>());

        
        if(validateBST(root)) {
            System.out.println("Valid");
        }else{
            System.out.println("Not valid");
        }
    }
}