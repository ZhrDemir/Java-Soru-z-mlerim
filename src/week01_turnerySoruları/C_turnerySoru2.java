package week01_turnerySoruları;

import java.util.Scanner;

public class C_turnerySoru2 {
    public static void main(String[] args) {

        //soru2: üçgenin üç kenarını iste,eş ise "eş kenar üçgen " yaz,
        // değilse "değil" yaz

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen üçgen için üç kenar girin");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        System.out.println(kenar1==kenar2 && kenar1==kenar3 && kenar1 >0 ? "Eş kenar üçgen" : "Eş kenar üçgen değil");

    }
}
