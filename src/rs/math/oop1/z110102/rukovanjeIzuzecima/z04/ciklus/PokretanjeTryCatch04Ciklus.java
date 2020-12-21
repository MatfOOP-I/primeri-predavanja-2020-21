package rs.math.oop1.z110102.rukovanjeIzuzecima.z04.ciklus;

public class PokretanjeTryCatch04Ciklus
{
	public static void main( String[] args )
	{
		System.out.println( "Ulazimo u try/catch blok." );
		try
		{
			int i = 12;			
			System.out.println( "Ulazimo u for ciklus." );
			for (int j = 3; j >= -2; j--)
			{
				System.out.println( "Usli smo u iteraciju ciklusa sa " + "i = " + i + " j = " + j );
				System.out.println( i / j ); // Divide by 0 - exception thrown
			}
			System.out.println( "Izasli smo iz for ciklusa." );
		}
		catch (ArithmeticException e)
		{ 
			System.out.println( "Uhvacen je ArithmeticException izuzetak " + e );
		}
		System.out.println( "Izasli smo iz try/catch bloka." );
	}
}
