package rs.math.oop1.z130500.generickiInterfejs.z01.kljucVrednost;

public class Kutija<T>
{
	private T uKutiji;
	
	public Kutija(T t)
	{
		uKutiji = t;
	}
	
	public void set( T t )
	{
		uKutiji = t;
	}
	
	public T get()
	{
		return uKutiji;
	}
	
	@Override
	public String toString()
	{
		return "[" + uKutiji + "]";
	}
	
}