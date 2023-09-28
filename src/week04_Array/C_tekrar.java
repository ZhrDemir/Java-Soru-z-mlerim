package week04_Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C_tekrar {
    public static void main(String[] args) {
        // yeni bir array olurtur ve print yaptir

        int[] liste = {10, 20, 30, 40};
        System.out.println("İlk değerler: " + Arrays.toString(liste));

        //  yeni elementleri koymak icin yeni bir array olustur.
        int[] reversedListe = new int[liste.length];

        for (int i = liste.length - 1, j = 0; i >= 0; i--, j++) {
            reversedListe[j] = liste[i];
        }
        System.out.println("Array'ın tersi: " + Arrays.toString(reversedListe));
    }

         /*

         Bu kodda, önceki liste dizisini tersine çevirmek için aynı uzunlukta bir tersListe dizisi oluşturuyoruz.
         Daha sonra bir for döngüsü kullanarak liste dizisini ters sırayla dolaşıyoruz ve elemanları tersListe dizisine ters sırada saklıyoruz.
         Son olarak, Arrays.toString() kullanarak tersListe dizisini yazdırıyoruz ve bu sayede ters çevrilen elemanları görüntülüyoruz.
         */

}
