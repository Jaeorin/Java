package study_190318_mk3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient {

	Socket socket;
	BufferedReader reader;
	PrintWriter writer;
	Scanner scanner;

	public SocketClient() {

		try {

			// accept() 호출되고, 스레드 만들어지며, 벡터에 추가됨
			socket = new Socket("localhost", 20000);
			SocketThread socketThread = new SocketThread();
			socketThread.start();

			writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
			scanner = new Scanner(System.in);

			while (true) {

				String line = scanner.nextLine();
				writer.println(line);

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	class SocketThread extends Thread {

		@Override
		public void run() {

			try {

				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String line = null;

				while ((line = reader.readLine()) != null) {

					System.out.println("서버로부터 온 메시지 : " + line);

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
