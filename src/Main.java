public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        ArraySortings sortings = new ArraySortings();
        array = sortings.fillRandomArray(array);
        sortings.printArray(array);
        array = sortings.sortEvenNumbers(array);
        System.out.println("****\n\n");
        sortings.printArray(array);
    }
}
