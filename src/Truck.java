

public class Truck extends Vehicle{
	public Truck(int x, int y, int vx, int vy) {
		super(x, y, vx, vy);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void draw(MyFrame frame) {
		frame.fillRect(x+70,y-10,30,40);
		frame.fillRect(x,y+10,70,20);
		frame.fillOval(x+5, y+30, 10, 10);
		frame.fillOval(x+15, y+30, 10, 10);
		frame.fillOval(x+75, y+30, 10, 10);

	}
	
}

