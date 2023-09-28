package week04_MDA_sorulari;

import java.util.ArrayList;
import java.util.Arrays;

public class C02_ayniIndexTopla {
    public static void main(String[] args) {

      //  Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
      //  olusturacagimiz tek katli bir array’e bu toplamlari atayin.
      //  input : int[][] arr = {{3,4,5}, {2,3,6,7}};
      //  output: [5, 7, 11]

        int[][] arr = {{3,4,5}, {2,3,6,7}};
        int  enKucuk = arr[0].length;

        for (int i = 0; i < arr.length; i++) {
          //  for (int j = 0; j < arr[i].length; j++) {
                if (arr[i].length< enKucuk){
                    enKucuk=arr[i].length;
            }

            }

        int [] toplamarr = new int[enKucuk];
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < enKucuk; j++) {
              toplamarr[j] += arr[i][j];
            }
        }
        System.out.println(Arrays.toString(toplamarr));

    }
}
