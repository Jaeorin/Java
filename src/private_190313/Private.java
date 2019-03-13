package private_190313;

import javax.swing.*;
import java.awt.*;


public class Private {

	public static void main(String[] args) {

		FrameMakeSub fms = new FrameMakeSub();
		
		
	}
}


class FrameMakeSub extends JFrame {
	
	int fWidth = 800;
	int fHeight = 600;
	
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Image cat = toolkit.getImage("cat.png");
	
	
	FrameMakeSub(){
		
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
		
	}
	
	public void start() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void paint (Graphics graphics) {
		
		graphics.clearRect(0, 0, fWidth, fHeight);
		graphics.drawImage(cat, 100, 100, this);
		
	}
	
}
