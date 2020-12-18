package rs.math.oop1.z110103.izuzeciIzbacivanje.z04.stekPrekoListeKorisnickiIzuzetak;

public class PovezanaListaJePraznaException extends Exception
{	
	@Override
	public String toString()
	{
		String s = super.toString();
		return "Izuzetak: povezana lista je prazna. " + s;
	}
}
