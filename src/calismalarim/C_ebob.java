package calismalarim;

import java.util.Scanner;

public class C_ebob {
    public static void main(String[] args) {
        // EBOB bulma


        Scanner scanner = new Scanner(System.in);
        System.out.println("EBOB bulmak için pozitif ilk sayıyı girin : ");
        int sayi1= scanner.nextInt();
        System.out.println("EBOB bulmak için pozitif ikinci sayıyı girin : ");
        int sayi2 = scanner.nextInt();

        int ebob = Math.min(sayi1,sayi2);

        while (true){
            if (sayi1 % ebob ==0 && sayi2 % ebob == 0){
                System.out.printf("%d ve % d sayılarının EBOB'u %d dir.",sayi1,sayi2,ebob);
                break;
            }
            --ebob;
        }




    }
}
