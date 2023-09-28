package test;

import java.util.Scanner;

public class C03_ders3scannerCalışmaları {
    public static void main(String[] args) {

        // dikdörgenin kenarını iste alan ve çevre hesapla

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dikdörtgenin ilk kenarını giriniz : ");
        double kenar1 = scanner.nextDouble()  ;

        System.out.println("Dikdörtgenin ikinci kenarını giriniz : ");
        double kenar2 = scanner.nextDouble();

        System.out.println("Dikdörtgenin Alanı = " + kenar1 * kenar2 );
        System.out.println("Dikdörtgenin çevresi = " + 2* (kenar1 + kenar2));

    }
}
