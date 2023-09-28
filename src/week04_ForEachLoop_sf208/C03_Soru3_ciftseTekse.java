package week04_ForEachLoop_sf208;

import java.util.ArrayList;
import java.util.List;

public class C03_Soru3_ciftseTekse {
    public static void main(String[] args) {

        // Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
        // - Kelimenin uzunlugu cift sayi ise ilk yarisini
        // - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        // yeni bir listeye ekleyip yazdirin


   /* String [] yeniarr  = new String[arr.length];
         for (String kelime : arr){

             if (kelime.length()%2 ==0){

                 yeniarr []

             }

         }*/
        String[] arr = {"Ali","Veli", "Selami","Ayşem"};// verilen array

        List<String> yeniList = new ArrayList<>();// list hazırla

        for (String kelime : arr  // tek tek kelime kontrolü
        ) {
            int length = kelime.length();// kelimelerin uzunluğunu integer bir değere atama

            if (length % 2 == 0) {// kelimenin uzunluğu çift ise ilk yarısını al

                int yarisi = length / 2; // uzunluğun yarısını atadık
                String ilkKisim = kelime.substring(0, yarisi);//yarısına kadar ki kısmını ilk kısım olarak başka yere atıyoruz

                yeniList.add(ilkKisim);

            } else { // kelimenin uzunluğu tek ise

                int ikinciYarisi = length / 2;
                String ikinciKismi = kelime.substring(ikinciYarisi);

                yeniList.add(ikinciKismi);
            }
        }
        System.out.println("sonuç: " + yeniList);// sonucu yazdır

    }
        }



