package calismalarim;

import java.util.Random;
import java.util.Scanner;

public class C_belirliAraliktaRastgeleS {
    public static void main(String[] args) {

     // 16. Rastgele Sayı Üretici: Belirli bir aralıkta rastgele sayılar
     // üreten bir program yazın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen rastgele üreteceğimiz aralığın alt sınırını giriniz: ");
        int altSinir = scanner.nextInt();
        System.out.println("Lütfen rastgele üreteceğimiz aralığın üst sınırını giriniz: ");
        int ustSinir = scanner.nextInt();
        int rastgele = 0;
        Random random = new Random();
        do {
            rastgele = random.nextInt();

        }while (!(rastgele>=altSinir && rastgele<=ustSinir));
        System.out.println("[" + altSinir + " , "  + ustSinir + " ] aralığında rastgele sayınız : " + rastgele);


    }
}
