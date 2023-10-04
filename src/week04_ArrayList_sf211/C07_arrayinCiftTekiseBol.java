package week04_ArrayList_sf211;

import java.util.Arrays;

public class C07_arrayinCiftTekiseBol {
    public static void main(String[] args) {

        // Verilen String bir array'deki her bir elementi kontrol edip,
        // - Kelimenin uzunlugu cift sayi ise ilk yarisini
        // - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        // yeni bir listeye ekleyip yazdirin.

        String [] ailem = {"ozay", "adalet", "mustafa", "ihsan", "ismail", "Furkan"};
        String[] yeniaile = new String[ailem.length];

        for (int i = 0; i < ailem.length; i++) {
            if (ailem[i].length()%2==0){
                yeniaile[i] = ailem[i].substring(0, ailem[i].length() / 2);
                System.out.println(ailem[i].substring(0, ailem[i].length() / 2));
            }else {
                yeniaile[i] = ailem[i].substring(ailem[i].length() / 2 , ailem[i].length());
                System.out.println(ailem[i].substring(ailem[i].length() / 2 , ailem[i].length()));

            }

        }
        System.out.println(Arrays.toString(yeniaile));
    }
}
