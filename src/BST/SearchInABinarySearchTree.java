package BST;

import com.sun.source.tree.Tree;

class TreeNode{
   int val;
   TreeNode left, right;

   TreeNode(){}

   TreeNode(int val){ this.val  = val; }

   TreeNode(int val, TreeNode left, TreeNode right){
       this.val = val;
       this.left = left;
       this.right = right;
   }

}

public class SearchInABinarySearchTree {
    TreeNode root;

    void insert(int key){
        root = insertRec(root,key);
    }

    public TreeNode insertRec(TreeNode root, int key){
        if(root == null){
            root = new TreeNode(key);
            return root;
        }

        if(key < root.val){
            root.left = insertRec(root.left, key);
        } else if (key > root.val) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    public void search(int key){
        TreeNode result = searchBST(root,key);
        System.out.print(result.val);
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null || root.val == val){
            return root;
        }

        if(val < root.val){
            return searchBST(root.left, val);
        }else {
            return searchBST(root.right, val);
        }
    }

    void inorder(){
        inorderRec(root);
    }

    public void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.val + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        SearchInABinarySearchTree bst = new SearchInABinarySearchTree();

        bst.insert(4);
        bst.insert(2);
        bst.insert(7);
        bst.insert(1);
        bst.insert(3);

        bst.search(7);
//        bst.inorder();


    }
}
