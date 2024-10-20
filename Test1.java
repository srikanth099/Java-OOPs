package org.krishna.oops.finall;
class A
{
	final static  int i;
	 final int j;
	static 
	{
		i=38;
	}
	{
		j=56;
	}
	public void display()
	{
	
		System.out.println(i);
		System.out.println(j);
	}
}
public class Test1 {

	public static void main(String[] args) {
		A a=new A();
		a.display();
	}

}
