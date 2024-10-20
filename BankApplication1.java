package org.krishna.oops.casting;

@FunctionalInterface
interface Bank2
{
	void rateOfInterest();
}
public class BankApplication1 {

	public static void main(String[] args) {
		Bank2 bank=() -> System.out.println("10% of rate of interest");
		bank.rateOfInterest();
				
	}

}
