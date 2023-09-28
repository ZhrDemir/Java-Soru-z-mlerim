package test;

import java.util.Scanner;

public class C_faktYazdir {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("faktöriyel için sayı girin");
        int sayi = scanner.nextInt();

        faktYazdir(sayi);




    }
    public static void faktYazdir(int sayi) {
        int carpim = 1;

        for (int i = 1; i <= sayi; i++) {
            carpim *= i;
        }
        System.out.println(sayi + "!= " + carpim);

    }
}
