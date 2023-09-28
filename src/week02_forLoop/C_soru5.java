package week02_forLoop;

import java.util.Scanner;

public class  C_soru5 {
    public static void main(String[] args) {

        //20 den küçük bir sayı al
        // bu sayının faktoriyelini hesapla.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 20 den küçük bir sayı girin");
        int sayi = scanner.nextInt();
        int fakt =1;

        if (sayi>=20 ){
            System.out.println("yanlış girdiniz");}
        else {
        for ( int i = 1 ; i <= sayi ; i++) {
            fakt *= i;     // fakt = fakt*i
        }System.out.println("Faktoriyel hesabı = " + fakt);
        }
    }
}
