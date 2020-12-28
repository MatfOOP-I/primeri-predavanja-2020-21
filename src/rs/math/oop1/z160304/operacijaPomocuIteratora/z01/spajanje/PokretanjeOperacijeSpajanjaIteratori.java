package rs.math.oop1.z160304.operacijaPomocuIteratora.z01.spajanje;

import java.util.*;

public class PokretanjeOperacijeSpajanjaIteratori {
    public static void main(String[] args) {
        List<String> a = new LinkedList<>();
        a.add("Erica");
        a.add("Amy");
        a.add("Carl");
        a.add(2, "Bob");
        a.add("Damir");
        System.out.println(a);
        System.out.println("---");

        List<String> b = new ArrayList<>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");
        System.out.println(b);
        System.out.println("---");

        // kreiranje jedne kolekcije na osnovu druge
        Collection<String> bb = new LinkedList<>(b);
        System.out.println(bb);
        System.out.println("---");

        // spajanje dve kolekcije - na kraj a se nalepljuje b
        List<String> aa = new ArrayList<>(a);
        ListIterator<String> aaIter = aa.listIterator();
        while (aaIter.hasNext())
            aaIter.next();
        Iterator<String> bbIter = bb.iterator();
        while (bbIter.hasNext()) {
            aaIter.add(bbIter.next());
        }
        System.out.println(aa);
        System.out.println("---");

        // spajanje dve kolekcije - na a se nalepljuje b naizmenicno
        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();
        while (bIter.hasNext()) {
            if (aIter.hasNext())
                aIter.next();
            aIter.add(bIter.next());
        }
        System.out.println(a);
        System.out.println("---");

    }
}
