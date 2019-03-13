package private_190313;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class Private {

	public static void main(String[] args) {

		gameFrame gameframe = new gameFrame();
		
	}
	
}


class gameFrame extends JFrame implements KeyListener, Runnable {
	
	int fWidth;
	int fHeight;
	
	int x,y;
	
	boolean KeyUp = false;
	boolean KeyDown = false;
	boolean KeyLeft = false;
	boolean KeyRight = false;
	boolean KeyZ = false;
	
	int counter;
	
	Thread thread;
	
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Image meImg;
	Image missileImg;
	Image enemyImg;
	
	ArrayList missileList = new ArrayList();
	ArrayList enemyList = new ArrayList();
	
	Image buffImage;
	Graphics buffGraphics;
	
	Missile missile;
	Enemy enemy;
	
	gameFrame(){
		
		init();
		start();
		
		setTitle("Test");
		setSize(fWidth, fHeight);
		
		Dimension screen = toolkit.getScreenSize();
		
		int fXpos = (int)(screen.getWidth() / 2 - fWidth / 2);
		int fYpos = (int)(screen.getHeight() / 2 - fHeight / 2);
		
		setLocation(fXpos, fYpos);
		setResizable(false);
		setVisible(true);
		
	}
	
	public void init() {
		
		x = 100;
		y = 100;
		fWidth = 470;
		fHeight = 840;
		
		meImg = toolkit.getImage
				("D:\\workspace\\Java\\src\\private_190313\\cat.png");
		missileImg = toolkit.getImage
				("D:\\workspace\\Java\\src\\private_190313\\missile.png");
		enemyImg = toolkit.getImage
				("D:\\workspace\\Java\\src\\private_190313\\enemy.png");
		
	}
	
	public void start() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addKeyListener(this);
		thread = new Thread(this);
		thread.start();
		
	}
	
	@Override
	public void run() {

		try{
			while(true){
				keyProcess();
				missileProcess();
				enemyProcess();
				repaint();
				Thread.sleep(20);
				
				counter++;
			}
		}catch(Exception e){
				
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
		drawMissile();
		
		graphics.drawImage(buffImage, 0, 0, this);
		
	}
	
	public void drawChar() {
		
		buffGraphics.clearRect(0, 0, fWidth, fHeight);
		buffGraphics.drawImage(meImg, x, y, this);
		
	}
	
	public void drawMissile() {
		
		for(int i = 0; i < missileList.size(); i++) {
			missile = (Missile)(missileList.get(i));
			buffGraphics.drawImage(missileImg, missile.position.x, missile.position.y, this);
			
			missile.move();
			
			if(missile.position.y > fHeight) {
				missileList.remove(i);
			}
		}
		
	}

	@Override
	public void keyPressed(KeyEvent event) {
		
		switch(event.getKeyCode()) {
			case KeyEvent.VK_UP :
				KeyUp = true;
			break;
			case KeyEvent.VK_DOWN :
				KeyDown = true;
			break;
			case KeyEvent.VK_LEFT :
				KeyLeft = true;
			break;
			case KeyEvent.VK_RIGHT :
				KeyRight = true;
			break;
			case KeyEvent.VK_Z :
				KeyZ = true;
			break;
		}
	}
	
	

	@Override
	public void keyReleased(KeyEvent event) {
		
		switch(event.getKeyCode()){
			case KeyEvent.VK_UP :
				KeyUp = false;
			break;
			case KeyEvent.VK_DOWN :
				KeyDown = false;
			break;
			case KeyEvent.VK_LEFT :
				KeyLeft = false;
			break;
			case KeyEvent.VK_RIGHT :
				KeyRight = false;
			break;
			case KeyEvent.VK_Z :
				KeyZ = false;
			break;
		}
	}
	
	@Override
	public void keyTyped(KeyEvent event) {
		
	}
	
	public void keyProcess() {
		
		if(KeyUp == true)  y -= 10;
		if(KeyDown == true) y += 10;
		if(KeyLeft == true)  x -= 10;
		if(KeyRight == true) x += 10;
	}
	
	public void missileProcess() {
		
		if(KeyZ) {
			missile = new Missile(x, y);
			missileList.add(missile);
			
		}

	}
	
	public void enemyProcess(){

		for (int i = 0 ; i < enemyList.size() ; ++i ){
		enemy = (Enemy)(enemyList.get(i));
		
		en.move();
		if(en.x < -200){
			Enemy_List.remove(i);
			}
		}
	
			if ( cnt % 300 == 0 ){
				en = new Enemy(f_width + 100, 100);
				Enemy_List.add(en); 
				en = new Enemy(f_width + 100, 200);
				Enemy_List.add(en);
				en = new Enemy(f_width + 100, 300);
				Enemy_List.add(en);
				en = new Enemy(f_width + 100, 400);
				Enemy_List.add(en);
				en = new Enemy(f_width + 100, 500);
				Enemy_List.add(en);
			}

		}
	
}


class Missile {
	
	Point position;
	
	Missile(int x, int y){
		position = new Point(x, y);
	}
	
	public void move() {
		position.y -= 10;
	}
	
}


class Enemy{
	int x;
	int y;

Enemy(int x, int y){
this.x = x;
this.y = y;
}
public void move(){
x -= 3;
}
}