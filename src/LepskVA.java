import java.util.Arrays;
import java.util.stream.IntStream;

public class LepskVA {

    private int[] arr;
    private int lastIndex = 0;
    private int size;
    public LepskVA(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void find (int index) {
        if (index >= size){
            throw new IllegalArgumentException("Index " + index + " out of bounds for length " + size);
        }
        else{
            System.out.println(arr[index]);
        }
    }

    public void output (){
        for (int i = 0; i < lastIndex; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public void add (int value) {
        if (lastIndex < size) {
            arr[lastIndex] = value;
            lastIndex++;
        }
        else{
            throw new IllegalArgumentException("The massive is full");
        }
    }

    public void delete (int index){
        if (index >= lastIndex && index < size){
            System.out.println("The number with the index " + index + " does not exist anyway");
        }
        else {
            System.out.println("The number " + arr[index] + " has been successfully deleted");
            if (index == 0){
                int[] newArr = Arrays.copyOfRange(arr, 0, lastIndex);
                arr = newArr.clone();
            }
            if (index == lastIndex){
                int[] newArr = Arrays.copyOfRange(arr, 0, lastIndex - 1);
                arr = newArr.clone();
            }
            else{
                int[] arr1 = Arrays.copyOfRange(arr, 0, index);
                int[] arr2 = Arrays.copyOfRange(arr, index + 1, lastIndex + 1);
                arr = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
            }
            lastIndex--;
        }
    }
}