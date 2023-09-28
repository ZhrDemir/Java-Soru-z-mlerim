package week02_ManipulatifSoruları;

import java.util.Scanner;

public class C_soru1 {
    public static void main(String[] args) {

        // soru 1: mail alın
        // mail @ içermiyorsa "geçersiz mail"
        // mail @gmail.com içermiyorsa "mail gmail içermeli"
        // mail @gmail.com ile bitmiyorsa "mail de yazım yanlışı var"   yazdır

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen gmail girin");
        String mail = scanner.nextLine();
        if (!mail.contains("@")) {
            System.out.println("geçersiz mail");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("mail gmail olmalı");
        } else if (!mail.endsWith("@gmail.com")){
            System.out.println("mail de yazım hatası var.");}


    }
}
