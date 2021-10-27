package lab7.animal;

public class Wolf extends Animal {
    protected String picture = "Picture of Wolf";
	protected String food = "Thịt";
	protected int hunger = 1;

	@Override
	protected void chirp() {
		System.out.println("Wolf chirp : Úuuuuuu");
	}

	@Override
	protected void eat() {
		System.out.println("Wolf eat...........");
	}
}
