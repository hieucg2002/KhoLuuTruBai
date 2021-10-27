package lab7.shape;

public class Amoeba extends Shape {
    private int x;
	private int y;
	
	Amoeba(String amThanh, int xx, int yy){
		sound = amThanh;
		x = xx;
		y = yy;
	}

	@Override
	protected void rotate() {
		System.out.println("Xoay 360 theo toa do x = " + x + " va y = " + y);
		state = true;
	}

	@Override
	protected void playSound() {
		if(state == true)
			System.out.println("Đang mở file...");
		else
			System.out.println("Xảy ra lỗi");
	}
}
