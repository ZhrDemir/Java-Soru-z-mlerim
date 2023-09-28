package week04_MDA_sorulari;

import java.util.Arrays;

public class C04_tumSayilarinCarpimi {
    public static void main(String[] args) {
    //  Soru 4- Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir
    //  method olusturun


        int [][] arr = {{3,1,2,4},{1,2}};

        System.out.println("Tüm elemanların çarpımı = " + carpimarr(arr));


    }

    public static  int  carpimarr(int[][] arr) {

        int carpim = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                carpim *= arr[i][j];
            }
        }
        System.out.println("Verilen Array : " + Arrays.deepToString(arr));

        return carpim;






    }
}
