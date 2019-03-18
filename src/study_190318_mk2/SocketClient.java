package study_190318_mk2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient {

	Socket socket = null;
	PrintWriter writer = null;
	BufferedReader reader = null;

	Scanner scanner = new Scanner(System.in);

	public SocketClient() {

		try {

			// 서버쪽 accepe() 호출하기
			// IP, 사설IP, localhost
			socket = new Socket("192.168.0.16", 10000);

			// 메시지를 보내기 위해 output사용
			writer = new PrintWriter(socket.getOutputStream());
			String line;

			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			Thread t1 = new Thread(new ReaderThread());
			t1.start();

			// 메인스레드 역살 = 쓰는 역할
			while (true) {

				line = scanner.nextLine();
				writer.println(line);
				writer.flush();

			}

//			writer.close();
//			socket.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	class ReaderThread implements Runnable {

		@Override
		public void run() {

			String line = null;
			try {
				while ((line = reader.readLine()) != null) {
					System.out.println("서버로부터 온 메세지 : " + line);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {

		new SocketClient();

	}

}
