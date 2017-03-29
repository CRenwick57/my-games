
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Pong extends JPanel implements KeyListener {
	private static char c = 's';

	int paddleY = 570;
	int paddleX = 140;
	int paddleX2 = 140;
	int paddleY2 = 70;
	int ballX = 180;
	int ballY = 550;
	int vSpeed = -2;
	int hSpeed = 3;
	int p1Score = 0;
	int p2Score = 0;
	ArrayList<Block> blocks;

	public Pong() {
		addKeyListener(this);
	}

	public void addNotify() {
		super.addNotify();
		requestFocus();
	}

	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.fillRect(paddleX, paddleY, 100, 30);
		g2d.fillOval(ballX, ballY, 20, 20);
		g2d.fillRect(paddleX2, paddleY2, 100, 30);
		// for (Block b : blocks){
		// g2d.fillRect(b.getX(), b.getY(), 20, 20);
		// }
	}

	public void movePaddle(char k) {
		if (k == 'a') {
			paddleX -= 12;
			k = 's';
		}

		if (k == 'd') {
			paddleX += 12;
			k = 's';
		}

		if (paddleX < 0) {
			paddleX = 0;
		}

		if (paddleX >= 290) {
			paddleX = 285;
		}

	}

	public void movePaddle2(char k) {
		if (k == 'j') {
			paddleX2 -= 12;
			k = 's';
		}

		if (k == 'l') {
			paddleX2 += 12;
			k = 's';
		}

		if (paddleX2 < 0) {
			paddleX2 = 0;
		}

		if (paddleX2 >= 290) {
			paddleX2 = 285;
		}

	}

	public void moveBall() {
		ballX += hSpeed;
		ballY += vSpeed;
		if (ballX >= 368) {
			hSpeed *= -1;
		}
		if (ballX <= 0) {
			hSpeed *= -1;
		}
		if (ballY <= 0) {
			ballY = 250;
			Random rn = new Random();
			hSpeed = rn.nextInt(4) - 2;
			vSpeed *= -1;
			p2Score++;
			 System.out.println(p1Score+" : "+p2Score);
			// System.out.println(hSpeed);
		} else if (ballY >= 650) {
			ballY = 250;
			Random rn = new Random();
			hSpeed = rn.nextInt(4) - 2;
			vSpeed *= -1;
			p1Score++;
			 System.out.println(p1Score+" : "+p2Score);
			 
			// makeBlock();
			// System.out.println(hSpeed);
		} else if (ballY == 90) {
//			System.out.println(paddleX + " " + ballX);
			checkPaddle2();
		} else if (ballY == 550) {
//			System.out.println(paddleX + " " + ballX);
			checkPaddle();
		}
	}

	public void checkPaddle() {
		if (ballX >= paddleX - 10 && ballX < paddleX + 10) {
			vSpeed *= -1;
			hSpeed -= 2;
		} else if (ballX >= paddleX + 10 && ballX < paddleX + 30) {
			vSpeed *= -1;
			hSpeed -= 1;
		} else if (ballX >= paddleX + 30 && ballX < paddleX + 50) {
			vSpeed *= -1;
		} else if (ballX >= paddleX + 50 && ballX < paddleX + 70) {
			vSpeed *= -1;
			hSpeed += 1;
		} else if (ballX >= paddleX + 70 && ballX <= paddleX + 100) {
			vSpeed *= -1;
			hSpeed += 2;
		}
	}

	public void checkPaddle2() {
		if (ballX >= paddleX2 - 10 && ballX < paddleX2 + 10) {
			vSpeed *= -1;
			hSpeed -= 2;
		} else if (ballX >= paddleX2 + 10 && ballX < paddleX2 + 30) {
			vSpeed *= -1;
			hSpeed -= 1;
		} else if (ballX >= paddleX2 + 30 && ballX < paddleX2 + 50) {
			vSpeed *= -1;
		} else if (ballX >= paddleX2 + 50 && ballX < paddleX2 + 70) {
			vSpeed *= -1;
			hSpeed += 1;
		} else if (ballX >= paddleX2 + 70 && ballX <= paddleX2 + 100) {
			vSpeed *= -1;
			hSpeed += 2;
		}
	}

	public void makeBlock() {
		// Random rn = new Random();
		// int blockX = 10*(rn.nextInt(36)+1);
		// int blockY = 10*(rn.nextInt(40)+1);
		Block block = new Block(20, 30);
		blocks.add(block);
	}

	public void keyTyped(KeyEvent e) {
		c = e.getKeyChar();

	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public static void playPong() throws InterruptedException {
		JFrame frame = new JFrame("cool game frame B^)");
		Pong game = new Pong();
		frame.add(game);
		frame.setSize(400, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		Random rn = new Random();
		game.hSpeed = rn.nextInt(4) - 2;
		while (true) {
			game.moveBall();
			game.movePaddle(c);
			game.movePaddle2(c);
			c = 's';
			game.repaint();
			Thread.sleep(10);
		}
	}

}
