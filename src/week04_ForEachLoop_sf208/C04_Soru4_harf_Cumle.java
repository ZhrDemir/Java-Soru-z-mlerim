package week04_ForEachLoop_sf208;

import java.util.ArrayList;
import java.util.Scanner;

public class C04_Soru4_harf_Cumle {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
        // kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String cumle = scanner.nextLine();

        System.out.println("Bir harf giriniz");
        char harf = scanner.next().charAt(0);

        int sayac = 0;



        for (char karakter : cumle.toCharArray()) {
            if (karakter == harf) {
                sayac++;
            }
        }

        if (sayac == 0) {
            System.out.println("Aradığınız harf bulunamamıştır.");
        } else System.out.println(harf + " harfi " + sayac + " kere kullanılmıştır");





    }
}







