package CustomQueue;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    public CircularQueue(int size){
        this.data = new int[size];
    }

    public  CircularQueue(){
        this(DEFAULT_SIZE);
    }

    protected int front = 0;
    protected int end = 0;

    protected int size = 0;

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end] = item;
        end++;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("QUEUE IS EMPTY");
        }
        int removed = data[front];
        front++;
        size--;
        front = front % data.length;
        return front;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("EMPTY");
            return;
        }
        int i = front;
        do{
            System.out.print(data[i] + "->");
            i++;
            i = i% data.length;
        }while (i!=end);
        System.out.println("END");
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == data.length;
    }
}