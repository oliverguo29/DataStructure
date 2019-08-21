package dataStructure;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

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
    public Node findKey(int value) {
        return this.findKey(value,root);
    }

    private Node findKey(int value,Node root){
        if(root==null){
            return  null;
        }else if(root!=null&&root.getValue().equals(value)){
            return root;
        }else{
            Node n1=this.findKey(value,root.left);
            Node n2=this.findKey(value,root.right);

            if(n1!=null&&n1.getValue().equals(value)){
                 return n1;
            }else if(n2!=null&&n2.getValue().equals(value)){
                return n2;
            }else {
                return null;
            }
        }
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
    /**
     * 先根遍历，拿到一个节点的指针，先判断是否为空，不为空就先访问该结点，然后直接进栈，
     * 接着遍历左子树；为空则要从栈中弹出一个节点来，
     * 这个时候弹出的结点就是其父亲，然后访问其父亲的右子树，直到当前节点为空且栈为空时，算法结束.
     */
    @Override
    public void preOrederByStack() {
        Deque<Node> stack = new LinkedList<Node>();
        Node current =root;

        while (current!=null||!stack.isEmpty()){
            if(current!=null){
                System.out.print(current.getValue()+" ");
                stack.push(current);
                current=current.left;
            }else {
                 current = stack.pop();
                 current=current.right;

            }
        }




    }

    @Override
    public void inOrederByStack() {         //left root right
        Deque<Node> stack = new LinkedList<Node>();
        Node current =root;

        while (!stack.isEmpty()||current!=null){
            while (current!=null) {
                stack.push(current);
                current = current.left;
            }
            if(!stack.isEmpty()){
                current = stack.pop();
                System.out.print(current.getValue()+" ");
                current=current.right;
            }
        }
    }

    @Override
    public void postOrederByStack() {

    }

    @Override
    public void levelOrder() {
        if(root==null){
           return;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (queue.size()!=0){
            int len=queue.size();
            for(int i=0;i<len;i++) {
                Node tmp = queue.poll();
                System.out.print(tmp.getValue()+" ");
                if (tmp.left != null) {
                    queue.add(tmp.left);
                }
                if (tmp.right != null) {
                    queue.add(tmp.right);
                }
            }
        }
    }


}


/**
 *   //1.output root
 *             System.out.print(root.getValue()+" ");
 *             //2.preOrederTraverse(left)
 *             dataStructure.My_BinaryTree btree_left= new dataStructure.My_BinaryTree(root.left);
 *             btree_left.preOrederTraverse();
 *             //3.preOrederTraverse(right)
 *             dataStructure.My_BinaryTree btree_right= new dataStructure.My_BinaryTree(root.right);
 *             btree_right.preOrederTraverse();
 */
