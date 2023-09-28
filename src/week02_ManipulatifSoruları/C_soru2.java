package week02_ManipulatifSoruları;

import java.util.Scanner;

public class C_soru2 {
    public static void main(String[] args) {

        // soru2 : indexOf ile ilgili soru1
        // bir cümle iste
        // aranacak bi metin iste
        //aranan metin içermiyor
        // aranan metin sadece 1 kere kullanılıyor
        //aranan metin 1 den fazla kullanılmıştır

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cümle girin.");
        String cumle = scanner.nextLine();

        System.out.println("girdiğin cümleden aranacak bi metin girin");
        String metin = scanner.nextLine();

        int ilkIndex1 = cumle.indexOf(metin);
        int sonIndex = cumle.lastIndexOf(metin);
        if (ilkIndex1==-1){
            System.out.println("aranan metin içermiyor");}
        else if (ilkIndex1==sonIndex) {
            System.out.println("metin bir kere kullanılmıştır");

        }else System.out.println("metin birden fazla kullanılmıştır.");

    }
}
