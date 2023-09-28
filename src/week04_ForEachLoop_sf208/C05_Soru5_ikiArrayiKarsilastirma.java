package week04_ForEachLoop_sf208;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C05_Soru5_ikiArrayiKarsilastirma {

    public static void main(String[] args) {

         //  Soru 5- Verilen iki array’in elementlerini karsilastirip,
        //  ikisinde ortak olan elementleri
       //  ayri bir liste olarak veren bir program yazin.


        List<Integer> arr1 = new ArrayList<>();
        arr1.add(12);
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);

        List<Integer> arr2 = new ArrayList<>();
        arr2.add(12);
        arr2.add(1);
        arr2.add(23);
        arr2.add(32);

        List<Integer> yeniArr = new ArrayList<>();// ortak elemanları saklayacak bir liste oluşturun

        // ilk array deki her elemanı alın ikici array de kontrol edin

        for (int eleman1 :arr1
             ) {
            for (int eleman2 : arr2
                 ) {
                if (eleman1==eleman2){
                    yeniArr.add(eleman1);
            }

            }
        }

// ortak elemanları yazdırın
        System.out.println(yeniArr);


    }
}
