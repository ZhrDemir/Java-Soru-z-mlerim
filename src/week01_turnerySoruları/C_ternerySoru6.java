package week01_turnerySoruları;

import java.util.Scanner;

public class C_ternerySoru6 {
    public static void main(String[] args) {

        // soru6 : sayı al mutlak değerini yaz

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        double sayi = scanner.nextDouble();

        System.out.println(sayi>=0 ? sayi : -1*sayi);
    }
}
