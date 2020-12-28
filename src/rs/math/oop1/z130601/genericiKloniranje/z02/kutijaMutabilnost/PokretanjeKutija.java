package rs.math.oop1.z130601.genericiKloniranje.z02.kutijaMutabilnost;

public class PokretanjeKutija
{
	
	public static void main( String[] args )
	{
		try
		{
			Student pera = new Student( "Petar", "Petrovic" );
			Kutija<Student> kutija = new Kutija<>( pera );
			System.out.println( kutija );
			Student pera2 = pera.clone();
			pera.setIme( "Mitar" );
			System.out.println( pera + ", " + pera2 );
			System.out.println( kutija );
		}
		catch (CloneNotSupportedException e)
		{
			System.out.println( e );
		}
		
	}
	
}
