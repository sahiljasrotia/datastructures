package org.example.linearsearch;

public class Main {
    public static void main(String[] args) {
        int[] array= {2,5,8,9,7,2,1};
        int index = linearSearch(array,4);
        if(index != -1){
            System.out.println("Element found at : "+ index);
        }else{
            System.out.println("Element not found");
        }


    }

    private static int linearSearch(int[] array, int value) {
        for (int i=0;i<array.length;i++)
        {
            if(array[i]==value){
                return i;
            }
        }

        return -1;
    }
}
