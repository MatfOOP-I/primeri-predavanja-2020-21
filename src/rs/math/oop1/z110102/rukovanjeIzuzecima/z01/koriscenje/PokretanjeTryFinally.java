package rs.math.oop1.z110102.rukovanjeIzuzecima.z01.koriscenje;

public class PokretanjeTryFinally {
    public static void main(String[] args) {
        int i = 11;
        int j = 70;

        System.out.println("Ulazimo u try/finaly blok!");
        try {
            System.out.println("Usli smo u try blok sa " + "i = " + i + " j = " + j);
            System.out.println(i / (j-j)); // Divide by 0 - exception thrown
            System.out.println("Izlazimo iz try bloka!");
        } finally {
            System.out.println("U finally bloku smo!");
        }
        System.out.println("Izasli smo iz try/finaly bloka!");
    }
}
