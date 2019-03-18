package private_190313;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Private {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		gameFrame gameframe = new gameFrame();

	}

}

@SuppressWarnings("serial")
class gameFrame extends JFrame implements KeyListener, Runnable {

	// 키설정
	boolean KeyUp = false; // 위
	boolean KeyDown = false; // 아래
	boolean KeyLeft = false; // 왼쪽
	boolean KeyRight = false; // 오른쪽
	boolean KeyZ = false; // 투사체 발사
	boolean KeyX = false; // 폭탄

	// 사용되는 변수 선언
	int screenWidth; // 전체화면 가로크기
	int screenHeight; // 전체화면 세로크기
	int playerx; // 플레이어의 X좌표 위치
	int playery; // 플레이어의 Y좌표 위치
	int enemyWidht; // 적의 넓이
	int enemyHeight; // 적의 높이
	int missileWidht; // 투사체의 넓이
	int missileHeight; // 투사체의 높이
	int backgroundMove = 0; // 배경화면 이동속도
	int playerSpeed; // 플레이어 이동속도
	int missileSpeed; // 투사체 이동속도
	int fireSpeed; // 투사체 발사속도
	int enemySpeed; // 적 이동속도
	int playerStatus = 0; // 플레이어의 상태(평상시, 발사시 등)
	int gameScore; // 점수
	int playerLife; // 목숨
	int loopCounter; // run()함수의 무한루프 횟수를 기록, 객체들의 행동 시간 구현
	
	// ※중요, 이중 버퍼링 구현에 필요한 함수 선언
	Image buffImage;
	Graphics buffGraphics;

	// 이미지 파일을 받아올 변수 선언
	Image backgroundImg;
	Image backgroundImg2;
	Image missileImg;
	Image enemyImg;
	Image enemyMissileImg;
	Image[] meImg;
	Image[] explosionImg;

	ArrayList<Missile> missileList = new ArrayList<>();
	ArrayList<Enemy> enemyList = new ArrayList<>();
	ArrayList<Explosion> explosionList = new ArrayList<Explosion>();

	Missile missile;
	Enemy enemy;
	Explosion explosion;

	Thread thread;

	Toolkit toolkit = Toolkit.getDefaultToolkit();

	gameFrame() {

		init();
		start();

		setTitle("Test");
		setSize(screenWidth, screenHeight);

		Dimension screen = toolkit.getScreenSize();

		int fXpos = (int) ((screen.getWidth() / 2 - screenWidth / 2) - 130);
		int fYpos = (int) (screen.getHeight() / 2 - screenHeight / 2);

		setLocation(fXpos, fYpos);
		setResizable(false);
		setVisible(true);

	}

	public void init() {

		playerx = 205;
		playery = 740;
		screenWidth = 1280;
		screenHeight = 1024;
		gameScore = 0;
		playerLife = 3;
		playerSpeed = 10;
		missileSpeed = 11;
		fireSpeed = 15;
		enemySpeed = 7;

		missileImg = new ImageIcon("C:\\Workspace\\Java\\src\\private_190313\\missile.png").getImage();
		enemyMissileImg = new ImageIcon("C:\\Workspace\\Java\\src\\private_190313\\enemyMissile.png").getImage();
		enemyImg = new ImageIcon("C:\\workspace\\Java\\src\\private_190313\\enemy.png").getImage();

		meImg = new Image[5];
		for (int i = 0; i < meImg.length; ++i) {
			meImg[i] = new ImageIcon("C:\\workspace\\Java\\src\\private_190313\\cat" + i + ".png").getImage();
		}

		backgroundImg = new ImageIcon("C:\\workspace\\Java\\src\\private_190313\\background.png").getImage();

		explosionImg = new Image[3];
		for (int i = 0; i < explosionImg.length; ++i) {
			explosionImg[i] = new ImageIcon("C:\\workspace\\Java\\src\\private_190313\\explosion" + i + ".png")
					.getImage();
		}

		Sound("C:\\Workspace\\Java\\src\\private_190313\\backGroundSound.wav", true);

	}

