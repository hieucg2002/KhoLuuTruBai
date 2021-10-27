package lab7.animal;

public class Lion extends Animal {
    protected String picture = "Picture of Lion";
	protected String food = "Thịt";
	protected int hunger = 1;

	@Override
	protected void chirp() {
		System.out.println("Lion chirp : Graooooooo");
	}

	@Override
	protected void eat() {
		System.out.println("Lion eat...........");
	}

}
