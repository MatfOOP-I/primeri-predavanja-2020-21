package rs.math.oop1.z110103.izuzeciIzbacivanje.z04.stekPrekoListeKorisnickiIzuzetak;

public interface StekNiski {
   void push(String elem);
   String pop() throws StekJePrazanException;
   int brojElemenata();
}
