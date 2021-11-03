package lab7.animal;

public class Wolf extends Animal {
    protected String picture = "Picture is Wolf";
	protected String food = "Food is Wolf";
	protected int hunger = 1;

	@Override
	protected void chirp() {
		super.chirp();
		System.out.println("Wolf chirp : Úuuuuuu");
	}
}