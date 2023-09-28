package week01_SorularIfElse;

import java.util.Scanner;

public class C_ifElseStaSoru3 {
    public static void main(String[] args) {

        // soru3: yasını iste 65 yas ve üzeri ise emekli olabilirsin yoksa emekli olması için gereken yılın sayısını yazdır

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı girin : ");
        int yas = scanner.nextInt();
        if (yas>=65) {
            System.out.println("Emekli Olabilirsin");}
        else System.out.println("emekli olmak için " + (65 - yas ) + " yılınız kaldı");

    }
}
