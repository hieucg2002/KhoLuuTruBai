package lab7.animal;

public class Cat extends Animal {
    
    protected String picture = "Picture of cat";
	protected String food = "Food is Cat";
	protected int hunger = 5;

	@Override
	protected void chirp() {
		System.out.println("Cat chirp : Meow Meow");
	}

	@Override
	protected void eat() {
		System.out.println("Cat eat : fish");
	}

	void chaseMouse(){
		System.out.println("Cat chase Mouse");
	}
    
}
