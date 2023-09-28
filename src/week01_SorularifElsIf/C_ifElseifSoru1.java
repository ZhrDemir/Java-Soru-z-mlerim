package week01_SorularifElsIf;

import java.util.Scanner;

public class C_ifElseifSoru1 {
    public static void main(String[] args) {
        // soru1 : cinsiyeti ve yası iste, kadın,60 yaş ve üzeri,erkek 65 yaş üzeri emekli olabilir.
        // cinsiyeti ve yası dikkate alarak emekli olabilirsin veya şu kadar yıl kaldı yazdır

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi yazınız E : Erkek , K : Kadın");
        char cns = scanner.next().charAt(0);

        System.out.println("Lütfen yaşınızı girin : ");
        int yas = scanner.nextInt();

        if (cns == 'E'  && yas >=65){
            System.out.println("Erkek Emekli olabilir");}
        else if (cns == 'E' && yas < 65 ) {
            System.out.println("Erkek emekli olamaz, "+ (65-yas) + " yıl daha çalışmalı.");}
        else if (cns == 'K' &&  yas >= 60) {
            System.out.println("Kadın emekli olabilir");

        } else if ( cns == 'K' && yas < 60 ) {
            System.out.println("Kadın emekli olamaz, "+ (60-yas) + " yıl daha çalışmalı.");}

        }
    }

