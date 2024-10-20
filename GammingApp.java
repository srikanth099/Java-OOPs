package org.krishna.oops.casting;

class GammingApp
{
	public void drinkwater()
	{
		System.out.println("water is the need of animal");
	}
	public void sound()
	{
	
	}
	public void movement()
	{
	
	}
}
class Lion extends Animal
{
	@Override
	public void sound()
	{
		System.out.println("Lion roars");
	}
	@Override
	public void movement()
	{
		System.out.println("Lion Runs/Walks/Jump");
	}
	public void eatfood()
	{
		System.out.println("Hunts for food");
	}
}
 class Snake extends Animal
{
	@Override
	public void sound()
	{
		System.out.println("sushhhhh");
	}
	@Override
	public void movement()
	{
		System.out.println("Nagin Dance");
	}
	public void venomuse()
	{
		System.out.println("Snake venom is medicinal");
	}
}
public class GammingApp {

	public static void main(String[] args) {
		Animal animal=new Lion();
		animal.drinkwater();
		animal.sound();
		animal.movement();
		Lion lion=(Lion)animal;
		lion.eatfood();
		Animal animal1=(Animal)new Snake();
		animal1.drinkwater();
		animal1.sound();
		animal1.movement();
		((Snake)animal).venomuse();
	}
}
