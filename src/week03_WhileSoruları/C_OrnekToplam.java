package week03_WhileSoruları;

import java.util.Scanner;

public class C_OrnekToplam {
    public static void main(String[] args) {

        // Kullanıcıdan toplanmak üzere sayılar isteyin ,
        // toplam 500 ve üzeri olduğunda bitirin.


        Scanner scanner = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        int sayac = 0;

        while (toplam <=500) {
            System.out.println("Lütfen toplanmak üzere sayı girin");
            sayi = scanner.nextInt();
            toplam += sayi;
            sayac++;

        }System.out.println(sayac + " adet sayı girdiniz.Girilen sayıların toplamı = "+ toplam);
    }
}
