

public class DisplayFaceAndTree extends MyFrame{
	public void run() {
		Car car1=new Car(200,200,-10,0);
		Car car2=new Car(30,100,10,0);
		for(int i=0;i<=30;i++) {
			clear();
			car1.draw(this);
			car2.draw(this);
			car1.move();
			car2.move();
			sleep(0.1);
		}
	}
}