package week03_MethhodSoruları;

import java.util.Scanner;

public class C_Soru4_TamBolen {
    public static void main(String[] args) {

        // Kullanıcıdan main metod içinde tam sayı alın
        // Girilen sayının poz tam bölenlerini bulup bize döndüren method.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lütfen tam sayı giriniz");
        int sayi = scanner.nextInt();
        tamBolenSayisi(sayi);


    }
    public static int tamBolenSayisi(int sayi){

        int sayac = 0;
        for (int i = 1; i <= sayi ; i++) {
            if (sayi% i == 0){
                sayac ++ ;

            }
        }
        System.out.print("Pozitif Tam Bölen Sayısı = " + sayac );
        return sayac ;
    }
}
