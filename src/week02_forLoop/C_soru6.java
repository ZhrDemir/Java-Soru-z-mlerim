package week02_forLoop;

import java.util.Scanner;

public class C_soru6 {
    public static void main(String[] args) {

        // 20 den küçük bir sayı al,
        // faktoriyeli hesapla
        // konsolda fak hesabının yapılışını yazdır.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 20 den küçük bir sayı girin");
        int sayi = scanner.nextInt();
        int fakt = 1;

        if (sayi>= 20 || sayi <0 ){
            System.out.println("yanlış girdiniz");
        } else {
            System.out.print(sayi+"!= ");
            for ( int i = sayi ; i >= 1 ; i--){
              fakt *= i ;
               if (i !=1)
               {
                   System.out.print(i +"*");
               }else {
                   System.out.println("1 = " + fakt );
               }
            }
        }
    }
}
