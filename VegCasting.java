package org.krishna.oops.casting;

import java.util.Scanner;
class Vegetable
{
	
}
class Carrot extends Vegetable
{
	public void prepareCarrotHalwa()
	{
		System.out.println("Halwa is a traditional sweet of india");
	}
}
class Potato extends Vegetable
{
	public void prepareFrenchFries()
	{
		System.out.println("FrenchFries with more oil is a good for health");
	}
}
class ShopKeeper
{
	public  Vegetable sell(String VegName)
	{
		if(VegName.equalsIgnoreCase("Carrot")) return new Carrot();
		if(VegName.equalsIgnoreCase("Potato")) return new Potato();
		System.out.println(VegName+"Not available");
		return null;
	}
}
public class VegCasting 
{

	//private static final Carrot Veg = null;

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Vegetable:");
		String VegName=scn.nextLine();
		ShopKeeper shop=new ShopKeeper();
		Vegetable veg=shop.sell(VegName);
		if(veg instanceof Carrot)
			((Carrot)veg).prepareCarrotHalwa();
		if(veg instanceof Potato)
		((Potato)veg).prepareFrenchFries();

	}

}
