package study_190318_mk3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class SocketServer {

	ServerSocket serverSocket;
	Vector<SocketThread> vector;

	public SocketServer() {

		try {

			// 서버 소켓 생성 65536번 중에 0~1023(well known point)를 제외한 번호
			serverSocket = new ServerSocket(20000);
			vector = new Vector<SocketThread>();

			// 메인스레드는 소켓을 accept()하고 vector에 담는 역할을 함
			while (true) {

				System.out.println("요청대기");
				Socket socket = serverSocket.accept();
				System.out.println("요청받음");
				SocketThread socketThread = new SocketThread(socket);
				socketThread.start();
				vector.add(socketThread);

			}

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	// 소켓정보 + 타겟(run) + 식별자(ID)
	class SocketThread extends Thread {

		Socket socket;
		String ID;
		BufferedReader reader;
		PrintWriter writer;

		public SocketThread(Socket socket) {

			this.socket = socket;

		}

		@Override
		public void run() {

			try {

				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				writer = new PrintWriter(socket.getOutputStream(), true);

				writer.println("ID를 입력하세요");

				ID = reader.readLine();

				String line;

				while ((line = reader.readLine()) != null) {

					System.out.println("클라이언트로부터 온 메세지 : " + line);

					for (SocketThread socketThread : vector) {

						socketThread.writer.println(line);

					}

				}

			} catch (Exception e) {

				e.printStackTrace();

			}

		}
		
	}

}
