package week02_swichSoruları;

import java.util.Scanner;

public class C_soru2 {
    public static void main(String[] args) {

        //soru2: iki bas sayı al yazdır

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen iki basamaklı sayı girin");
        int sayi = scanner.nextInt();

        int a = sayi / 10;
        int b = sayi % 10;

        switch (a) {
            case 1:
                System.out.print("on");
                break;
            case 2:
                System.out.print("yirmi");
                break;
            case 3:
                System.out.print("otuz");
                break;
            case 4:
                System.out.print("kırk");
                break;
            case 5:
                System.out.print("elli");
                break;
            case 6:
                System.out.print("altmış");
                break;
            case 7:
                System.out.print("yetmiş");
                break;
            case 8:
                System.out.print("seksen");
                break;
            case 9:
                System.out.print("doksan");
                break;

        }
        if (a == 0) {
            System.out.println("lütfen iki basamaklı sayı giriniz");
        } else {
            switch (b) {
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("üç");
                    break;
                case 4:
                    System.out.println("dört");
                    break;
                case 5:
                    System.out.println("beş");
                    break;
                case 6:
                    System.out.println("altı");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.println("sekiz");
                    break;
                case 9:
                    System.out.println("dokuz");
                    break;
                case 0:
                    System.out.println("");
                default:
                    System.out.println("lütfen iki basamaklı sayı giriniz");
            }
        }
    }
}