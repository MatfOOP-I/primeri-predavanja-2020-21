package rs.math.oop1.z110103.izuzeciIzbacivanje.z03.stekPrekoNizaKorisnickiIzuzetak;

public interface StekNiski {
   void push(String elem);
   String pop() throws StekJePrazanException;
   int brojElemenata();
}
