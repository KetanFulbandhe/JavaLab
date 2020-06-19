class Animal
{
	void makeSound()
	{
		System.out.println("Inside Animal makeSound()");
	}
}
class Dog extends Animal
{
	void makeSound()
	{
		System.out.println("Inside Dog MakeSound \tBow..Bow");
	}
}
class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("Inside Cat MakeSound \t Mew..Mew");
	}
}
class Tiger extends Animal
{
	void makeSound()
	{
		System.out.println("Inside Tiger MakeSound \t roar..");
	}
	void Hunting()
	{
		System.out.println("\tInside Tiger Hunting...");
	}
}
public class AnimalDemo
{
	public static void perform(Animal ref)
	{
		if(ref instanceof Tiger)
		{
			Tiger obj =(Tiger)ref;
			obj.Hunting();
		}
		ref.makeSound();
	}
	public static void main(String args[])
	{
		perform(new Dog());
		perform(new Cat());
		perform(new Tiger());
	}
}