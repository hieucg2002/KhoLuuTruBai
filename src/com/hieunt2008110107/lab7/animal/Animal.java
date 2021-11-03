package lab7.animal;

public class Animal {
    protected String picture;     //Hình Ảnh
	protected String food;        //Thức Ăn
	protected int hunger;         //Đói Bụng
	protected String boundaries;  //Ranh Giới
	protected int location;       //Vị Trí

	protected void chirp(){ //Tiếng Kêu
		System.out.println("Animal chirp........");
	}

	protected void eat(){ //Ăn
		System.out.println("Animal eat..........");
	}
	
	protected void sleep(){  //Ngủ
		System.out.println("Animal sleep..........");
	}

	protected void roam(){ //Di Chuyển
		System.out.println("Animal roam............");
	}
}