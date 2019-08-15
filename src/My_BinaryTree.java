
public class My_BinaryTree implements BinaryTree {
    private Node root;

    public My_BinaryTree() {
    }

    public My_BinaryTree(Node root) {
        this.root = root;
    }

    @Override
    public boolean isEmpty() {
        return root==null;
    }

    @Override
    public int size() {
        System.out.println("size is: ");
        return this.size(root);
    }

    public int size(Node root) {
        if(root!=null){
            int size_l = this.size(root.left);
            int size_r = this.size(root.right);
            return size_l+size_r+1;
        }
        return 0;
    }

    @Override
    public int getHeight() {
        System.out.println("height is ");
        return this.getHeight(root);
    }

    private int getHeight(Node root) {
        if(root!=null){
            //left tree height
            int height_l = this.getHeight(root.left);
            //right tree height
            int height_r = this.getHeight(root.right);
            //return max+1
            return 1+Math.max(height_l,height_r);
        }

        return 0;
    }

    @Override
    public Node findKey() {
        return null;
    }

    @Override
    public void preOrederTraverse() {
        System.out.println("preOrederTraverse: ");
        preOrederTraverse(root);
        System.out.println();
    }

    private void preOrederTraverse(Node root){
        if(root!=null){
            //1.output root
            System.out.print(root.getValue()+" ");
            //2.preOrederTraverse(left)
            this.preOrederTraverse(root.left);
            //3.preOrederTraverse(right)
            this.preOrederTraverse(root.right);

        }
    }

    @Override
    public void inOrederTraverse() {
        System.out.println("inOrederTraverse: ");
        this.inOrederTraverse(root);
        System.out.println();
    }

    private void inOrederTraverse(Node root) {
        if(root!=null) {
            //left
            this.inOrederTraverse(root.left);
            //root
            System.out.print(root.getValue()+" ");
            //right
            this.inOrederTraverse(root.right);
        }
    }

    @Override
    public void postOrederTraverse() {
        System.out.println("postOrederTraverse");
        this.postOrederTraverse(root);
        System.out.println();
    }

    @Override
    public void postOrederTraverse(Node node) {
        if(node!=null){
            this.postOrederTraverse(node.left);
            this.postOrederTraverse(node.right);
            System.out.print(node.getValue()+" ");

        }
    }

    @Override
    public void preOrederByStack() {

    }

    @Override
    public void inOrederByStack() {

    }

    @Override
    public void postOrederByStack() {

    }

    @Override
    public void levelOrder() {

    }


}


/**
 *   //1.output root
 *             System.out.print(root.getValue()+" ");
 *             //2.preOrederTraverse(left)
 *             My_BinaryTree btree_left= new My_BinaryTree(root.left);
 *             btree_left.preOrederTraverse();
 *             //3.preOrederTraverse(right)
 *             My_BinaryTree btree_right= new My_BinaryTree(root.right);
 *             btree_right.preOrederTraverse();
 */
