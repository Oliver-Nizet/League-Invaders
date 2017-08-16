import java.awt.Color;

import javax.swing.JFrame;

public class LeagueInvaders {
	static final int WIDTH = 500;
	static final int HEIGHT = 800;
	static final Color ORANGEBRO = new Color(240, 100, 30);
	JFrame frame;
	GamePanel gp;

	public static void main(String[] args) {
		LeagueInvaders li = new LeagueInvaders();
	}

	LeagueInvaders() {
		frame = new JFrame();
		gp = new GamePanel();
		frame.addKeyListener(gp);
		setup();
	}

	void setup() {
		gp.startGame();
		frame.add(gp);
		frame.setVisible(true);
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
