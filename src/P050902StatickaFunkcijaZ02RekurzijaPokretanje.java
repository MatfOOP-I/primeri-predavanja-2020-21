class PokretanjeStatickaFunkcijaZ02Rekurzija {

    static int faktorijel(int n) {
        if(n==0 || n==1)
            return 1;
        int f = faktorijel(n-1);
        return n * f;
    }

     public static void main(String[] args) {
        int n = 15;
        int fakt = faktorijel(n);
        System.out.println("faktorijel broja " + n + " je " + fakt);
    }

}
