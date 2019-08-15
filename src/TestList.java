public class TestList {


    public static void main(String[] args) {

        //My_ArrayList mal2 = new My_ArrayList();
        My_LinkedList mal2= new My_LinkedList();


        mal2.add(11);
        mal2.add(15);
        mal2.add(10);
        mal2.add(100);

        mal2.insert(3,3);

        mal2.insert(5,3);
        mal2.remove(3);
        System.out.println(mal2.toString());


    }
}
