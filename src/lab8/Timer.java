package lab8;

import java.time.LocalTime;

public class Timer implements Runnable {

	@Override
	public void run() {

		while (true) {
			LocalTime time = LocalTime.now();
			System.out.println(time);
			
			try {
				Thread.sleep(10000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Thread thread = new Thread(new Timer());
		
		thread.start();
	}

}
