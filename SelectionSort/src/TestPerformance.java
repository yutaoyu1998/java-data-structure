public class TestPerformance {

    public static void main(String[] args) {

        int n = 10000;
        Integer[] arr = ArrayGenerator.generatorOrderedArray(n);

        long s = System.nanoTime();
        SelectionSort.sort(arr);
        long e = System.nanoTime();

        double time = (e - s) / 1000000000.0;
        System.out.println(time + " - s");

        if(!SortingHelper.isSorted(arr))
            throw new Error("SelectionSort filed");

        System.out.println("verify closed");

    }
}
