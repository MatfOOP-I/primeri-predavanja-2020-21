package rs.math.oop1.z110102.rukovanjeIzuzecima.z02.koriscenje;

public class PokretanjeTryCatch
{
	public static void main( String[] args )
	{
		int i = 13;
		int j = 80;
		
		System.out.println("Ulazimo u try/catch blok!");
		try
		{
			System.out.println( "Usli smo u try blok sa " + "i = " + i + " j = " + j );
			System.out.println( i / (j-j) ); 
			System.out.println( "Izlazimo iz try bloka!" );			
		}
		catch (ArithmeticException e)
		{ 
			System.out.println( "Uhvacen je izuzetak " + e );
		}
		System.out.println( "Izasli smo iz try/catch bloka!" );
	}
}
