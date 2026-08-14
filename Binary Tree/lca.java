import java.util.*;
public class lca {
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
    public static boolean getPath(Node root, int n, ArrayList<Node> path){
        if(root == null) return false;
        path.add(root);
        if(root.data == n) return true;
        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);
        if(foundLeft || foundRight ){
            return true;
        }
        path.remove(root);
        return false;
    }
    public static Node Lca(Node root, int n1, int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getPath(root, n1, path1);
        getPath(root, n2, path2);
        int i=0;
        for(;i<path1.size() && i<path2.size();i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
           
        } 
        Node lca = path1.get(i-1);
        return lca;


    }

    // lca 2
    public static Node lca2(Node root, int n1, int n2){
        if(root == null) return null;
        if(root.data == n1 || root.data == n2) return root;

        Node leftlca = lca2(root.left, n1, n2);
        Node rightlca = lca2(root.right, n1, n2);
        if(rightlca == null) return leftlca;
        if(leftlca == null)  return rightlca;
        return root;
    }

    public static int lcaDist(Node lca,int n){
        if(lca == null) return -1;
        if(lca.data == n) return 0;
        int ld = lcaDist(lca.left, n);
        int rd = lcaDist(lca.right, n);
        if(ld == -1 && rd == -1) return -1;
        else if(ld == -1) return rd+1;
        else return ld+1;

    } 

    public static int minDist(Node root, int n1, int n2){
        Node lca = lca2(root, n1, n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);
        return dist1 + dist2;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);        
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        //System.out.println(lca2(root, 4, 5).data);
        System.out.println(minDist(root, 4, 6));

    }
}
