package rs.math.oop1.z160000.koriscenjeKolekcije.z03.sortiranje;

import java.util.*;

public class PokretanjeLinkedListSortiranje {
    public static void main(String[] args) {
        List<String> a = new LinkedList<>();
        a.add("Erica");
        a.add(0, "Amy");
        a.add(1, "Carl");
        a.add(1, "Bob");
        a.add("Damir");
        System.out.println(a);
        System.out.println("---");

        Collections.sort(a);
        System.out.println(a);
        System.out.println("---");

        Collections.sort(a, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.length() - s1.length();
            }
        });
        System.out.println(a);
        System.out.println("---");

        // Collections.sort(a, (s1, s2) -> s1.length() - s2.length());
        // System.out.println(a);
        // System.out.println("---");
    }
}
