package org.example.bubblesort;

public class Main {
    public static void main(String[] args) {
        int[] array = {4,5,2,6,4,8,3};

        bubbleSort(array);
        for(int i : array){
            System.out.print(i);
        }
    }

    private static void bubbleSort(int[] array) {
        for (int i =0;i < array.length;i++){
            for (int j=0;j <array.length -i -1;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

            }
        }
    }
}
