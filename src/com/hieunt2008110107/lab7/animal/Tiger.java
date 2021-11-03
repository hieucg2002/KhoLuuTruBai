package lab7.animal;

public class Tiger extends Animal {
    protected String picture = "Picture is tiger";
	protected String food = "Food is Tiger";
	protected int hunger = 1;

	@Override
	protected void chirp() {
		super.chirp();
		System.out.println("Tiger chirrp : Gruuuuuuu");
	}
}