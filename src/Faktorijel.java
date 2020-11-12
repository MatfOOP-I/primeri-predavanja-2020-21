
class Faktorijel {

    static int fakt(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * fakt(n - 1);
    }

    public static void main(String[] args) {

        System.out.println(fakt(5));

    }

}
