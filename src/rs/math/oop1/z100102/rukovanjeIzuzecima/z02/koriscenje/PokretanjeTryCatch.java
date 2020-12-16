package rs.math.oop1.z100102.rukovanjeIzuzecima.z02.koriscenje;

public class PokretanjeTryCatch
{
	public static void main( String[] args )
	{
		int i = 13;
		int j = 0;
		
		try
		{
			System.out.println( "Usli smo u try blok sa " + "i = " + i + " j = " + j );
			System.out.println( i / j ); // Divide by 0 - exception thrown
			System.out.println( "Izlazimo iz try bloka!" );			
		}
		catch (ArithmeticException e)
		{ // Catch the exception
			System.out.println( "Uhvacen je izuzetak " + e );
		}
		System.out.println( "Izasli smo iz try/catch bloka!" );
		return;
	}
}
