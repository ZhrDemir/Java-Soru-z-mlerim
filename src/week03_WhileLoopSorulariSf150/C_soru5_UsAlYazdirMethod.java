package week03_WhileLoopSorulariSf150;

import java.util.Scanner;

public class C_soru5_UsAlYazdirMethod {
    public static void main(String[] args) {
        // Soru5: kullanıcıdan sayı ve üs al
        // hesaplayıp, yazdıracak method yap.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = scan.nextInt();
        System.out.println("Lütfen üs için sayı girin");
        int us = scan.nextInt();
        usAlYazdir(sayi , us);


    }
public static void usAlYazdir(int sayi, int us){
    int sonuc = 1;
    int gecicius = us ;
    while (gecicius>0) {

        sonuc *= sayi;
        gecicius--;
    }
    System.out.println(sayi + " üssü " + us + " = " + sonuc);
    }
}