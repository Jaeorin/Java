package study_190318_mk2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketServer {

	ServerSocket serverSocket = null; // ��Ʈ�� ���� ����
	Socket socket = null; // ���������� ä���ϴ� ����
	BufferedReader reader = null; // �д� ��
	PrintWriter writer = null; // ���� ��

	public SocketServer() {

		try {
			serverSocket = new ServerSocket(10000);

			System.out.println("Ŭ���̾�Ʈ�κ��� ���� �����");
			socket = serverSocket.accept();
			// accept() : ��û����, ��û�� ���� ������ ���α׷� �����
			// 18�࿡�� ��û�� �ޱ� ������ �Ʒ� �ڵ� ���� �ȵ�
			System.out.println("��û�� ������");

			// System.in(Ű���� ��û), con.getInputStream()
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			writer = new PrintWriter(socket.getOutputStream());

			// ���� ������
			Thread t1 = new Thread(new WriterThread());
			t1.start();

			String line = null;

			// ���� ������
			while ((line = reader.readLine()) != null) {
				System.out.println("Ŭ���̾�Ʈ�κ��� �� �޼��� : " + line);
			}

			// ���α׷� ���� �� �ݺ��� ��������
			reader.close();
			socket.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	class WriterThread implements Runnable {

		@Override
		public void run() {

			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);

			while (true) {
				String line = scanner.nextLine();
				writer.println(line);
				writer.flush();
			}

		}

	}

	public static void main(String[] args) {

		new SocketServer();

	}

}
