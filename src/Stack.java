import java.util.Arrays;
public class Stack {

    private int[] arr;
    private int nextIndex = 0;
    private int size;

    public Stack (int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push (int value) {
        if (nextIndex >= arr.length){
            doublingSize();
        }
        arr[nextIndex] = value;
        nextIndex++;
    }

    public void outputStack (){
        for (int i = nextIndex - 1; i >= 0; i--){
            if (i == 0){
                System.out.println(arr[i]);
            }
            else{
                System.out.print(arr[i] + " -> ");
            }
        }

    }

    private void doublingSize () {
        int[] arr1 = new int[arr.length];
        System.arraycopy(arr, 0, arr1, 0, arr.length * 2);
        arr = arr1.clone();
    }

    public void pop (){
        System.out.println("The number " + arr[nextIndex - 1] + " has been successfully deleted");
        int[] newArr = Arrays.copyOfRange(arr, 0, nextIndex - 1);
        arr = newArr.clone();
        nextIndex--;
    }
}