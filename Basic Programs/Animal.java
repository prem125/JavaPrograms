package oops;

public class Animal {

	public static void main(String[] args) {
		Cat kitty = new Cat();
		kitty.makeNoise();
		kitty.makeNoise();
		Dog stuffy = new Dog();
		stuffy.makeNoise();
		stuffy.makeNoise();
	}

}
class AnimalClass
{
	public void makeNoise()
	{
		System.out.println("Make Some Noise");
	}
}
class Cat extends AnimalClass
{
	public void makeNoise()
	{
		System.out.println("Meow Meow");
	}
}
class Dog extends Cat
{
	public void makeNoise()
	{
		System.out.println("Bhow Bhow");
	}
}