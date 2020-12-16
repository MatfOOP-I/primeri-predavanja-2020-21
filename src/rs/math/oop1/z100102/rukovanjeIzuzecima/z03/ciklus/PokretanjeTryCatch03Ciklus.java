package rs.math.oop1.z100102.rukovanjeIzuzecima.z03.ciklus;

public class PokretanjeTryCatch03Ciklus
{
	public static void main( String[] args )
	{
		int i = 12;
		
		System.out.println( "Usli smo u ciklus!" );
		for (int j = 3; j >= -2; j--)
		{
			try
			{
				System.out.println( "Usli smo u try blok sa " + "i = " + i + " j = " + j );
				System.out.println( i / j ); // Divide by 0 - exception thrown
				System.out.println( "Izlazimo iz try bloka!" );				
			}
			catch (ArithmeticException e)
			{ // Catch the exception
				System.out.println( "Uhvacen izuzetak " + e );
			}
			System.out.println( "Izasli smo iz try/catch bloka!" );
		}
		System.out.println( "Izasli smo iz ciklusa!" );		
		return;
	}
}
