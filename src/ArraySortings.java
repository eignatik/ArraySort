import java.util.Random;

public class ArraySortings {
    public int[] fillRandomArray(int[] array){
        Random random = new Random();
        for(int i=0; i<array.length; i++){
            array[i] = random.nextInt(1000);
        }
        return array;
    }

    public void printArray(int[] array){
        StringBuilder arrayBuilder = new StringBuilder();
        for(int i=0; i<array.length; i++){
            arrayBuilder.append(array[i]).append(" ");
        }
        System.out.println(arrayBuilder);
    }

    public void printArray(String array){
        System.out.println(array);
    }

    public int[] sortEvenNumbers(int[] array){
        int indexOfLastEven = 0;
        int localElement;
        for(int i=0; i<array.length; i++){
            if(array[i] % 2 == 0 && array[i] != 0) {
                localElement = array[indexOfLastEven];
                array[indexOfLastEven] = array[i];
                array[i] = localElement;
                indexOfLastEven ++;
            }
        }
        return array;
    }

    public String getArrayAsString(int[] array){
        StringBuilder arrayBuilder = new StringBuilder();
        for(int i=0; i<array.length; i++){
            arrayBuilder.append(array[i]).append(" ");
        }
        return arrayBuilder.toString();
    }
}
