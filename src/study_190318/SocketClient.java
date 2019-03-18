package study_190318;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient {

	Socket socket = null;
	PrintWriter writer = null;
	Scanner scanner = new Scanner(System.in);

	public SocketClient() {

		try {

			// 서버쪽 accepe() 호출하기
			// IP, 사설IP, localhost
			socket = new Socket("localhost", 10000);

			// 메시지를 보내기 위해 output사용
			writer = new PrintWriter(socket.getOutputStream());
			String line;

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

	public static void main(String[] args) {

		new SocketClient();

	}

}
