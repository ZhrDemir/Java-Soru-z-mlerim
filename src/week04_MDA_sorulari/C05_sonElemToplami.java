package week04_MDA_sorulari;

import java.util.Arrays;

public class C05_sonElemToplami {
    public static void main(String[] args) {

        //  Soru 5- Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
        //  toplaminini yazdiran bir method olusturun.

        int[][] arr = {{3, 1, 2, 4}, {1, 2}, {3, 4, 5}, {10}};

        sonElemanToplami(arr);


    }

    private static void sonElemanToplami(int[][] arr) {

        int toplami = 0;
        for (int i = 0; i < arr.length; i++) {
            int [] innerArray = arr[i];

            int lastIndex = innerArray.length-1;
            toplami += innerArray[lastIndex];




            }

            System.out.println("Verilen Array : " + Arrays.deepToString(arr));
            System.out.println("son index toplamı = " + toplami);



    }
}








