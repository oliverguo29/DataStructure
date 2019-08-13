import java.util.Arrays;

public class My_ArrayList {

    private Object[] arr;
    int size;

    public My_ArrayList(){
        this(4);
    }

    public My_ArrayList(int size){
        this.arr=new Object[size];
        this.size=0;
    }

    public void add(Object oo){             //add elements
        if(size==arr.length){
            Object[] arr2 = grow(arr.length+(arr.length>>1)); //increase 50%,
            arr=arr2;
        }
        arr[size++]=oo;
    }

    public void insert(Object oo,int index){
        if(size==arr.length){
            Object[] arr2 = grow(arr.length+(arr.length>>1)); //increase 50%,
            arr=arr2;
        }

        for(int i=size;i>index;i--){        //from the last one
            arr[i]=arr[i-1];
        }

        arr[index]=oo;
        size++;


    }

    public Object get(int index) {          //get element
        if(index<0||index>size()){
            throw new ArrayIndexOutOfBoundsException();
        }
        return arr[index];
    }

    public int size(){                      //get length
        return this.size;
    }

    public boolean isEmpty(){
        return arr.length==0;
    }

    public Object[] grow(int size){        //auto increase
        Object[] arr2 = Arrays.copyOf(arr, size);
        return arr2;
    }

    @Override
    public String toString() {
        if(size==0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        sb.append("]");
        return  sb.toString();
    }
}
