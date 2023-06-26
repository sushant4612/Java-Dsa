package CustomQueue;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue(int size) {
        super(size);
    }

    public DynamicQueue() {
        super();
    }

    @Override
    public boolean insert(int item) {
        if(isFull()){
            int[] temp = new int[data.length*2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(i+front)%data.length];
            }
            end = data.length;
            front = 0;
            data = temp;
        }
        return super.insert(item);
    }
}
