package calismalarim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C_ikiArrayKarsilastirmasi {
    public static void main(String[] args) {


        //  Soru5 Verilen iki array’in elementlerini karsilastirip,
        //  ikisinde ortak olan elementleri
        //  ayri bir liste olarak veren bir program yazin.


        int[] arr1 = {1, 3, 2, 3, 4, 5, 6, 7, 5};
        int[] arr2 = {3, 5, 7, 9, 8, 6};

        List<Integer> ortakListe = new ArrayList<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);


        for (int each1 : arr1
             ) {
            for (int each2 : arr2
            ) {
                if (each1 == each2) {
                    if (!ortakListe.contains(each1)) {
                        ortakListe.add(each1);

                    }
                }
            }

        }

        System.out.println("Verilen Array ler : \n\t" + Arrays.toString(arr1) + "\n\t" + Arrays.toString(arr2));
        System.out.print("Ortak elemanların listesi : \n\t" + ortakListe);
    }
}








