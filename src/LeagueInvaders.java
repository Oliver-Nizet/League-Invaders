import javax.swing.*;

public class LeagueInvaders {
	final int width = 500;
	final int height = 800;
	JFrame frame;
	GamePanel gp;

	public static void main(String[] args) {
		LeagueInvaders li = new LeagueInvaders();
	}

	LeagueInvaders() {
		frame = new JFrame();
		gp = new GamePanel();
		setup();
	}

	void setup() {
		gp.startGame();

		frame.add(gp);
		frame.addKeyListener(gp);
		frame.setVisible(true);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
