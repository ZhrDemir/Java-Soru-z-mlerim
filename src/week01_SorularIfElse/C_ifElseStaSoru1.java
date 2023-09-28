package week01_SorularIfElse;

import java.util.Scanner;

public class C_ifElseStaSoru1 {
    public static void main(String[] args) {

        // kullanıcıdan üçgenin kenar uzunulukları iste,
        // eş kenar ise yazdır değilse değil diye yazdır

        Scanner scanner =new Scanner(System.in);

        System.out.println("Lütfen üçgenin 1. kenarını giriniz :");
        double kenar1 = scanner.nextDouble();

        System.out.println("Lütfen üçgenin 2. kenarını giriniz :");
        double kenar2 = scanner.nextDouble();

        System.out.println("Lütfen üçgenin 3. kenarını giriniz :");
        double kenar3 = scanner.nextDouble();

        if ( kenar1 == kenar2 && kenar2 == kenar3 && kenar1 > 0)
        {
            System.out.println("Eş kenar üçgen");}
        else {
            System.out.println("Eş kenar değil.");}
    }
}
