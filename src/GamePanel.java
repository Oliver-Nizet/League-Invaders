import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer timer;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Font titleFont;
	Font enterFont;
	Font spaceFont;
	Font endFont;
	Font backspaceFont;

	GamePanel() {
		timer = new Timer(1000 / 60, this);
		titleFont = new Font("Arial",Font.PLAIN,58);
		enterFont = new Font("Arial",Font.PLAIN,40);
		spaceFont = new Font("Arial",Font.PLAIN,30);
		endFont = new Font("Arial",Font.PLAIN,55);
		backspaceFont = new Font("Arial",Font.PLAIN,30);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();
		} else if (currentState == END_STATE) {
			updateEndState();
		}

	}

	void startGame() {
		timer.start();
	}

	public void paintComponent(Graphics g) {
		if (currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);
		} else if (currentState == END_STATE) {
			drawEndState(g);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("l");

	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("o");
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			currentState++;
		}
		if (currentState > END_STATE) {
			currentState = MENU_STATE;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("l");

	}

	void updateMenuState() {

	}

	void updateGameState() {

	}

	void updateEndState() {

	}

	void drawMenuState(Graphics g) {
		g.setColor(LeagueInvaders.ORANGEBRO);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.BLACK);
		g.drawString("League Invaders", 35,100);
		g.setFont(enterFont);
		g.setColor(Color.BLACK);
		g.drawString("Press Enter to Start", 70,175);
		g.setFont(spaceFont);
		g.setColor(Color.BLACK);
		g.drawString("Press Space for Instructions", 60,240);


	}

	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
	}

	void drawEndState(Graphics g) {
		g.setColor(LeagueInvaders.ORANGEBRO);
		g.fillRect(0, 0, LeagueInvaders.WIDTH, LeagueInvaders.HEIGHT);
		g.setFont(endFont);
		g.setColor(Color.BLACK);
		g.drawString("Game Over", 70,175);
		g.setFont(backspaceFont);
		g.setColor(Color.BLACK);
		g.drawString("Press Backspace to Reset", 60,240);

	}
}
