package org.krishna.oops.casting;

import java.util.Scanner;
class Bank
{
	public double rateOfInterestForHomeLoans()
	{
		return 0.0;
	
	}
}
class HDFC extends Bank
{
	@Override
	public double rateOfInterestForHomeLoans()
	{
		return 0.14;
	}
}
class SBI extends Bank
{
	@Override
	public double rateOfInterestForHomeLoans()
	{
		return 0.09;
	}
}
class Yes extends Bank
{
	@Override
	public double rateOfInterestForHomeLoans()
	{
		return 0.07;
	}
}
class Salesman
{
	public void SaleHomeLoansForClients(double amount,Bank bank)
	{
		double rateOfInterest=bank.rateOfInterestForHomeLoans();
		int roilnValue=((int)rateOfInterest*100);
		System.out.println(roilnValue+"% of interest to be charged by the bank");
		double totalAmount=amount*rateOfInterest;
		System.out.println(totalAmount+"is to be paid");
	}
}
public class BankApplication {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the amount");
		double amount=scn.nextDouble();
		Salesman Sales=new Salesman();
		Sales.SaleHomeLoansForClients(amount,new Yes());
		

	
	}

}

