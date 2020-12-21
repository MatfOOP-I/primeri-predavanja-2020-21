package rs.math.oop1.z130500.generickiInterfejs.z02.kljucVrednost;


public class UredjeniParPokretanje
{
	
	
	public static void main( String[] args )
	{
		UredjeniPar<Integer, String> p1 = 
				new UredjeniPar<>(1, "apple");
		UredjeniPar<Integer, String> p2 = 
				new UredjeniPar<>(2, "banana");
		boolean same1 = Util.<Integer, String>areEqual(p1, p2);
		if( same1 )
			System.out.println( p1 + " i " + p2 + " su isti." );
		else
			System.out.println( p1 + " i " + p2 + " nisu isti." );
		p2 = new UredjeniPar<>(10/10, "apple");		
		boolean same2 = Util.areEqual(p1, p2);
		if( same2 )
			System.out.println( p1 + " i " + p2 + " su isti." );
		else
			System.out.println( p1 + " i " + p2 + " nisu isti." );
	}
	
}
