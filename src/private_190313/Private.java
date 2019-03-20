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

		gameFrame gameframe = new gameFrame(); // ���ӽ��ఴü ����

	}

}

@SuppressWarnings("serial")
class gameFrame extends JFrame implements Runnable, KeyListener {

	// Ű����
	boolean KeyUp = false; // ��
	boolean KeyDown = false; // �Ʒ�
	boolean KeyLeft = false; // ����
	boolean KeyRight = false; // ������
	boolean KeyZ = false; // ����ü �߻�
	boolean KeyX = false; // ��ź

	// ���Ǵ� ���� ����
	int screenWidth; // ��üȭ�� ����ũ��
	int screenHeight; // ��üȭ�� ����ũ��
	int playerx; // �÷��̾��� X��ǥ ��ġ
	int playery; // �÷��̾��� Y��ǥ ��ġ
	int enemyWidht; // ���� ����
	int enemyHeight; // ���� ����
	int missileWidht; // ����ü�� ����
	int missileHeight; // ����ü�� ����
	int backgroundMove = 0; // ���ȭ�� �̵��ӵ�
	int playerSpeed; // �÷��̾� �̵��ӵ�
	int missileSpeed; // ����ü �̵��ӵ�
	int fireSpeed; // ����ü �߻�ӵ�
	int enemySpeed; // �� �̵��ӵ�
	int playerStatus = 0; // �÷��̾��� ����(����, �߻�� ��)
	int gameScore; // ����
	int playerLife; // ���
	int loopCounter; // run()�Լ��� ���� Ƚ���� ����Ͽ� ��ü���� �ൿ �ð� ���� ����

	// �̹��� ������ �޾ƿ� ���� ����
	Image backgroundImg;
	Image backgroundImg2;
	Image UIImg;
	Image[] playerImg;
	Image missileImg;
	Image enemyImg;
	Image enemyMissileImg;
	Image[] explosionImg;

	Missile missile; // �̻��� ��ü Ÿ�� ����
	Enemy enemy; // �� ��ü Ÿ�� ����
	Explosion explosion; // ���� ��� ��ü Ÿ�� ����
	Toolkit toolkit = Toolkit.getDefaultToolkit(); // !!����!! ���� �𸣰���

	ArrayList<Missile> missileList = new ArrayList<>(); // �����Ǵ� �̻��� ��ü�� �����ϱ� ���� ArrayList ����
	ArrayList<Enemy> enemyList = new ArrayList<>(); // �����Ǵ� �� ��ü�� �����ϱ� ���� ArrayList ����
	ArrayList<Explosion> explosionList = new ArrayList<>(); // �����Ǵ� ���ȸ�� ��ü�� �����ϱ� ���� ArrayList ����

	// !!����!! ���� ���۸� ������ �ʿ��� �Լ� ����
	Image buffImage;
	Graphics buffGraphics;

	gameFrame() {

		init(); // init()�Լ� ����
		start(); // start()�Լ� ����

		// JFrame Ŭ������ ����ϰ� �ִ� Frame�� ������ �ִ� setTitle �Լ� ����
		// �˾��Ǵ� �������� ������ ����
		setTitle("Song Dragon Flight 2");

		// java.awt.Image Ŭ������ �����ϴ� ImageObserver �������̽��� Component�� ����ϴ�
		// Container.winowsŬ������ setSize �Լ��� ����
		// �˾��Ǵ� �������� ����,����ũ�⸦ ����
		setSize(screenWidth, screenHeight); // init()�Լ����� ������ ���μ���ũ�� ������ �޾ƿ�

		// !!����!! �������� �����쿡 ǥ�õ� �� ��ġ�� �����ϱ� ���� ���� �ػ� ���� �޾ƿ�
		Dimension screen = toolkit.getScreenSize();

		// �������� ����� ȭ�� ���߾ӿ� ��ġ��Ű�� ���� ��ǥ�� ����
		int fXpos = (int) (screen.getWidth() / 2 - screenWidth / 2);
		int fYpos = (int) (screen.getHeight() / 2 - screenHeight / 2);

		// java.awt.Image Ŭ������ �����ϴ� ImageObserver �������̽��� Component�� ����ϴ�
		// Container.winowsŬ������ setLocation �Լ��� ����
		// �������� ������ ��ǥ�� ȭ�鿡 ��ġ
		setLocation(fXpos, fYpos);

		// java.awt.Image Ŭ������ �����ϴ� ImageObserver �������̽��� Component�� ����ϴ�
		// Container.winowsŬ������ setVisible �Լ��� ����
		// �������� ���� ���̴��� ���ο� true����(false�� �������� ������ ����)
		setVisible(true);

		// JFrame Ŭ������ ����ϰ� �ִ� Frame�� ������ �ִ� setResizable �Լ� ����
		// �������� ũ�� ���濩�ο� false�� ����(true�� â�� ũ�⸦ ���콺�� ���� ����)
		setResizable(false);

	}

