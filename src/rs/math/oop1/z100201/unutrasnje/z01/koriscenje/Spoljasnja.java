package rs.math.oop1.z100201.unutrasnje.z01.koriscenje;

public class Spoljasnja {
    private int j = 24;

    public class Unutrasnja {
        private int j = 12;

        @Override
        public String toString() {
            return "Unutrasnja "+ "j(unutra) = " + j +
                    ", j(spolja) = " + Spoljasnja.this.j;
        }
    }

    public static void main(String[] args) {
        Spoljasnja sp = new Spoljasnja();
        Unutrasnja unutra = sp.new Unutrasnja();
        System.out.println(unutra);
    }

}
