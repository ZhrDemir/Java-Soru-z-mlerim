package week01_SorularifElsIf;

import java.util.Scanner;

public class C_ifElseifSoru2 {
    public static void main(String[] args) {

// soru2 :   kilo ve boy iste vke(kilo*10000/ (boy*boy) 30 dan büyükse obez,
// 25-30 arası kilolu, 20-25 arası normal, 20 den küçğükse <ayıf yazdır
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen kilonuzu (kg) cinsinden girin");
        double kilo = scanner.nextDouble();

        System.out.println("Lütfen boyunuzu (cm) cinsinden girin");
        int boy = scanner.nextInt();

        double vke = kilo*10000/(boy*boy);

        if (vke>30) {
            System.out.println("obez");}
        else if (vke>25) {
            System.out.println("kilolu");}
        else if (vke>20 && vke <=25) {
            System.out.println("normal");
        } else System.out.println("zayıf");
        System.out.println("vke = " + vke);

    }


}
