package rs.math.oop1.z170200.lambdaIzrazi.z05.osobePredicateConsumer;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static java.lang.System.*;

public class OsobePretragaObrada01LambdaPokretanje {

    public static <T> void obradi(List<T> lista, Predicate<T> predikat, Consumer<T> potrosac) {
        for (T elem : lista) {
            if (predikat.test(elem)) {
                potrosac.accept(elem);
            }
        }
    }

    public static void main(String[] args) {
        for (Osoba o : Osoba.LIKOVI_CRTANI)
            o.prikazi();
        System.out.println("---");
        obradi(Osoba.LIKOVI_CRTANI, o -> o.getBrojGodina() >= 50, o -> o.prikazi());
        System.out.println("---");
        obradi(Osoba.LIKOVI_CRTANI, x -> x.getBrojGodina() >= 80, y -> out.println(y));
        System.out.println("---");
        obradi(Osoba.LIKOVI_CRTANI, o -> o.getBrojGodina() >= 80 && o.getBrojGodina() <= 85,
                x -> out.println(x.getEmailAdresa()));
        System.out.println("---");
        obradi(Osoba.LIKOVI_CRTANI, o -> o.getEmailAdresa().indexOf("disney") >= 0, o -> o.prikazi());
        System.out.println("---");
        obradi(Osoba.LIKOVI_CRTANI, o -> o.getPol() == Osoba.Pol.ZENA && o.getEmailAdresa().indexOf("disney") >= 0,
                o -> o.prikazi());
        System.out.println("---");
    }

}
