package lab8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread extends Thread {
	FileReader fReader;
	FileWriter fWriter;

	CopyDataThread(FileReader fReader, FileWriter fWriter) {
		this.fReader = fReader;
		this.fWriter = fWriter;
	}

	public void run() {
		try {
			int ch;
			int count = 0;
			while ((ch = fReader.read()) != -1) {
				fWriter.write((char) ch);
				count++;

				if (count == 10) {
					System.out.println("10 characters are copied");
					count = 0;
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}

		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			try {
				fReader.close();
				fWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
