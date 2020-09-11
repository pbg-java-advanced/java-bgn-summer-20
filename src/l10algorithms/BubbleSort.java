import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] numbers = {2,3,6,7,1};
        sort(numbers);
    }

    public static void sort(int[] arr){
        int temp = 0;
        for(int j=0; j< arr.length; j++){
            for(int i=0;i < arr.length -1 ;i++){
               if(arr[i] > arr[i+1]){
                  temp = arr[i];
                  arr[i] = arr[i+1];
                  arr[i+1] = temp;
               }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

}
