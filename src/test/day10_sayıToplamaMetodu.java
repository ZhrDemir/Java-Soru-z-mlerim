package test;

import java.util.Scanner;

public class day10_sayıToplamaMetodu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen toplanacak iki sayı girin");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();

        toplaYazdir(sayi1, sayi2);



    }

        public static void toplaYazdir(double sayi1, double sayi2) {

            System.out.println("verilen iki sayının toplamı=  " + (sayi1 + sayi2));
        }



}