	// ���� ����(���� ���ÿ� gameFrame ��ü ���� ��)�� ���ӿ� ����Ǵ� �������� �ʱ�ȭ�ϴ� �Լ�
	public void init() { // gameFrame�Լ����� �����

		// ����� ������ ����
		screenWidth = 1280;
		screenHeight = 1024;
		playerx = 410;
		playery = 900;
		playerSpeed = 10;
		missileSpeed = 11;
		fireSpeed = 5;
		enemySpeed = 7;
		gameScore = 0;
		playerLife = 3;

		// �̹��� �ҷ�����
		backgroundImg = new ImageIcon("C:\\workspace\\Java\\src\\private_190313\\Image\\background.png").getImage();

		UIImg = new ImageIcon("C:\\workspace\\Java\\src\\private_190313\\Image\\UIImage.png").getImage();

		playerImg = new Image[5];

		for (int i = 0; i < playerImg.length; ++i) {

			playerImg[i] = new ImageIcon("C:\\workspace\\Java\\src\\private_190313\\Image\\player" + i + ".png")
					.getImage();

		}

		missileImg = new ImageIcon("C:\\Workspace\\Java\\src\\private_190313\\Image\\missile.png").getImage();

		enemyImg = new ImageIcon("C:\\workspace\\Java\\src\\private_190313\\Image\\enemy.png").getImage();

		enemyMissileImg = new ImageIcon("C:\\Workspace\\Java\\src\\private_190313\\Image\\enemyMissile.png").getImage();

		explosionImg = new Image[3];

		for (int i = 0; i < explosionImg.length; ++i) {

			explosionImg[i] = new ImageIcon("C:\\workspace\\Java\\src\\private_190313\\Image\\explosion" + i + ".png")
					.getImage();

		}

		// �Ҹ� �ҷ�����
		// true�� ���������� ���
		// false�� �ѹ��� ���
		Sound("C:\\Workspace\\Java\\src\\private_190313\\Sound\\backGroundSound.wav", true);

	}

	// ���� ����(���� ���ÿ� gameFrame ��ü ���� ��)�� �������� �����ϴ� �Լ�
	public void start() { // gameFrame�Լ����� �����

		// JFrame Ŭ������ setDefaultCloseOperation�Լ��� ����
		// ������ ���� ����� ���� ��ư�� ������ �� ���α׷��� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Component Ŭ������ addKeyListener �Լ��� ����
		// Ű���� �Է°��� ����
		addKeyListener(this);

		// ���ο� ������ ��ü ����
		Thread thread = new Thread(this);

		// Thread Ŭ������ start() �Լ��� ����
		// start()�Լ��� ���� �����ϸ� �Ʒ� run()�Լ��� ����ϱ� ������
		thread.start();

	}

