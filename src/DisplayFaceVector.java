
import java.util.Vector;

//public class DisplayFaceVector extends MyFrame{
//	public void run() {
//		Vector<Face> faces=new Vector<Face>();
//		faces.add(new Face(50,50,10,5));
//		faces.add(new Face(200,100,-10,-5));
//		for(int i = 0; i<30;i++) {
//			clear();
//			for(int j = 0;  j<faces.size();j++) {
//				faces.get(j).draw(this);
//				faces.get(j).move();
//			}
//			sleep(0.1);
//			
//		}
//	}
//
//}
public class DisplayFaceVector extends MyFrame{
	public void run() {
		Vector<Car> cars=new Vector<Car>();
		cars.add(new Car(50,50,10,0));
		cars.add(new Car(50,130,10,0));
		cars.add(new Car(50,210,10,0));
		cars.add(new Car(50,290,10,0));
		cars.add(new Car(50,370,10,0));
		for(int i = 0; i<30;i++) {
			clear();
			for(int j = 0;  j<cars.size();j++) {
				cars.get(j).draw(this);
				cars.get(j).move();
			}
			sleep(0.1);
			
		}
	}

}