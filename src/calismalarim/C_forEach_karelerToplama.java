package calismalarim;

import java.util.Arrays;

public class C_forEach_karelerToplama {
    public static void main(String[] args) {

        // Soru 2- Verilen int array’deki her elementin karelerini alip, karelerinin toplamini
        // yazdiran bir method olusturun

        int [] arr = {2,3,4,5,6};

        kareTop(arr);



    }

    private static void kareTop(int[] arr) {

        int toplam =0;
        for (int each: arr
             ) {
            toplam += each*each;
        }

        System.out.println("Verilen Array = " + Arrays.toString(arr));
        System.out.println("Elemanların kareleri toplamı = " + toplam);


    }
}
