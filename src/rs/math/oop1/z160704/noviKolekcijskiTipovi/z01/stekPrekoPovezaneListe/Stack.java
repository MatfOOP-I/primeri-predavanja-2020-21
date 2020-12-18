package rs.math.oop1.z160704.noviKolekcijskiTipovi.z01.stekPrekoPovezaneListe;

import java.util.Collection;

public interface Stack<E> extends Collection<E>
{
	void push(E elem);
	
	E peek();
	
	E pop();
}
