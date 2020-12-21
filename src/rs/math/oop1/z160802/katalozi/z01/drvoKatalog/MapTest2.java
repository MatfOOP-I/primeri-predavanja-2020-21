package rs.math.oop1.z160802.katalozi.z01.drvoKatalog;

import java.util.*;
import java.util.Map.Entry;

public class MapTest2 {
    public static void main(String[] args) {
        SortedMap<String, Employee2> osoblje = new TreeMap<>();
        osoblje.put("927-25-5464-0", new Employee2("Miki Maus", 10));
        osoblje.put("144-25-5464", new Employee2("Amy Lee", 10));
        osoblje.put("567-24-2546", new Employee2("Marko Markovic", 20));
        osoblje.put("157-62-7935-3", new Employee2("Gary Cooper", 100));
        osoblje.put("456-62-5527", new Employee2("Francesca Cruz"));
        System.out.println(osoblje);
        System.out.println("---");
        SortedMap<String, Employee2> osoblje2 = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() - o2.length() != 0)
                    return o1.length() - o2.length();
                return o1.compareTo(o2);
            }
        });
        for (Entry<String,Employee2> e : osoblje.entrySet())
            osoblje2.put(e.getKey(), e.getValue());
        System.out.println(osoblje2);
        System.out.println("---");

    }
}

/**
 * A minimalist employee class for testing purposes.
 */
class Employee2 {

    public Employee2(String n, double plata) {
        ime = n;
        this.plata = plata;
    }

    public Employee2(String n) {
        this(n, 0);
    }

    public String toString() {
        return "[ime=" + ime + ", plata=" + plata + "]\r\n";
    }

    private String ime;
    private double plata;
}
