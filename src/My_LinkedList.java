public class My_LinkedList {

    class Node{                     //node in LinkedList
        private  Object data;
        Node next;

        public Node( ){

        }

        public Node(Object data){
            this.data= data;
        }

        public Object getData(){
            return  this.data;
        }

    }



    private Node head;      //dummy node
    private int size=0;

    public My_LinkedList(){
         this.head = new Node();
    }

    public void insert(int index,Object o){
        if(index<0||index>size){
            throw new IndexOutOfBoundsException();
        }
       //find previous node
        Node p = head;
        for(int i=0;i<index;i++){
            p=p.next;
        }
        //new node
        Node n = new Node(o);
        //link index+1      连接后继
        n.next= p.next;
        //link to index-1   连接前驱
        p.next=n;

        size++;


    }

    public void add(Object o ){      //add to the end
        this.insert(size,o);

    }


    public Object get(int i){       //from first one to search to the index

        for(int j=0;j<=i;j++){
            Node p= head;
            p=p.next;
            return p.getData() ;
        }

        return  null;
    }

    public void remove(int i){
        Node p = head;
        for(int j=0;j<i;j++){
            p=p.next;
        }
        Node target = p.next;
        p.next=target.next;
        size--;
    }

    public int getSize(){
        return  size;
    }

    public boolean isEmpty(){
        return size==0;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node p = head;
      for(int i=0;i<size;i++){
          p=p.next;
          sb.append(p.data+" ");
      }
      sb.append("]");
      return  sb.toString();
    }
}
