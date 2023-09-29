package calismalarim;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class C_herSatirda5Eleman {
    public static void main(String[] args) {

        // 1 ile 10 arası rastgele üretilmiş 20 adet sayı ,
        // her satırda 5 eleman olacak şekilde ekrandan yazdıran bir kod yazınız


        Random random = new Random();

        List<Integer> liste = new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            int rastgele = random.nextInt(11);
            liste.add(rastgele);


        }          System.out.println("liste" + liste);


     //  for (int i = 0; i < 5; i++) {
     //      System.out.print(liste.get(i) + " ");
     //  }
     //  System.out.println(" ");

     //  for (int i = 5 ; i <10 ; i++) {
     //      System.out.print(liste.get(i) + " ");
     //  }

        int sayac = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.print(liste.get(sayac) + " ") ;
                sayac ++;

            }
            System.out.println("");
        }



    }
}
