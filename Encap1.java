package org.krishna.oops.encapsulation;

class A {
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}

public class Encap1 {

	public static void main(String[] args) {
		A a = new A();

		a.setI(40);
		System.out.println(a.getI());
	}

}
