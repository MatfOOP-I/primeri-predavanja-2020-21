package rs.math.oop1.z130300.generickiTip.z04.kutija;

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