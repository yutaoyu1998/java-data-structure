public class InsertSort {

    private InsertSort () {}

    public static <E extends Comparable<E>> void sort(E[] arr){

        for(int i = 0; i < arr.length; i++){

            // 将arr[i]插入到合适的位置
            for(int j = i; j - 1 >= 0; j--) {
                if(arr[j].compareTo(arr[j - 1]) > 0){
                    swap(arr, j, j -1);
                } else {
                    break;
                }
            }
        }
    }

    // 利用平移优化
    public static <E extends Comparable<E>> void sort2(E[] arr){

        for(int i = 0; i < arr.length; i++){

            E t = arr[i];
            int j;
            for(j = i; j - 1 >= 0 && t.compareTo(arr[j - 1]) > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = t;
        }
    }

    private static <E> void swap(E[] arr, int i, int j) {
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
