package rs.math.oop1.z130300.generickiTip.z03.kutija;

public class KutijaPokretanje
{
	
	
	public static void main( String[] args )
	{
		Kutija<String> b1 = new Kutija<String>("baba");
		System.out.println( b1 );
		b1.set( "zaba" );
		System.out.println( b1 );
		Kutija<Integer> b2 = new Kutija<>(23);
		System.out.println( b2 );
		Kutija<Double> b3 = new Kutija<>(2.5);
		System.out.println( b3 );
	}
	
}
