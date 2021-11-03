package lab7.animal;

public class Lion extends Animal {
    protected String picture = "Picture is Lion";
	protected String food = "Food is Lion";
	protected int hunger = 1;

	@Override
	protected void chirp() {
		super.chirp();
		System.out.println("Lion chirp : Graooooooo");
	}
}