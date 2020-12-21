package rs.math.oop1.z130300.generickiTip.z02.kutija;

public class KutijaPokretanje
{
	
	
	public static void main( String[] args )
	{
		Kutija<String> b1 = new Kutija<String>();
		b1.set( "baba" );
		System.out.println( b1.get() );
		b1.set( "zaba" );
		System.out.println( b1.get() );
		//b1.set(23);
		Kutija<Integer> b2 = new Kutija<>();
		b2.set( 23 );
		int x = b2.get();
		System.out.println( x );
		Kutija<Double> b3 = new Kutija<>();
		b3.set( 2.5 );
		System.out.println( b3.get() );
	}
	
}
