import java.util.Random;

public class ArraySortings {
    public ArraySortings(){

    }

    public int[] fillRandomArray(int[] array){
        Random random = new Random();
        for(int i=0; i<array.length; i++){
            array[i] = random.nextInt(1000);
        }
        return array;
    }

    public void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i] +  " ");
        }
    }

    public int[] sortEvenNumbers(int[] array){
        int indexOfLastEven = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] % 2 == 0 && array[i] != 0) {
                array[indexOfLastEven] = array[indexOfLastEven] + array[i];
                array[i] = array[indexOfLastEven] - array[i];
                array[indexOfLastEven] = array[indexOfLastEven] - array[i];
                indexOfLastEven ++;
            }
        }
        return array;
    }
}
