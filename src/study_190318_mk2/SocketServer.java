package study_190318_mk2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketServer {

	ServerSocket serverSocket = null; // 스트림 연결 소켓
	Socket socket = null; // 실질적으로 채팅하는 소켓
	BufferedReader reader = null; // 읽는 것
	PrintWriter writer = null; // 쓰는 것

	public SocketServer() {

		try {
			serverSocket = new ServerSocket(10000);

			System.out.println("클라이언트로부터 접속 대기중");
			socket = serverSocket.accept();
			// accept() : 요청감지, 요청을 받을 때까지 프로그램 대기중
			// 18행에서 요청을 받기 전까지 아래 코드 실행 안됨
			System.out.println("요청이 성공함");

			// System.in(키보드 요청), con.getInputStream()
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			writer = new PrintWriter(socket.getOutputStream());

			// 쓰는 스레드
			Thread t1 = new Thread(new WriterThread());
			t1.start();

			String line = null;

			// 메인 스레드
			while ((line = reader.readLine()) != null) {
				System.out.println("클라이언트로부터 온 메세지 : " + line);
			}

			// 프로그램 종료 시 반복문 빠져나옴
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
