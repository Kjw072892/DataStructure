package DataStructureLecture.Sorting;

import java.util.Arrays;

public class MergeSort <T> {

    T[] Arr;
    public MergeSort(){
        Arr = (T[]) new Object[0];
    }

    private void sort(T[] arr){
        int middle = arr.length / 2;
        sort(arr, 0, middle);
    }
    private void sort(T[] arr, int lowIndex, int highIndex) {
        int mid = (lowIndex + highIndex) / 2;
        if(lowIndex < highIndex) {
            System.out.println(Arrays.toString(arr));
            sort(arr, lowIndex, mid);
        }
    }

    private void merge(T[] arr, int low, int mid, int high){

    }

    public static void main(String[] args) {
        Integer[] myArr = {305, 65, 7, 90, 120, 110, 8};
        MergeSort<Integer> sortedArray = new MergeSort<>();
        sortedArray.sort(myArr);

    }
}
