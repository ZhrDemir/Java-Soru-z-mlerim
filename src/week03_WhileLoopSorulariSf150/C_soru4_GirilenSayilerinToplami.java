package week03_WhileLoopSorulariSf150;

import java.util.Scanner;

public class C_soru4_GirilenSayilerinToplami {
    public static void main(String[] args) {

        /* Kullanicidan toplanmak uzere pozitif tamsayilar isteyinKullaniciya bitirmek
istediginde 0'a basmasini soyleyin
Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdiginive
bunlarin toplaminin kac oldugunu yazdirin
Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
negatif sayiyi sayi adedine ve toplama eklemeyin

         */
        Scanner scan = new Scanner(System.in);
        int sayi = 1;
        int toplam = 0;
        int sayac = 0;

        while (sayi != 0 ){

                System.out.println("Lütfen toplanmak üzere pozitif tam sayı giriniz\nBitirmek istediğinizde 0 a basın.");
                sayi = scan.nextInt();
                    if (sayi<0 ){
                        System.out.println("negatif sayı giremezsiniz");
             }else{
                        toplam += sayi;
                        sayac ++;
                    }

       }
        System.out.println(sayac-1 + " kere sayı girdiniz ve bunların toplamı = "+toplam );
    }
}
