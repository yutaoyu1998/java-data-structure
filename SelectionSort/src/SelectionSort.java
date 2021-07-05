public class SelectionSort {

    private SelectionSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minIndex].compareTo(arr[j]) < 0) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    private static <E> void swap(E[] arr, int i, int j) {
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 4, 2, 3, 6, 5};
        SelectionSort.sort(arr);
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();

        Student[] students = {
                new Student("A", 90),
                new Student("B", 92),
                new Student("c", 100)
        };
        SelectionSort.sort(students);
        for (Student student: students)
            System.out.print(student + " ");
    }
}
