package lab7.shape;

public class Shape {
    protected String sound;
	protected boolean state = false;

	protected void rotate(){
		System.out.println("Da xoay 360, backlip cac thu"); 
		state = true;	
	}

	protected void playSound(){
		if(state == true)
		{
			System.out.println("Am thanh dang duoc phat: " + sound);
			System.out.println("	***Ket thuc***");
		}
		else
			System.out.println("Co loi!!!");
	}
}