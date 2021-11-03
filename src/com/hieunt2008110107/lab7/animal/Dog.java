package lab7.animal;

public class Dog extends Animal {
    protected String picture = "Picture is Dog";
	protected String food = "Food is Dog";
	protected int hunger = 5;

	@Override
	protected void chirp() {
		super.chirp();
		
		System.out.println("Dos chirp : Gau Gau");
	}
}