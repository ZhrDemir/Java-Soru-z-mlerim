package week02_swichSoruları;

import java.util.Scanner;

public class C_soru4 {
    public static void main(String[] args) {

        //soru4: ISTQB kısaltmasındaki hangi harfin açıklamasını istiyorsunuz

        Scanner scanner = new Scanner(System.in);
        System.out.println("ISTQB kısaltmasındaki hangi harfin açıklamasını istiyorsunuz");
        char harf = scanner.next().charAt(0);

        switch (harf){
            case 'I' :
            case 'i':
                System.out.println("International");
                break;
                case 'S':
            case 's':
                System.out.println("Software");
                break;
            case 'T':
                case 't':
                    System.out.println("Teting");
                    break;
            case 'q':
            case 'Q':
                System.out.println("Qualitifications");
                break;
            case 'b':
            case 'B':
                System.out.println("Board");
                break;
            default:
                System.out.println("ISTQB kısaltmasındaki harflerden giriniz");
        }
    }
}
