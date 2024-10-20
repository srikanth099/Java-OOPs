package org.krishna.oops.interfacee;

interface Iter
{
	int i=45;
	void m1();
	void m2();
	}
class B implements Iter
{
	@Override
public  void m1()
	{
		
	System.out.println("m1() implemented for class B");
	}
@Override
 public void m2()
{
	
System.out.println("m2() implemented for class B");
}
}
public class InterfaceExample {

	public static void main(String[] args) {
		Iter iter=new B();
		iter.m1();
		iter.m2();
		System.out.println(Iter.i);

	}

}
