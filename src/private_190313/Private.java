package private_190313;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

public class Private {

	public static void main(String[] args) {

		gameFrame gameframe = new gameFrame();

	}

}

class gameFrame extends JFrame implements KeyListener, Runnable {

	boolean KeyUp = false;
	boolean KeyDown = false;
	boolean KeyLeft = false;
	boolean KeyRight = false;
	boolean KeyZ = false;

	int fWidth;
	int fHeight;
	int x, y;
	int counter;
	int enemyWidht, enemyHeight;
	int missileWidht, missileHeight;

	Image meImg;
	Image missileImg;
	Image enemyImg;

	Image buffImage;
	Graphics buffGraphics;

	Missile missile;
	Enemy enemy;

	Thread thread;

	Toolkit toolkit = Toolkit.getDefaultToolkit();

	ArrayList missileList = new ArrayList();
	ArrayList enemyList = new ArrayList();

	gameFrame() {

		init();
		start();

		setTitle("Test");
		setSize(fWidth, fHeight);

		Dimension screen = toolkit.getScreenSize();

		int fXpos = (int) (screen.getWidth() / 2 - fWidth / 2);
		int fYpos = (int) (screen.getHeight() / 2 - fHeight / 2);

		setLocation(fXpos, fYpos);
		setResizable(false);
		setVisible(true);

	}

	public void init() {

		x = 100;
		y = 100;
		fWidth = 470;
		fHeight = 840;

		meImg = toolkit.getImage("D:\\workspace\\Java\\src\\private_190313\\cat.png");
		missileImg = toolkit.getImage("D:\\workspace\\Java\\src\\private_190313\\missile.png");
		enemyImg = toolkit.getImage("D:\\workspace\\Java\\src\\private_190313\\enemy.png");

		enemyWidht = ImageWidthValue("D:\\workspace\\Java\\src\\private_190313\\enemy.png")
		enemyHeight = ImageWidthValue
		missileWidht
		missileHeight

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
				repaint();
				Thread.sleep(20);

				counter++;
			}
		} catch (Exception e) {

		}
	}

	@Override
	public void paint(Graphics graphics) {

		buffImage = createImage(fWidth, fHeight);
		buffGraphics = buffImage.getGraphics();
		update(graphics);

	}

	public void update(Graphics graphics) {

		drawChar();
		drawEnemy();
		drawMissile();

		graphics.drawImage(buffImage, 0, 0, this);

	}

	public void drawChar() {

		buffGraphics.clearRect(0, 0, fWidth, fHeight);
		buffGraphics.drawImage(meImg, x, y, this);

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
			buffGraphics.drawImage(missileImg, missile.x, missile.y, this);

			missile.move();

			if (missile.y > fHeight) {
				missileList.remove(i);
			}
		}

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

		if (KeyUp == true)
			y -= 10;
		if (KeyDown == true)
			y += 10;
		if (KeyLeft == true)
			x -= 10;
		if (KeyRight == true)
			x += 10;
	}

	public void missileProcess() {

		if (KeyZ) {
			missile = new Missile(x, y);
			missileList.add(missile);

		}

	}

	public void enemyProcess() {

		for (int i = 0; i < enemyList.size(); ++i) {
			enemy = (Enemy) (enemyList.get(i));

			enemy.move();
			if (enemy.y > 900) {
				enemyList.remove(i);
			}
		}

		if (counter % 300 == 0) {
			enemy = new Enemy(25, 50);
			enemyList.add(enemy);
			enemy = new Enemy(115, 50);
			enemyList.add(enemy);
			enemy = new Enemy(205, 50);
			enemyList.add(enemy);
			enemy = new Enemy(295, 50);
			enemyList.add(enemy);
			enemy = new Enemy(385, 50);
			enemyList.add(enemy);
		}

	}

	public int ImageWidthValue(String string) {

		int x = 0;
		try {
			File file = new File(string);
			BufferedImage bufferedimage = ImageIO.read(file);

			x = bufferedimage.getWidth();
		} catch (Exception e) {
		}
		return x;
	}

	public int ImageHeightValue(String string) {

		int y = 0;
		try {
			File file = new File(string);
			BufferedImage bufferedimage = ImageIO.read(file);
			y = bufferedimage.getHeight();
		} catch (Exception e) {
		}
		return y;
	}

}

class Missile {

	int x;
	int y;

	Missile(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void move() {
		y -= 10;
	}

}

class Enemy {

	int x;
	int y;

	Enemy(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void move() {
		y += 3;
	}
}
