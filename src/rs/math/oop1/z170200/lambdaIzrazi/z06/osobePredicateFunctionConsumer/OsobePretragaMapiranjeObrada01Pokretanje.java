package rs.math.oop1.z170200.lambdaIzrazi.z06.osobePredicateFunctionConsumer;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.lang.System.*;

public class OsobePretragaMapiranjeObrada01Pokretanje {

    public static <X,Y> void obradiMapiraj(List<X> lista, Predicate<X> predikat, Function<X,Y> preslikavanje,
            Consumer<Y> potrosac) {
        for (X elem : lista) {
            if (predikat.test(elem)) {
                Y medjuRezultat = preslikavanje.apply(elem);
                potrosac.accept(medjuRezultat);
            }
        }
    }

    public static void main(String[] args) {
        obradiMapiraj(Osoba.LIKOVI_CRTANI, x -> true, x -> x, x -> x.prikazi());
        System.out.println("---");
        obradiMapiraj(Osoba.LIKOVI_CRTANI, x -> x.getBrojGodina() >= 80, x -> x.getEmailAdresa(), s -> out.println(s));
        System.out.println("---");
        obradiMapiraj(Osoba.LIKOVI_CRTANI, o -> o.getBrojGodina() >= 80 && o.getBrojGodina() <= 85,
                x -> x.getEmailAdresa(), s -> out.println(s.toUpperCase()));
        System.out.println("---");
        obradiMapiraj(Osoba.LIKOVI_CRTANI, o -> o.getEmailAdresa().indexOf("disney") >= 0,
                o -> o.getIme() + " " + o.getBrojGodina(), s -> out.println(s));
        System.out.println("---");
        obradiMapiraj(Osoba.LIKOVI_CRTANI, o -> o.getPol() == Osoba.Pol.ZENA && o.getEmailAdresa().indexOf("disney") >= 0,
                o -> o.getIme(),  x -> out.println(x + " " + x.length()));
        System.out.println("---");
    }

}
