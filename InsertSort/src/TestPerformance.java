import java.lang.reflect.Array;
import java.util.Arrays;

public class TestPerformance {

    public static void main(String[] args) {

        int n = 10000;
        Integer[] arr = ArrayGenerator.generatorOrderedArray(n);
        Integer[] arr2 = Arrays.copyOf(arr, arr.length);

        long s = System.nanoTime();
        InsertSort.sort(arr);
        long e = System.nanoTime();

        double time = (e - s) / 1000000000.0;
        System.out.println(time + " - s");


        long s2 = System.nanoTime();
        InsertSort.sort(arr2);
        long e2 = System.nanoTime();

        double time2 = (e2 - s2) / 1000000000.0;
        System.out.println(time2 + " - s");

        if(!SortingHelper.isSorted(arr))
            throw new Error("sort filed [InsertSort]");

        System.out.println("verify closed");

    }
}
