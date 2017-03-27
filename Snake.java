package com.fdm.games;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Snake extends JPanel implements KeyListener {
	private static char c = 'e';
	static int x = 0;
	static int y = 0;
	static int tX;
	static int tY;
	static char lastMove = 'e';
	String validMoves = "wasd";
	static int score = 0;
	static int hiScore = 0;
	char tLastMove = 's';
	int tScore = 0;
	int startSpeed = 2;
	
	public Snake() {
		addKeyListener(this);
	}

	public void addNotify() {
		super.addNotify();
		requestFocus();
	}

	private void moveBall(char k) {
		
		
		
		String kk = String.valueOf(k);
		if (validMoves.contains(kk)) {
			lastMove = k;
		}
		if (lastMove == 'w') {
			y -= startSpeed;
			lastMove = 'w';
		}

		if (lastMove == 'a') {
			x -=startSpeed;
			lastMove = 'a';
		}

		if (lastMove == 's') {
			y +=startSpeed;
			lastMove = 's';
		}

		if (lastMove == 'd') {
			x +=startSpeed;
			lastMove = 'd';
		}

		if (y < 0)

		{
			y = 0;
			score = 0;
		}

		if (x < 0)

		{
			x = 0;
			score = 0;
		}

		if (x > 676)

		{
			x = 676;
			score = 0;
		}

		if (y > 416)

		{
			y = 416;
			score = 0;
		}

	}
	
	private void moveBallFast(char k) {

		String kk = String.valueOf(k);
		if (validMoves.contains(kk)) {
			lastMove = k;
		}
		if (lastMove == 'w') {
			y -= score + 1;
		}

		if (lastMove == 'a') {
			x -= score + 1;
		}

		if (lastMove == 's') {
			y += score + 1;
		}

		if (lastMove == 'd') {
			x += score + 1;
		}

		if (y < 0)

		{
			y = 0;
			score = 0;
			startSpeed = 1;
		}

		if (x < 0)

		{
			x = 0;
			score = 0;
			startSpeed = 1;
		}

		if (x > 676)

		{
			x = 676;
			score = 0;
			startSpeed = 1;
		}

		if (y > 416)

		{
			y = 416;
			score = 0;
			startSpeed = 1;
		}

	}

	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.fillOval(x, y, 30, 30);
		g2d.fillOval(tX, tY, 20, 20);
		}

	public void spawnTarget() {
		Random rn = new Random();
		tX = rn.nextInt(684) + 1;
		tY = rn.nextInt(419) + 1;

	}

	public void checkScore() {
		if (x >= tX - 20 && x <= tX + 20 && y >= tY - 20 && y <= tY + 20) {
			score++;
			if (score > hiScore) {
				hiScore = score;
			}
			if ((score % 5) == 0){
				startSpeed++;
			}
			System.out.println("Score: " + score + " - High Score: " + hiScore);
			spawnTarget();
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

	private void moveTarget() {
		Random rn = new Random();
		int r = rn.nextInt(256)+1;
		
		if (r == 32 || r == 64) {
			tLastMove = 'w';
		}
		if (r == 96 || r == 128) {
			tLastMove = 'a';
		}
		if (r == 160 ||r == 192) {
			tLastMove = 's';
		}
		if (r == 224 || r == 256) {
			tLastMove = 'd';
		}
		if (tLastMove == 'w') {
			tY -= startSpeed;
			tLastMove = 'w';
		}

		if (tLastMove == 'a') {
			tX -= startSpeed;
			tLastMove = 'a';
		}

		if (tLastMove == 's') {
			tY += startSpeed;
			tLastMove = 's';
		}

		if (tLastMove == 'd') {
			tX += startSpeed;
			tLastMove = 'd';
		}
		if (tY < 0) {
			tY = 416;
		}

		if (tX < 0) {
			tX = 676;
		}

		if (tX > 676) {
			tX = 0;
		}

		if (tY > 416) {
			tY = 0;
		}

	}

	public static void basic() throws InterruptedException {
		JFrame frame = new JFrame("epic frame B^)");
		Snake game = new Snake();
		frame.add(game);
		frame.setSize(720, 480);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.spawnTarget();
		// JButton kill = new JButton("Game Over!");
		// kill.addActionListener(l);
		while (true) {
			game.moveBallFast(c);
			game.checkScore();
			game.repaint();
			Thread.sleep(10);
		}
	}

	public static void complex() throws InterruptedException {
		JFrame frame = new JFrame("epic frame B^)");
		Snake game = new Snake();
		frame.add(game);
		frame.setSize(720, 480);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.spawnTarget();
		while (true) {
			game.moveBallFast(c);
			game.moveTarget();
			game.checkScore();
			game.repaint();
			Thread.sleep(10);
		}
	}
}
