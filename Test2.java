package org.krishna.oops.constroctor;

class C
{
	int i;
	int j;
	public C(int i,int j)
	{
		this.i=i;
		this.j=j;
	}

public void display()
{
	System.out.println(i+","+j);
}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C c1=new C(2,3);
c1.display();
C c2=new C(23,45);
c2.display();
C c3=new C(34,56);
c3.display();
	}

}
