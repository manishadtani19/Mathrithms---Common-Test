package com.creativedeveloper;

/*
-Start from the 1st index since the array of size 1 is already sorted.
-We will run an inner loop from i-1 till 0.
-Let's denote it with j.
-If j-th value is greater than the j+1-th value then we will swap. Else break the inner loop.
-We will continue this for all the n-1 elements.

 */

public class insertionSort {

    public static void main(String[] args) {
        int[] arr = {83,1,45,95,45,52,11,47,0,45,67,82};
        isInsertionSort(arr);
        print(arr);




    }

    public static void isInsertionSort (int [] arr) {
        for (int i = 0; i<arr.length; i++) {
            for(int j = i-1; j>=0; j--) {
                if(isGreater(arr, j, j+1)){
                    swap(arr,j,j+1);
                } else {

                }
            }
        }
    }

    public static void print (int [] arr) {
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static Boolean isGreater (int [] arr, int i, int j) {
        if(arr[i] > arr[j]) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void swap(int [] arr, int i, int j) {
        if (i == j) {
            return;
        }


        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
