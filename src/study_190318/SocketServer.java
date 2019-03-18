package study_190318;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

	ServerSocket serverSocket = null; // ��Ʈ�� ���� ����
	Socket socket = null; // ���������� ä���ϴ� ����
	BufferedReader reader = null; // �д� ��

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

			String line = null;

			// ���� ������
			while ((line = reader.readLine()) != null) {
				System.out.println("Ŭ���̾�Ʈ : " + line);
			}

			// ���α׷� ���� �� �ݺ��� ��������
			reader.close();
			socket.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		new SocketServer();

	}

}
