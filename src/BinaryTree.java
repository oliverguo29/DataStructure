public interface BinaryTree {


    /**
     * interface
     */

     // is empty?
     boolean isEmpty();

     //size
     int size();

     //getHeight
     int getHeight();

     //find specific value
     Node findKey();

     //preOrederTraverse
     void preOrederTraverse();

     //InOrederTraverse
     void inOrederTraverse();

     //postOrederTraverse
     void postOrederTraverse();

     //postOrederTraverse
     void postOrederTraverse(Node node);

     //非递归
     void preOrederByStack();

     void inOrederByStack();

     void postOrederByStack();
     // level 通过队列
     void levelOrder();






}
