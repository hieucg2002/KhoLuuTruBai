package lab7.animal;

public class Hippo extends Animal {
    protected String picture = "Picture is Hippo";
	protected String food = "Food is Hippo";
	protected int hunger = 3;

	@Override
	protected void chirp() {
		super.chirp();
		System.out.println("Hippo chirp : Esccccccc Esccccccc Éccccccc");
	}
}