package com.fdm.games;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Pong extends JPanel implements KeyListener{
	private static char c = 's';
	int paddleY = 570;
	int paddleX = 140;
	int ballX = 180;
	int ballY = 550;
	int vSpeed = -2;
	int hSpeed = 3;

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
			vSpeed *= -1;
			System.out.println(hSpeed);
		}
		if (ballY == 550) {
			System.out.println(paddleX + " " + ballX);
			if (ballX >= paddleX-10 && ballX < paddleX + 10) {
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
			} else if (ballX >= paddleX + 70 && ballX < paddleX + 100) {
				vSpeed *= -1;
				hSpeed += 2;
			} 
			
		}
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
		while (true) {
			game.moveBall();
			game.movePaddle(c);
			c = 's';
			game.repaint();
			Thread.sleep(10);
		}
	}

}
