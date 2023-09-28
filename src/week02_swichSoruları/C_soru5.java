package week02_swichSoruları;

import java.util.Scanner;

public class C_soru5 {
    public static void main(String[] args) {

        // soru5: gün nosu al hafta  içi hafta sonu yazdır

        Scanner scanner = new Scanner(System.in);
        System.out.println("gün numarası girin");
        int gun = scanner.nextInt();

        switch (gun){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("hafta içi");
                break;
            case 6:
            case 7:
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("haftanın gün numarası giriniz");
        }
    }
}
