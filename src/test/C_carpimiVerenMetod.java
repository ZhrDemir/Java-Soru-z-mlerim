package test;

import java.util.Scanner;

public class C_carpimiVerenMetod {

    public static void main(String[] args) {

        //iki sayının çarpımını veren metod
        carpimYazdir();

    }    public static void carpimYazdir(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("iki sayı girin");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();

        System.out.println("çarpımın sonucu = " + sayi1*sayi2);

    }
}
