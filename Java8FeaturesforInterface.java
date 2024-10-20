package org.krishna.oops.interfacee;


interface Iter
{
	void m1();
	default void m2()
	{
	
		System.out.println("default method m2() defined in interface iter");
	}
	static void m3()
	{
		System.out.println("static method m3() in interface defined");
	}
}
class A1 implements Iter
{
@Override
public void m1()
{
	System.out.println("m1() implemented for class A");
}
}
public class Java8FeaturesforInterface {

	public static void main(String[] args) 
		{
			Iter it=new A1();
			it.m1();
			it.m2();
			Iter.m3();
		}

	}
