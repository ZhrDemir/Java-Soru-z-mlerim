package week01_SorularifElsIf;

import java.util.Scanner;

public class C_ifElseifStaSoru4 {
    public static void main(String[] args) {

        //SORU 4:Mesafeyi kilometre olarak girsin, çevirmek  istediği birimi sorun.
        // istediği birim metre veya santimetre ise çevirip yazdırn
        // yoksa istediğiniz birim sisteme kayıtlı değil yazdır

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesafeyi km olarak giriniz : ");
        double msf = scanner.nextDouble();

        System.out.println("Çevirmek istediğiniz birim nedir ? ");
         String brm = scanner.next();

        if (brm.equalsIgnoreCase("santimetre")){
            System.out.println(msf*100000+ "cm");}

        else if (brm.equalsIgnoreCase("metre")){
            System.out.println(msf*1000 + "m");}

        else System.out.println("istediğiniz birim sisteme kayıtlı değil ");



    }
    }

