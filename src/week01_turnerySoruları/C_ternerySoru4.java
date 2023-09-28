package week01_turnerySoruları;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class C_ternerySoru4 {
    public static void main(String[] args) {
        // soru4: notu al 50  veya  daha büyükse "sınıfı geçtin"
        // değilse "maalesef kaldın"

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen notunuzu girin");
        double not = scanner.nextDouble();

        System.out.println(not <=100 && not>=50 ?  "geçtiniz"  : not>=0 && not<50 ? "kaldınız": "yanlış girdiniz");

    }
}
