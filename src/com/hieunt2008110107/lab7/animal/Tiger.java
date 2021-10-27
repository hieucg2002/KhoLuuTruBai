package lab7.animal;

public class Tiger extends Animal {
    protected String picture = "Picture of tiger";
	protected String food = "thịt";
	protected int hunger = 1;

	@Override
	protected void chirp() {
		System.out.println("Tiger chirrp : Gruuuuuuu");
	}

	@Override
	protected void eat() {
		System.out.println("Tiger eat............");
	}
}
