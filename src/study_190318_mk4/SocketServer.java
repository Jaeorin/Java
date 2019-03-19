package study_190318_mk4;

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

			// ���� ���� ���� 65536�� �߿� 0~1023(well known port)�� ������ ��ȣ
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
		String id;
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

				id = reader.readLine();

				System.out.println("ID�Էµ�");
				System.out.println(id);

				String line = null;

				while ((line = reader.readLine()) != null) {

					router(line);

				}

			} catch (Exception e) {

				e.printStackTrace();

			}

		}

		public void router(String line) {

			String[] gubun = line.split(":"); // ALL : �ȳ�, MSG : white : �ȳ�

			String protocol = gubun[0];

			if (protocol.equals(ChatProtocol.ALL)) {

				String msg = gubun[1];

				allChat(msg);

			} else if (protocol.equals(ChatProtocol.MSG)) {

				String otherId = gubun[1];
				String msg = gubun[2];

				privateChat(otherId, msg);

			}

		}

		public void allChat(String msg) {

			System.out.println("id : " + msg + "ip : " + socket.getInetAddress());

			for (SocketThread socketThread : vector) {

				socketThread.writer.println(id + " : " + msg);

			}

		}

		public void privateChat(String otherId, String msg) {

			System.out.println("id : " + msg + "ip : " + socket.getInetAddress());

			for (SocketThread socketThread : vector) {

				if (socketThread.id.equals(otherId)) {

					socketThread.writer.println(id + " : " + msg);

				} else {

					writer.println("ID�� ã�� �� �����ϴ�");

				}

			}

		}

		

	}

	public static void main(String[] args) {

		new SocketServer();

	}

}
