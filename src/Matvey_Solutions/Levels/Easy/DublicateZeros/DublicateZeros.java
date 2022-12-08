package Matvey_Solutions.Levels.Easy.DublicateZeros;

public class DublicateZeros {
    public void dublicate_zeros(int[] arr){
       int zeroes = 0;
       for (int i: arr){
           if(i == 0){
               zeroes++;
           }
       }
       int i = arr.length - 1, j = arr.length + zeroes - 1;

       while (i != j) {
           insert(arr, i, j--);
           if (arr[i] == 0) {
               insert(arr, i, j--);
           }
            i--;
       }
    }

    public void insert(int[] arr, int i, int j){
        if (j < arr.length){
            arr[j] = arr[i];
        }
    }

    public static void main(String[] args) {
        DublicateZeros zeros = new DublicateZeros();
        zeros.dublicate_zeros(new int[]{1,0,2,3,0,4,5,0});
    }
}

