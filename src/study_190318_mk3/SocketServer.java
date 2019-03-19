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

			// ���� ���� ���� 65536�� �߿� 0~1023(well known point)�� ������ ��ȣ
			serverSocket = new ServerSocket(20000);
			vector = new Vector<SocketThread>();

			// ���ν������ ������ accept()�ϰ� vector�� ��� ������ ��
			while (true) {

				System.out.println("��û���");
				Socket socket = serverSocket.accept();
				System.out.println("��û����");
				SocketThread socketThread = new SocketThread(socket);
				socketThread.start();
				vector.add(socketThread);

			}

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	// �������� + Ÿ��(run) + �ĺ���(ID)
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

				writer.println("ID�� �Է��ϼ���");

				ID = reader.readLine();

				String line;

				while ((line = reader.readLine()) != null) {

					System.out.println("Ŭ���̾�Ʈ�κ��� �� �޼��� : " + line);

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
