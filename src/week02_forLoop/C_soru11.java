package week02_forLoop;


import java.util.Scanner;

public class C_soru11 {
    public static void main(String[] args) {

        // poz tam sayı iste,
        // asal sayı olup olmadığını incele


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif tam sayı girin");
        int sayi = scanner.nextInt();

        int flag = 10;

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                flag = 11;
                break;

            }
        }

        if (flag == 10) {
            System.out.println("girdiğiniz sayı asal ");
        } else
            System.out.println("girdiğiniz sayı asal değil");

        
        }

    }
