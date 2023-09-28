package test;

import java.util.Scanner;

public class C02_ders2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen isminiz ve soy isminizi giriniz :");
        String isim = scanner.nextLine();

        System.out.println("Lütfen yaşınızı girin :");
        int yas = scanner.nextInt();

        System.out.println("Girilen bilgiler : " + isim + " " + yas);

    }
}
