package week01_SorularIfElse;

import java.util.Scanner;

public class C_ifElseStaSoru2 {
    public static void main(String[] args) {

        // soru2: notu alın 50 veya daha büyükse sınıfı geçtin yazdırın, 50 den küçükse maalesef kaldın

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen notunuzu girin :");

        double not = scanner.nextDouble();

        if (not >= 50 && not <= 100) {
            System.out.println("sınıfı geçtin ");
        }
        if (not < 50 && not >= 0) {
            System.out.println("maalesef kaldın ");
        } else {
            System.out.println("geçerli bir not girmeliydiniz");
        }
    }
}
