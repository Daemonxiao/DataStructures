package main.sort;

public class BubbleSort {

    public int[] bubbleSort(int[] array) {
        int length = array.length;
        int temp;

        for(int i = 0; i < length-1; i++){
            for(int j=0; j<length-i-1; j++){
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        return array;
    }
}
