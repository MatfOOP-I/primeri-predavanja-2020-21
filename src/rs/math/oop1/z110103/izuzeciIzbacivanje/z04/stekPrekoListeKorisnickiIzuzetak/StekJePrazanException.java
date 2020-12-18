package rs.math.oop1.z110103.izuzeciIzbacivanje.z04.stekPrekoListeKorisnickiIzuzetak;

public class StekJePrazanException extends Exception
{
	public StekJePrazanException( Exception e)
	{
		super(e);
	}

	@Override
	public String toString()
	{
		String s = super.toString();
		return "Izuzetak: stek je prazan. " + s;
	}
}
