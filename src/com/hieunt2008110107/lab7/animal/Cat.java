package lab7.animal;

public class Cat extends Animal {
    
    protected String picture = "Picture is cat";
	protected String food = "Food is Cat";
	protected int hunger = 5;

	@Override
	protected void chirp() {
		super.chirp();
		System.out.println("Cat chirp : Meow Meow");
	}
}