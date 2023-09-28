package week01_SorularIfElse;

import java.util.Scanner;

public class C_ifElseStaSoru4 {
    public static void main(String[] args) {

        // soru4: br kararkter iste büyük mü küçük mü olduğunu yazdır

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz :");
        char harf = scanner.next().charAt(0);
        if (harf>= 'a' && harf<='z') {
            System.out.println("Küçük harf yazdınız.");

        }
        else if (harf>='A' && harf<='Z') {
            System.out.println("Büyük harf yazdınız. ");}
        else {
            System.out.println("Lütfen harf giriniz");}

    }
}
