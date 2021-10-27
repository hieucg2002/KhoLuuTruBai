package lab7.animal;

public class Hippo extends Animal {
    protected String picture = "Picture of Hippo";
	protected String food = "rau củ";
	protected int hunger = 3;

	@Override
	protected void chirp() {
		System.out.println("Hippo chirp : Esccccccc Esccccccc Éccccccc");
	}
}
