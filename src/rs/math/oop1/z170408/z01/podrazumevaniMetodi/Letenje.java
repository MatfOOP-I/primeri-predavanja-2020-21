package rs.math.oop1.z170408.z01.podrazumevaniMetodi;

public interface Letenje {
    default void poletanje() {
        System.out.println("Letenje::poletanje");
    }

    default void sletanje() {
        System.out.println("Letenje::sletanje");
    }

    default void zaokretanje() {
        System.out.println("Letenje::zaokretanje");
    }

    default void krstarenje() {
        System.out.println("Letenje::krstarenje");
    }
}
