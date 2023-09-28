package week04_Array;

import java.util.Arrays;

public class C03_soru3_kaydirma {
    //Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
    //basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
    //Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]
    public static void main(String[] args) {


    int [] arr={4,5,6,7,6,8};

        System.out.println(Arrays.toString(kaydir(arr)));
}

    public static int[] kaydir(int[] arr) {

         int [] arr1 = new int [arr.length];

         for (int i = 0; i < arr.length-1 ; i++) {
            arr1[i + 1] = arr[i];
        }
        arr1[0] = arr[arr.length-1];

      return arr1 ;
    }
    }
