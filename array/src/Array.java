public class Array {

    private int[] data;
    private int size;

    /**
     * 传入capacity容量
     *
     * @param capacity
     */
    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    /**
     * 无参构造函数，默认capacity=10
     */
    public Array() {
        this(10);
    }

    /**
     * 获取数组的容量
     * @return
     */
    public int getSize(){
        return size;
    }

    /**
     * 数组容量
     * @return
     */
     public int getCapacity(){
        return data.length;
     }

    /**
     * 数组
     * @return
     */
    public boolean isEmpty(){
         return size == 0;
     }
}
