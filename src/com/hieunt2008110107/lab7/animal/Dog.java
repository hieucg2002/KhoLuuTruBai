package lab7.animal;

public class Dog extends Animal {
    protected String picture = "Picture of Dog";
	protected String food = "Thức ăn cho chó cao cấp";
	protected int hunger = 5;

	@Override
	protected void chirp() {
		System.out.println("Dos chirp : Gau Gau");
	}

	@Override
	protected void eat() {
		System.out.println("Dog eat : Food");
	}
}
