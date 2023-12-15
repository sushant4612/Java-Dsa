package CustomStacks;

public class DynamicStack extends CustomStack{
    public DynamicStack(int size) {
        super(size);
    }

    public DynamicStack() {
        super();
    }

    @Override
    public boolean push(int value) {
        if(this.isFull()){
            int[] temp = new int[data.length*2];
            for (int i = 0; i < data.length ; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(value);
    }
}
