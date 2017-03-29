package com.fdm.games;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class RealSnake extends JPanel implements KeyListener {

	private static char c = 'e';
	private static char prev;
	static Block head = new Block(0, 0);
	static Block tail1 = new Block(-10, -10);
	static Block tail2 = new Block(-10, -10);
	static Block tail3 = new Block(-10, -10);
	static Block tail4 = new Block(-10, -10);
	static Block tail5 = new Block(-10, -10);
	static Block tail6 = new Block(-10, -10);
	static Block tail7 = new Block(-10, -10);
	static Block tail8 = new Block(-10, -10);
	static Block tail9 = new Block(-10, -10);
	static Block tail10 = new Block(-10, -10);
	static Block tail11 = new Block(-10, -10);
	static Block tail12 = new Block(-10, -10);
	static Block tail13 = new Block(-10, -10);
	static Block tail14 = new Block(-10, -10);
	static Block tail15 = new Block(-10, -10);
	static Block tail16 = new Block(-10, -10);
	static Block tail17 = new Block(-10, -10);
	static Block tail18 = new Block(-10, -10);
	static Block tail19 = new Block(-10, -10);
	static Block tail20 = new Block(-10, -10);
	static Block tail21 = new Block(-10, -10);
	static Block tail22 = new Block(-10, -10);
	static Block tail23 = new Block(-10, -10);
	static Block tail24 = new Block(-10, -10);
	static Block tail25 = new Block(-10, -10);
	static Block tail26 = new Block(-10, -10);
	static Block tail27 = new Block(-10, -10);
	static Block tail28 = new Block(-10, -10);
	static Block tail29 = new Block(-10, -10);
	static Block tail30 = new Block(-10, -10);
	static Block tail31 = new Block(-10, -10);
	static Block tail32 = new Block(-10, -10);
	static Block tail33 = new Block(-10, -10);
	static Block tail34 = new Block(-10, -10);
	static Block tail35 = new Block(-10, -10);
	static Block tail36 = new Block(-10, -10);
	static Block tail37 = new Block(-10, -10);
	static Block tail38 = new Block(-10, -10);
	static Block tail39 = new Block(-10, -10);
	static Block tail40 = new Block(-10, -10);
	static Block tail41 = new Block(-10, -10);
	static Block tail42 = new Block(-10, -10);
	static Block tail43 = new Block(-10, -10);
	static Block tail44 = new Block(-10, -10);
	static Block tail45 = new Block(-10, -10);
	static Block tail46 = new Block(-10, -10);
	static Block tail47 = new Block(-10, -10);
	static Block tail48 = new Block(-10, -10);
	static Block tail49 = new Block(-10, -10);
	static Block tail50 = new Block(-10, -10);
	static ArrayList<Block> dump = new ArrayList<Block>();
	static ArrayList<Block> tail = new ArrayList<Block>();
	static Point fruit = new Point(30, 30);
	static Point old = new Point(0, 0);
	static boolean kill = false;
	// private static ArrayList<Block> tail;

	public RealSnake() {
		addKeyListener(this);
		dump.add(tail1);
		dump.add(tail2);
		dump.add(tail3);
		dump.add(tail4);
		dump.add(tail5);
		dump.add(tail6);
		dump.add(tail7);
		dump.add(tail8);
		dump.add(tail9);
		dump.add(tail10);
		dump.add(tail11);
		dump.add(tail12);
		dump.add(tail13);
		dump.add(tail14);
		dump.add(tail15);
		dump.add(tail16);
		dump.add(tail17);
		dump.add(tail18);
		dump.add(tail19);
		dump.add(tail20);
		dump.add(tail21);
		dump.add(tail22);
		dump.add(tail23);
		dump.add(tail24);
		dump.add(tail25);
		dump.add(tail26);
		dump.add(tail27);
		dump.add(tail28);
		dump.add(tail29);
		dump.add(tail30);
		dump.add(tail31);
		dump.add(tail32);
		dump.add(tail33);
		dump.add(tail34);
		dump.add(tail35);
		dump.add(tail36);
		dump.add(tail37);
		dump.add(tail38);
		dump.add(tail39);
		dump.add(tail40);
		dump.add(tail41);
		dump.add(tail42);
		dump.add(tail43);
		dump.add(tail44);
		dump.add(tail45);
		dump.add(tail46);
		dump.add(tail47);
		dump.add(tail48);
		dump.add(tail49);
		dump.add(tail50);
	}

	public void addNotify() {
		super.addNotify();
		requestFocus();
	}

	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.fillRect(head.getX(), head.getY(), 10, 10);
		g2d.fillRect(tail1.getX(), tail1.getY(), 10, 10);
		g2d.fillRect(tail2.getX(), tail2.getY(), 10, 10);
		g2d.fillRect(tail3.getX(), tail3.getY(), 10, 10);
		g2d.fillRect(tail4.getX(), tail4.getY(), 10, 10);
		g2d.fillRect(tail5.getX(), tail5.getY(), 10, 10);
		g2d.fillRect(tail6.getX(), tail6.getY(), 10, 10);
		g2d.fillRect(tail7.getX(), tail7.getY(), 10, 10);
		g2d.fillRect(tail8.getX(), tail8.getY(), 10, 10);
		g2d.fillRect(tail9.getX(), tail9.getY(), 10, 10);
		g2d.fillRect(tail10.getX(), tail10.getY(), 10, 10);
		g2d.fillRect(tail11.getX(), tail11.getY(), 10, 10);
		g2d.fillRect(tail12.getX(), tail12.getY(), 10, 10);
		g2d.fillRect(tail13.getX(), tail13.getY(), 10, 10);
		g2d.fillRect(tail14.getX(), tail14.getY(), 10, 10);
		g2d.fillRect(tail15.getX(), tail15.getY(), 10, 10);
		g2d.fillRect(tail16.getX(), tail16.getY(), 10, 10);
		g2d.fillRect(tail17.getX(), tail17.getY(), 10, 10);
		g2d.fillRect(tail18.getX(), tail18.getY(), 10, 10);
		g2d.fillRect(tail19.getX(), tail19.getY(), 10, 10);
		g2d.fillRect(tail20.getX(), tail20.getY(), 10, 10);
		g2d.fillRect(tail21.getX(), tail21.getY(), 10, 10);
		g2d.fillRect(tail22.getX(), tail22.getY(), 10, 10);
		g2d.fillRect(tail23.getX(), tail23.getY(), 10, 10);
		g2d.fillRect(tail24.getX(), tail24.getY(), 10, 10);
		g2d.fillRect(tail25.getX(), tail25.getY(), 10, 10);
		g2d.fillRect(tail26.getX(), tail26.getY(), 10, 10);
		g2d.fillRect(tail27.getX(), tail27.getY(), 10, 10);
		g2d.fillRect(tail28.getX(), tail28.getY(), 10, 10);
		g2d.fillRect(tail29.getX(), tail29.getY(), 10, 10);
		g2d.fillRect(tail30.getX(), tail30.getY(), 10, 10);
		g2d.fillRect(tail31.getX(), tail31.getY(), 10, 10);
		g2d.fillRect(tail32.getX(), tail32.getY(), 10, 10);
		g2d.fillRect(tail33.getX(), tail33.getY(), 10, 10);
		g2d.fillRect(tail34.getX(), tail34.getY(), 10, 10);
		g2d.fillRect(tail35.getX(), tail35.getY(), 10, 10);
		g2d.fillRect(tail36.getX(), tail36.getY(), 10, 10);
		g2d.fillRect(tail37.getX(), tail37.getY(), 10, 10);
		g2d.fillRect(tail38.getX(), tail38.getY(), 10, 10);
		g2d.fillRect(tail39.getX(), tail39.getY(), 10, 10);
		g2d.fillRect(tail40.getX(), tail40.getY(), 10, 10);
		g2d.fillRect(tail41.getX(), tail41.getY(), 10, 10);
		g2d.fillRect(tail42.getX(), tail42.getY(), 10, 10);
		g2d.fillRect(tail43.getX(), tail43.getY(), 10, 10);
		g2d.fillRect(tail44.getX(), tail44.getY(), 10, 10);
		g2d.fillRect(tail45.getX(), tail45.getY(), 10, 10);
		g2d.fillRect(tail46.getX(), tail46.getY(), 10, 10);
		g2d.fillRect(tail47.getX(), tail47.getY(), 10, 10);
		g2d.fillRect(tail48.getX(), tail48.getY(), 10, 10);
		g2d.fillRect(tail49.getX(), tail49.getY(), 10, 10);
		g2d.fillRect(tail50.getX(), tail50.getY(), 10, 10);
		g2d.drawRect(fruit.x, fruit.y, 10, 10);
	}

	public void keyTyped(KeyEvent e) {
		c = e.getKeyChar();

	}

	public void keyPressed(KeyEvent e) {

	}

	public void keyReleased(KeyEvent e) {

	}

	public void moveSnake(char k) {
		old.x = head.getX();
		old.y = head.getY();
		if (k == 'w') {
			if (prev != 's') {
				head.setY(head.getY() - 10);
				prev = 'w';
			} else {
				head.setY(head.getY() + 10);
			}
		}
		if (k == 'a') {
			if (prev != 'd') {
				head.setX(head.getX() - 10);
				prev = 'a';
			} else {
				head.setX(head.getX() + 10);
			}
		}
		if (k == 's') {
			if (prev != 'w') {
				head.setY(head.getY() + 10);
				prev = 's';
			} else {
				head.setY(head.getY() - 10);
			}
		}
		if (k == 'd') {
			if (prev != 'a') {
				head.setX(head.getX() + 10);
				prev = 'd';
			} else {
				head.setX(head.getX() - 10);
			}
		}
		if (tail.size() >= 1) {
			moveTail(old);
		}

		if (head.getX() == fruit.x && head.getY() == fruit.y) {
			eatFruit();
		}
		
		if (head.getX() > 170 || head.getX() < 0 ||head.getY() > 150 || head.getY() < 0){
			kill = true;
		}
		
		for (Block b : tail){
			if (head.getX() == b.getX() && head.getY() == b.getY()){
				kill = true;
			}
		}
		
	}

	public static void eatFruit() {
		spawnFruit();
		tail.add(dump.get(0));
		dump.remove(0);
		
	}

	public static void spawnFruit() {
		Random rn = new Random();
		boolean validFruit = false;
		int fX = 10*(rn.nextInt(17));
		int fY = 10*(rn.nextInt(15));
		fruit.x = fX;
		fruit.y = fY;
	}

	public static void moveTail(Point p) {
		for (Block b : tail) {
			p = b.move(p);
		}
	}

	public static void play() throws InterruptedException {
		JFrame frame = new JFrame();
		JFrame result = new JFrame();
		RealSnake game = new RealSnake();
		JLabel win = new JLabel("You Win!");
		JLabel loss = new JLabel("You Lose!");
		game.spawnFruit();
		frame.add(game);
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		while (true) {
				if (dump.size() > 0) {
					game.moveSnake(c);
					game.repaint();
					Thread.sleep(100);
				} else {
					frame.dispose();
					result.add(win);
					result.setSize(100,100);
					result.setLocation(50,50);
					result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					result.setVisible(true);				
			}
				if(kill){
					frame.dispose();
					result.add(loss);
					result.setSize(100,100);
					result.setLocation(50,50);
					result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					result.setVisible(true);	
				}
		}
	}
}