	// !!�߿�!!
	// implement�� Runnable�� �������ε� �Ǿ��ִ� Thread�� run()�Լ� ���� ����
	// ���α׷��� ����Ǵ� ����
	// gameFrameŬ���� ��ü ���� �� gameFrame()�Լ� ���� �� ������ start()�Լ� ���� �� ������ ������ ����
	// �� ������ run()�Լ� ����
	@Override
	public void run() {

		try {

			// ������ ����Ǳ� ������ ��� �ݺ���
			while (true) {

				// �� �Լ����� ���۽�Ŵ
				playerMoveProcess();
				missileProcess();
				enemyProcess();
				explosionProcess();

				// paint()�Լ��� ������ ������ ȣ�� �� repaint() �� update() �� paint() ������ �Լ��� ȣ��ȴ�
				repaint();
				// �� �ݺ����� �׷����� �ٷ� ����ϸ� �����忡�� ������ �̹������� �׸��� �����ؼ� ������ �κб���
				// ��� �����ֱ� ������ �̹������� �����̱�� �ȴ�
				// �̸� �ذ��ϱ� ���� repaint()�� update()�� ȣ���Ͽ� �̹����� �޸𸮿� ��� ������Ʈ�� ��
				// paint()�Լ��� �޸𸮿� ���������� �׷��� �׷����� �ѹ��� ����Ѵ�
				// (������۸� ����)

				// �����带 ��� �Ͻ�����, (����)/1000�ʸ�ŭ �����ϸ�, 12/1000�ʴ� �� 80���������� ȭ���� �����Ѵ�
				Thread.sleep(12);

				loopCounter++;

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	// !!�߿�!!
	// java.awt.Image Ŭ������ �����ϴ� ImageObserver �������̽��� Component�� ����ϴ�
	// Container.winowsŬ������ paint �Լ��� ����
	// �׷��� ��� �̺�Ʈ�� ó����
	@Override
	public void paint(Graphics graphics) {

		buffImage = createImage(screenWidth, screenHeight); // createImage() : ���۸��� ȭ�� ũ�� ����
		buffGraphics = buffImage.getGraphics(); // ������ �̹����� �׸� �׷��� ��ü�� �����Ѵ�
		update(graphics); // update()�� paint()�� ȣ���ϱ� ������ �ݺ������� �Լ��� ����ȴ�

	}

	// JFrame Ŭ������ update�Լ��� ����
	// paint()�Լ��� ������ ������ ó���� �̹����� ������
	@Override
	public void update(Graphics graphics) {

		// �̹������� �׸��� �Լ�
		drawBackground();
		drawPlayer();
		drawEnemy();
		drawMissile();
		drawExplosion();
		drawUI();
		drawStatusText();

		// ���۸��� ȭ�鿡 �׷��� �̹����� ���� ȭ������ �ű��
		graphics.drawImage(buffImage, 0, 0, this);

	}

	// implement�� KeyListener�� �������ε� �Ǿ��ִ� KeyEventDemo�� keyPressed�� ����
	// Ű���尡 ������ �� �̺�Ʈ ó��
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

	// implement�� KeyListener�� �������ε� �Ǿ��ִ� KeyEventDemo�� keyReleased�� ����
	// Ű���尡 ������ �� �̺�Ʈ ó��
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

	// implement�� KeyListener�� �������ε� �Ǿ��ִ� KeyEventDemo�� keyTyped�� ����
	// Ű���尡 Ÿ���ε� �� �̺�Ʈ ó��(�ʿ���� �κ��̱� ������ �������̵��� ��)
	@Override
	public void keyTyped(KeyEvent event) {

	}

	// �ԷµǴ� Ű�� ���� �÷��̾� ��ü�� ��ǥ ������
	// if���� ������ �޾� ȭ�� ������ �÷��̾� ��ü�� ����� ���ϰ� ����
	public void playerMoveProcess() {

		if (KeyUp == true) {

			if (playery > 30) {

				playery -= playerSpeed;

			}

			playerStatus = 0;

		}

		if (KeyDown == true) {

			if (playery + 65 < screenHeight) {

				playery += playerSpeed;

			}

			playerStatus = 0;

		}

		if (KeyLeft == true) {

			if (playerx > 0) {

				playerx -= playerSpeed;

			}

			playerStatus = 0;

		}

		if (KeyRight == true) {

			if (playerx + 190 < screenWidth) {

				playerx += playerSpeed;

			}

			playerStatus = 0;

		}

	}

	// !!�߿�!!
	// ����ü ����
	public void missileProcess() {

		if (KeyZ == true) { // Z Ű�� �������� ��

			// �÷��̾� ���°� 1��(�߻���)���� ���Ѵ�
			// drawPlayer() �Լ� switch���� ���ǿ� �����Ǵ� ��
			playerStatus = 1;

			// ����ī���� / ������ �߻�ӵ� �������� ������� 0�� �� ����ü�� �߻��Ѵ�
			if ((loopCounter % fireSpeed) == 0) {

				// ���ڰ��� ����� ���ο� Missile ��ü�� ����
				// missileList�� ������ ��ü�� ����
				// ���� �������� ����ü�� �ǾƱ��� ����(0�� �Ʊ��� �̻���, 1�� ���� �̻���)
				missile = new Missile(playerx + 14, playery + 8, 90, missileSpeed, 0);
				missileList.add(missile);
				missile = new Missile(playerx + 22, playery + 4, 90, missileSpeed, 0);
				missileList.add(missile);
				missile = new Missile(playerx + 30, playery, 90, missileSpeed, 0);
				missileList.add(missile);
				missile = new Missile(playerx + 38, playery + 4, 90, missileSpeed, 0);
				missileList.add(missile);
				missile = new Missile(playerx + 46, playery + 8, 90, missileSpeed, 0);
				missileList.add(missile);

				// �ش� �ݺ��� ����(Missile ��ü ������ ����) �� ȿ���� ���
				Sound("C:\\Workspace\\Java\\src\\private_190313\\Fire.wav", false);

			}

		}

		// �̻��� ���翩�� Ȯ��
		for (int i = 0; i < missileList.size(); ++i) {

			// ������ ������ missileList�� ����� ��ü ����
			missile = (Missile) missileList.get(i);

			// missile ��ü�� ���� move()�Լ��� ���� ����� ������ ��ü �̵�
			missile.move();

			// ���� �̵����� �� ȭ���� ����� �ȴٸ� �ش� ��ü�� missileList���� ����
			if (missile.x > screenWidth - 160 || missile.x < -40 || missile.y < 0 || missile.y > screenHeight) {
				missileList.remove(i);
			}

			// crash()�Լ� ȣ��
			//
			if (Crash(playerx, playery, missile.x, missile.y, playerImg[0], missileImg) && missile.who == 1) {

				playerLife--;

				explosion = new Explosion(playerx + playerImg[0].getWidth(null) / 2,
						playery + playerImg[0].getHeight(null) / 2, 0);
				explosionList.add(explosion);
				missileList.remove(i);

			}

			for (int j = 0; j < enemyList.size(); ++j) {

				enemy = (Enemy) enemyList.get(j);

				if (Crash(missile.x, missile.y, enemy.x, enemy.y, missileImg, enemyImg) && missile.who == 0) {

					missileList.remove(i);
					enemy.enemyLife--;
					if (enemy.enemyLife <= 0)
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

			if (Crash(playerx, playery, enemy.x, enemy.y, playerImg[0], enemyImg)) {

				playerLife--;
				enemyList.remove(i);

				gameScore += 10;

				explosion = new Explosion(enemy.x + enemyImg.getWidth(null) / 2,
						enemy.y + playerImg[0].getHeight(null) / 2, 0);

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

	public void drawBackground() {

		buffGraphics.clearRect(0, 0, screenWidth, screenHeight);

		if (backgroundMove < screenHeight) {

			buffGraphics.drawImage(backgroundImg, 0, backgroundMove - screenHeight, this);
			backgroundMove += 2;

		} else {

			buffGraphics.drawImage(backgroundImg, 0, backgroundMove - screenHeight, this);
			backgroundMove = 0;

		}

	}

	public void drawPlayer() {

		switch (playerStatus) {

		case 0:

			if ((loopCounter / 5 % 2) == 0) {
				buffGraphics.drawImage(playerImg[1], playerx, playery, this);

			} else {

				buffGraphics.drawImage(playerImg[2], playerx, playery, this);

			}

			break;

		case 1:

			if ((loopCounter / 5 % 2) == 0) {

				buffGraphics.drawImage(playerImg[3], playerx, playery, this);

			} else {

				buffGraphics.drawImage(playerImg[4], playerx, playery, this);

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

			if (missile.who == 0) {

				buffGraphics.drawImage(missileImg, missile.x, missile.y, this);

			}

			if (missile.who == 1) {

				buffGraphics.drawImage(enemyMissileImg, missile.x, missile.y, this);

			}

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

	public void drawUI() {

		buffGraphics.drawImage(UIImg, 0, 0, this);

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
		int enemyLife = 10;

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

}
