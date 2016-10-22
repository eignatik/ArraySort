public class Main {
    public static void main(String[] args) {
        int[] array = {0, 0, 2, 4, 6, 7, 8, 9};
        ArraySortings sortings = new ArraySortings();
        //array = sortings.fillRandomArray(array);
        sortings.printArray(array);
        array = sortings.sortEvenNumbers(array);
        System.out.println("****\n\n");
        sortings.printArray(array);
    }
}
