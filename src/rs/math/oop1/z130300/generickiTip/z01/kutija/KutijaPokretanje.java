package rs.math.oop1.z130300.generickiTip.z01.kutija;

public class KutijaPokretanje
{
	
	
	public static void main( String[] args )
	{
		Kutija b1 = new Kutija();
		System.out.println( b1.get() );
		b1.set( "baba" );
		System.out.println( b1.get() );
		b1.set( "zaba" );
		System.out.println( b1.get() );
		b1.set( 1 );
		System.out.println( b1.get() );
		b1.set( 2.5 );
		System.out.println( b1.get() );
	}
	
}
