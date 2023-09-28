package week02_forLoop;

import java.util.Scanner;

public class C_soru7 {
    public static void main(String[] args) {


         // poz tam sayı al
        // rakamların toplamını hesapla.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif tam sayı giriniz." );
        int sayi = scanner.nextInt();

        int toplam = 0;
        String sayiStr = Integer.toString(sayi);

        for (int i = 0 ; i < sayiStr.length(); i++){
        char rakamChar = sayiStr.charAt(i);

        if (Character.isDigit(rakamChar)) {
            toplam += rakamChar - '0';
        }
        }
        System.out.println("Rakamlar toplamı= " + toplam);

        // hocanın yaptığı

        System.out.println("************");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Lütfen pozitif tam sayı giriniz." );
        int girilensayi = scanner1.nextInt();

        int rakamlarToplamı = 0;
        int rakam = 0;

        for (int i = girilensayi; i > 0 ; i /= 10) {

            rakam = i % 10;
            rakamlarToplamı += rakam;
        }
        System.out.println(girilensayi + " sayının rakamları toplamı = " + rakamlarToplamı);

       // basamak sayısı ile kontrol

        rakamlarToplamı = 0;
        rakam = 0;

        int basamakSayisi = (girilensayi + "").length();
        int sayi1 = girilensayi ;

        for (int i = 1; i<= basamakSayisi ; i++){

            rakam = sayi1 %10;
            rakamlarToplamı += rakam ;
            sayi1  /= 10;
        } System.out.println(girilensayi + " sayının raakamları toplamı = " + rakamlarToplamı);


    }
}
