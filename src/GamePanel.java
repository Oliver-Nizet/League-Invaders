import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer timer;
	GameObject go;
	GamePanel() {
		go = new GameObject();
		timer = new Timer(1000 / 60, this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		go.update();
	}

	void startGame() {
		timer.start();
	}

	public void paintComponent(Graphics g) {
		go.draw(g);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("l");

	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("o");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("l");

	}

}
