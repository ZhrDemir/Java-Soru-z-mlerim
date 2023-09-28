package week03_WhileLoopSorulariSf150;

import java.util.Scanner;

public class C_soru2_rakTop {
    public static void main(String[] args) {

        // Soru 2: sayı al, rakamlar toplamını bul

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz");
        int sayi = scanner.nextInt();
        int rakam = 0;
        int toplam = 0;
        int geciciSayi=sayi;

        while (geciciSayi >0){
            rakam = geciciSayi % 10 ;
            toplam += rakam;
            geciciSayi /=10;


        }System.out.println("Rakamlar toplamı= "+ toplam);



    }
}
