public class TestTree {

    public static void main(String[] args) {


    /**
     *          1
     *      4         2
     *        5     3   6
     *                     7
     */
    //create a tree
    Node node5 = new Node(5,null,null);
    Node node4 = new Node(4,null,node5);


    Node node3 = new Node(3,null,null);
    Node node7 = new Node(7,null,null);
    Node node6 = new Node(6,null,node7);

    Node node2 = new Node(2,node3, node6);

    Node node1 = new Node(1,node4,node2);

    My_BinaryTree btree = new My_BinaryTree(node1);
    My_BinaryTree btree2 = new My_BinaryTree();


    //is empty
        //System.out.println(btree.isEmpty());

    //pre-order
        btree.preOrederTraverse();
    //in-order
        btree.inOrederTraverse();
    //post-order
        btree.postOrederTraverse();
    //height
        System.out.println(btree.getHeight());
    //size
        System.out.println(btree.size());
    }

}
