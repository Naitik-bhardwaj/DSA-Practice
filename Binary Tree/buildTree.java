import java.util.* ;

public class buildTree {
    static class Node{
        int data ;
        Node left ;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node buildtree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);
            return newNode;
        }

        // Preorder Traversal
        public static void preOrder(Node root){
            if(root == null){
                // System.out.print("-1"+ " ") ;
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void inOrder(Node root){
            if(root == null) return;
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        public static void postOrder(Node root){
            if(root == null) return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }

        public static void levelOrder(Node root){
            if(root == null) return;
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node curr = q.remove();
                if(curr == null){
                    System.out.println();
                    if(q.isEmpty()) break;
                    else q.add(null);
                }
                else{
                    System.out.print(curr.data+" ");
                    if(curr.left != null){
                        q.add(curr.left);
                    }
                    if(curr.right != null) {
                        q.add(curr.right); 
                    }
                }
            }

        }

        // height of the tree
        public static int height(Node root){
            if(root == null) return 0;
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh, rh) + 1;
        }

        // count of nodes
        public static int countOfNode(Node root){
            if(root == null){
                return 0;
            }
            int lc = countOfNode(root.left);
            int rc = countOfNode(root.right);
            return lc + rc + 1 ;
        }

        // Sum of nodes
        public static int sum(Node root){
            if(root == null) return 0;
            int ls = sum(root.left);
            int rs = sum(root.right);
            return ls + rs + root.data;
        }


        // public static int diameter(Node root){
        //     if(root == null) return 0;
        //     int ld = diameter(root.left);
        //     int rd = diameter(root.right);
        //     int lh = height(root.left);
        //     int rh = height(root.right);
        //     return Math.max(ld, Math.max(rd, lh + rh + 1));
        // }

        // static class Info{
        //     int d;
        //     int h;
        //     Info(int d, int h){
        //         this.d = d;
        //         this.h = h;
        //     }
        // }
        // public static Info diameter(Node root){
        //     if(root == null) return new Info(0, 0);
        //     Info leftInfo = diameter(root.left);
        //     Info rightInfo = diameter(root.right);
        //     int diam = Math.max(leftInfo.d, Math.max(rightInfo.d, leftInfo.h+rightInfo.h+1));
        //     int h = Math.max(leftInfo.h, rightInfo.h)+1;
        //     return new Info(diam, h);
        // }

        //  TOP VIEW OF A TREE
        static class Info{
            Node node;
            int hd;
            Info(Node node, int hd){
                this.node = node;
                this.hd = hd;
            }
        }
        public static void topView(Node root){
            Queue<Info> q = new LinkedList<>();
            HashMap<Integer, Node> h = new HashMap<>();
            int min = 0, max = 0;
            q.add(new Info(root, 0));
            q.add(null);
            while(!q.isEmpty()){
                Info curr = q.remove();
                if(curr == null){
                    if(q.isEmpty()) break;
                    else q.add(null);
                } 
                else{
                    if(!h.containsKey(curr.hd)) {
                        h.put(curr.hd, curr.node);
                    }
                    if(curr.node.left != null){
                        q.add(new Info(curr.node.left, curr.hd - 1));
                        min = Math.min(min, curr.hd-1);
                    }
                    if(curr.node.right != null){
                        q.add(new Info(curr.node.right, curr.hd + 1));
                        max = Math.max(max, curr.hd+1);
                    }
                }
            }
            for(int i=min;i<=max;i++){
                System.out.print(h.get(i).data+" ");
            }
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(nodes);
        // System.out.println(root.data);
        // tree.preOrder(root);
        // tree.inOrder(root);
        // tree.postOrder(root);
        // tree.levelOrder(root);
        // System.out.print(tree.height(root));
        // System.out.print(tree.countOfNode(root));
        //  System.out.print(tree.sum(root));
        // System.out.println(tree.diameter(root).d);
        tree.topView(root);
    }
}
