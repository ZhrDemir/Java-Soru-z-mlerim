package week04_Array;

import java.util.Arrays;

public class C01_Soru1_ikiArtırMethodu {

    public static void main(String[] args) {
        //  Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
        // olusturun. Eski array’i yeni haliyle kaydedin.

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(ikiArttir(arr)));
    }

    public static int[] ikiArttir(int [] arr) {
        int[] ikiArttirilmisArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ikiArttirilmisArr[i] = arr[i] + 2;
        }
        return ikiArttirilmisArr;
    }
}