	public void start() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		addKeyListener(this);
		thread = new Thread(this);
		thread.start();

	}

	@Override
	public void run() {

		try {
			while (true) {
				keyProcess();
				missileProcess();
				enemyProcess();
				explosionProcess();
				repaint();
				Thread.sleep(20);

				loopCounter++;
			}
		} catch (Exception e) {

		}
	}

	@Override
	public void paint(Graphics graphics) {

		buffImage = createImage(screenWidth, screenHeight);
		buffGraphics = buffImage.getGraphics();
		update(graphics);

	}

	@Override
	public void update(Graphics graphics) {

		drawBackground();
		drawChar();
		drawEnemy();
		drawMissile();
		drawExplosion();
		drawStatusText();

		graphics.drawImage(buffImage, 0, 0, this);

	}

	public void drawBackground() {

		buffGraphics.clearRect(0, 0, screenWidth, screenHeight);

		if (backgroundMove < screenHeight) {

			buffGraphics.drawImage(backgroundImg, 0, backgroundMove - screenHeight, this);
			backgroundMove += 20;

		} else {
			buffGraphics.drawImage(backgroundImg, 0, backgroundMove - screenHeight, this);
			backgroundMove = 0;
		}

	}

	public void drawChar() {

		switch (playerStatus) {

		case 0:
			if ((loopCounter / 5 % 2) == 0) {
				buffGraphics.drawImage(meImg[1], playerx, playery, this);

			} else {
				buffGraphics.drawImage(meImg[2], playerx, playery, this);
			}

			break;

		case 1:
			if ((loopCounter / 5 % 2) == 0) {
				buffGraphics.drawImage(meImg[3], playerx, playery, this);
			} else {
				buffGraphics.drawImage(meImg[4], playerx, playery, this);
			}

			playerStatus = 0;

			break;

		case 2:
			break;

		}

	}

	public void drawEnemy() {
		for (int i = 0; i < enemyList.size(); ++i) {
			enemy = (Enemy) (enemyList.get(i));
			buffGraphics.drawImage(enemyImg, enemy.x, enemy.y, this);
		}
	}

	public void drawMissile() {

		for (int i = 0; i < missileList.size(); i++) {
			missile = (Missile) (missileList.get(i));
			if (missile.who == 0)
				buffGraphics.drawImage(missileImg, missile.x, missile.y, this);
			if (missile.who == 1)
				buffGraphics.drawImage(enemyMissileImg, missile.x, missile.y, this);

		}
	}

	public void drawExplosion() {

		for (int i = 0; i < explosionList.size(); ++i) {
			explosion = (Explosion) explosionList.get(i);

			if (explosion.imgScroll == 0) {

				if (explosion.imgCounter < 7) {
					buffGraphics.drawImage(explosionImg[0], explosion.x - explosionImg[0].getWidth(null) / 2,
							explosion.y - explosionImg[0].getHeight(null) / 2, this);
				} else if (explosion.imgCounter < 14) {
					buffGraphics.drawImage(explosionImg[1], explosion.x - explosionImg[1].getWidth(null) / 2,
							explosion.y - explosionImg[1].getHeight(null) / 2, this);
				} else if (explosion.imgCounter < 21) {
					buffGraphics.drawImage(explosionImg[2], explosion.x - explosionImg[2].getWidth(null) / 2,
							explosion.y - explosionImg[2].getHeight(null) / 2, this);
				} else if (explosion.imgScroll > 21) {
					explosionList.remove(i);
					explosion.imgScroll = 0;

				}
			} else {
				if (explosion.imgCounter < 7) {
					buffGraphics.drawImage(explosionImg[0], explosion.x + 90, explosion.y + 15, this);
				} else if (explosion.imgScroll < 14) {
					buffGraphics.drawImage(explosionImg[1], explosion.x + 60, explosion.y + 5, this);
				} else if (explosion.imgScroll < 21) {
					buffGraphics.drawImage(explosionImg[0], explosion.x + 5, explosion.y + 10, this);
				} else if (explosion.imgScroll > 21) {
					explosionList.remove(i);
					explosion.imgScroll = 0;
				}
			}
		}
	}

	public void drawStatusText() {

		buffGraphics.setFont(new Font("Defualt", Font.BOLD, 12));
		buffGraphics.drawString("SCORE : " + gameScore, 485, 70);
		buffGraphics.drawString("HitPoint : " + playerLife, 485, 90);
		buffGraphics.drawString("Missile Count : " + missileList.size(), 485, 110);
		buffGraphics.drawString("Enemy Count : " + enemyList.size(), 485, 130);
		buffGraphics.drawString("x : " + playerx, 485, 150);
		buffGraphics.drawString("y : " + playery, 485, 170);
	}

	@Override
	public void keyPressed(KeyEvent event) {

		switch (event.getKeyCode()) {
		case KeyEvent.VK_UP:
			KeyUp = true;
			break;
		case KeyEvent.VK_DOWN:
			KeyDown = true;
			break;
		case KeyEvent.VK_LEFT:
			KeyLeft = true;
			break;
		case KeyEvent.VK_RIGHT:
			KeyRight = true;
			break;
		case KeyEvent.VK_Z:
			KeyZ = true;
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent event) {

		switch (event.getKeyCode()) {
		case KeyEvent.VK_UP:
			KeyUp = false;
			break;
		case KeyEvent.VK_DOWN:
			KeyDown = false;
			break;
		case KeyEvent.VK_LEFT:
			KeyLeft = false;
			break;
		case KeyEvent.VK_RIGHT:
			KeyRight = false;
			break;
		case KeyEvent.VK_Z:
			KeyZ = false;
			break;
		}
	}

	@Override
	public void keyTyped(KeyEvent event) {

	}

	public void keyProcess() {

		if (KeyUp == true) {
			if (playery > 30)
				playery -= playerSpeed;

			playerStatus = 0;
		}

		if (KeyDown == true) {
			if (playery + 65 < screenHeight)
				playery += playerSpeed;

			playerStatus = 0;
		}

		if (KeyLeft == true) {
			if (playerx > 0)
				playerx -= playerSpeed;

			playerStatus = 0;
		}

		if (KeyRight == true) {
			if (playerx + 190 < screenWidth)
				playerx += playerSpeed;

			playerStatus = 0;
		}
	}

	public void missileProcess() {

		if (KeyZ) {
			playerStatus = 1;

			if ((loopCounter % fireSpeed) == 0) {
				missile = new Missile(playerx, playery, 90, missileSpeed, 0);
				missileList.add(missile);
				missile = new Missile(playerx, playery, 80, missileSpeed, 0);
				missileList.add(missile);
				missile = new Missile(playerx, playery, 100, missileSpeed, 0);
				missileList.add(missile);

				Sound("C:\\Workspace\\Java\\src\\private_190313\\Fire.wav", false);

			}

		}

		for (int i = 0; i < missileList.size(); ++i) {
			missile = (Missile) missileList.get(i);
			missile.move();

			if (missile.x > screenWidth - 160 || missile.x < -40 || missile.y < 0 || missile.y > screenHeight) {
				missileList.remove(i);
			}

			if (Crash(playerx, playery, missile.x, missile.y, meImg[0], missileImg) && missile.who == 1) {
				playerLife--;

				explosion = new Explosion(playerx + meImg[0].getWidth(null) / 2, playery + meImg[0].getHeight(null) / 2,
						0);
				explosionList.add(explosion);
				missileList.remove(i);
			}

			for (int j = 0; j < enemyList.size(); ++j) {
				enemy = (Enemy) enemyList.get(j);

				if (Crash(missile.x, missile.y, enemy.x, enemy.y, missileImg, enemyImg) && missile.who == 0) {
					missileList.remove(i);
					enemyList.remove(j);

					gameScore += 10;

					explosion = new Explosion(enemy.x + enemyImg.getWidth(null) / 2,
							enemy.y + enemyImg.getHeight(null) / 2, 0);

					explosionList.add(explosion);
					Sound("C:\\Workspace\\Java\\src\\private_190313\\explosion.wav", false);

				}
			}
		}
	}

	public void enemyProcess() {

		for (int i = 0; i < enemyList.size(); ++i) {
			enemy = (Enemy) (enemyList.get(i));

			enemy.move();
			if (enemy.y > 900) {
				enemyList.remove(i);
			}

			if (loopCounter % 50 == 0) {
				missile = new Missile(enemy.x, enemy.y, 270, missileSpeed, 1);
				missileList.add(missile);

			}

			if (Crash(playerx, playery, enemy.x, enemy.y, meImg[0], enemyImg)) {

				playerLife--;
				enemyList.remove(i);

				gameScore += 10;

				explosion = new Explosion(enemy.x + enemyImg.getWidth(null) / 2, enemy.y + meImg[0].getHeight(null) / 2,
						0);

				explosionList.add(explosion);

				explosion = new Explosion(playerx, playery, 1);

				explosionList.add(explosion);

			}

		}

		if (loopCounter % 200 == 0)

		{
			enemy = new Enemy(25, 50, enemySpeed);
			enemyList.add(enemy);
			enemy = new Enemy(115, 50, enemySpeed);
			enemyList.add(enemy);
			enemy = new Enemy(205, 50, enemySpeed);
			enemyList.add(enemy);
			enemy = new Enemy(295, 50, enemySpeed);
			enemyList.add(enemy);
			enemy = new Enemy(385, 50, enemySpeed);
			enemyList.add(enemy);
		}

	}

	public void explosionProcess() {

		for (int i = 0; i < explosionList.size(); ++i) {
			explosion = (Explosion) explosionList.get(i);
			explosion.effect();

		}

	}

	public boolean Crash(int x1, int y1, int x2, int y2, Image i1, Image i2) {

		boolean check = false;

		if (Math.abs((x1 + i1.getWidth(null) / 2) - (x2 + i2.getWidth(null) / 2)) < (i2.getWidth(null) / 2
				+ i1.getWidth(null) / 2)
				&& Math.abs((y1 + i1.getHeight(null) / 2) - (y2 + i2.getHeight(null) / 2)) < (i2.getHeight(null) / 2
						+ i1.getHeight(null) / 2)) {
			check = true;
		} else {
			check = false;
		}

		return check;
	}

	public void Sound(String file, boolean Loop) {

		Clip clip;

		try {
			AudioInputStream ais = AudioSystem.getAudioInputStream(new BufferedInputStream(new FileInputStream(file)));
			clip = AudioSystem.getClip();
			clip.open(ais);
			clip.start();
			if (Loop)
				clip.loop(-1);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}

class Missile {

	int x;
	int y;
	int missileSpeed;
	int angle;
	int who;

	Missile(int x, int y, int angle, int missileSpeed, int who) {
		this.x = x;
		this.y = y;
		this.who = who;
		this.angle = angle;
		this.missileSpeed = missileSpeed;
	}

	public void move() {
		x -= Math.cos(Math.toRadians(angle)) * missileSpeed;
		y -= Math.sin(Math.toRadians(angle)) * missileSpeed;
	}

}

class Enemy {

	int x;
	int y;
	int enemySpeed;

	Enemy(int x, int y, int enemySpeed) {
		this.x = x;
		this.y = y;
		this.enemySpeed = enemySpeed;
	}

	public void move() {
		y += 3;
	}

}

class Explosion {

	int x;
	int y;
	int imgCounter;
	int imgScroll;

	Explosion(int x, int y, int imgScroll) {
		this.x = x;
		this.y = y;
		this.imgScroll = imgScroll;
		imgCounter = 0;
	}

	public void effect() {
		imgCounter++;
	}

}
