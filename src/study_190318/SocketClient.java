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

			// ������ accepe() ȣ���ϱ�
			// IP, �缳IP, localhost
			socket = new Socket("localhost", 10000);

			// �޽����� ������ ���� output���
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
