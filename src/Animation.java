
public class Animation {
	
	
		public void run() {
			int x = 30;
			int y = 100;
			while (x <= 300 & y <= 300) {
				clear();
				;
				setColor(0, 128, 0);
				fillRect(x, y, 10, 100);
				x += 5;
				y += 5;
				sleep(0.01);

			}
			while (x >= 30) {
				clear();
				setColor(0, 128, 0);
				fillRect(x, y, 10, 100);
				x -= 5;
				sleep(0.01);

			}
			while (x <= 300 & y >= 30) {
				clear();
				setColor(0, 128, 0);
				fillRect(x, y, 10, 100);
				x += 5;
				y -= 5;
				sleep(0.01);

			}

		}

		private void sleep(double d) {
			// TODO 自動生成されたメソッド・スタブ
			
		}

		private void fillRect(int x, int y, int i, int j) {
			// TODO 自動生成されたメソッド・スタブ
			
		}

		private void setColor(int i, int j, int k) {
			// TODO 自動生成されたメソッド・スタブ
			
		}

		private void clear() {
			// TODO 自動生成されたメソッド・スタブ
			
		}
	}


