package week04_ArrayList_sf211;

import java.util.ArrayList;
import java.util.List;

public class C03_istenmeyeniSilme {
    public static void main(String[] args) {


     //  Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
     //  kismini list olarak bize donduren bir method olusturun

        List<String> names= new ArrayList<>();
        names.add("ayse");
        names.add("selma");
        names.add("merve");
        names.add("mine");
        names.add("meryem");


        String istenmeyenHarf = "y";
        System.out.println(newNames(names,istenmeyenHarf));

    }

    private static List<String> newNames(List<String> names,String istenmeyenHarf) {




        List<String> newList = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {
            if (!(names.get(i).toUpperCase().contains(istenmeyenHarf.toUpperCase()))){
                newList.add(names.get(i));
            }
        }


        return newList;
    }
}
