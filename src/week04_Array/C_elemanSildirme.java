package week04_Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C_elemanSildirme {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            // Verilen array
            int[] array = {1, 5, 1, 3, 2};
            System.out.println("Verilen Array : "+ Arrays.toString(array));
            System.out.print("Arrayden cikarmak istediginiz sayiyi giriniz: ");
            int cikacakEleman = scanner.nextInt();
            int[] yeniArray = arraydenElamanCikar(array, cikacakEleman);
            System.out.println("Yeni array: " + Arrays.toString(yeniArray));
        }
        public static int[] arraydenElamanCikar(int[] array, int sayi) {
            int yeniLength = 0; // Arrayda geriye kalan eleman sayisini belirleyen sayac
            // Cikartmak istedigimiz hedef sayiya esit olmayan ve geride kalacak eleman sayisi
            for (int i = 0; i < array.length; i++) {
                if (array[i] != sayi) {
                    yeniLength++;
                }
            }
            // Yeni array lengthini geride kalacak eleman sayısı kadar tanimlariz
            int[] yeniArray = new int[yeniLength];
            // Cıkacak sayi disindaki elemanlari yeni arraye kopyalama
            int yeniIndex = 0; // yeni arrayin index adresleri
            for (int i = 0; i < array.length; i++) {
                if (array[i] != sayi) {
                    yeniArray[yeniIndex] = array[i];
                    yeniIndex++;
                }
            }
            return yeniArray;
        }
    }



