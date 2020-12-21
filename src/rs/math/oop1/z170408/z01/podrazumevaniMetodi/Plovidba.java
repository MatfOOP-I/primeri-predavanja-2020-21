package rs.math.oop1.z170408.z01.podrazumevaniMetodi;

public interface Plovidba {
    default void krstarenje() {
        System.out.println("Plovidba::krstarenje");
    }

    default void zaokretanje() {
        System.out.println("Plovidba::zaokretanje");
    }
}
