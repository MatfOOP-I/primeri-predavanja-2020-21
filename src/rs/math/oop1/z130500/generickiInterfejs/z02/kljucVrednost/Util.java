package rs.math.oop1.z130500.generickiInterfejs.z02.kljucVrednost;

public class Util
{
	// Generic static method
	public static <T, W> boolean areEqual(
			Par<T, W> p1, Par<T, W> p2 )
	{
		return p1.getKey().equals( p2.getKey() )
				&& p1.getValue().equals( p2.getValue() );
	}
}