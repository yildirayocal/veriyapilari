package binary.odev;
public class BinaryOdev {

   class Node {
        int key;
        Node left, right;
 
        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }
    Node root;
    BinarySearchTree() { root = null; }
    BinarySearchTree(int value) { root = new Node(value); }
    void insert(int key) { root = insertRec(root, key); }
    Node insertRec(Node root, int key)
    {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        else if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
        return root;
    }
    void inorder() { inorderRec(root); }
    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
    public static void main(String[] args)
    {
        BinaryOdev tree = new BinaryOdev();
        tree.insert(48);
        tree.insert(73);
        tree.insert(99);
        tree.insert(71);
        tree.insert(17);
        tree.insert(410);
        tree.insert(8954);
        tree.insert(127);
        tree.insert(4140);
        tree.insert(8554);
        tree.inorder();
    }
}
