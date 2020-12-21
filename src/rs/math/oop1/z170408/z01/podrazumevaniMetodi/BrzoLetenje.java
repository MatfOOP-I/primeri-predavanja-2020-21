package rs.math.oop1.z170408.z01.podrazumevaniMetodi;

public interface BrzoLetenje extends Letenje {
    default void poletanje() {
        System.out.println("BrzoLetenje::polece");
    }
}


