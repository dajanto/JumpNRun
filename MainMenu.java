import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainMenu {

	JFrame frame;
	GridLayout gridlayout;
	JButton playButton;
	JButton optionsButton;
	JButton exitButton;
	
	Game game;
	
	public MainMenu() {

		setGUIup();
		setListenersUp();
	}
	
	private void setListenersUp() {
		playButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				game = new Game();
				game.setVisible(true);
				frame.dispose();
				
			}
		});
		
		optionsButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO
			}
		});

		exitButton.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	private void setGUIup() {
		
		frame = new JFrame("dajanto JNR Main Menu");
		gridlayout = new GridLayout(3, 1);
		playButton = new JButton("Play");
		optionsButton = new JButton("Options");
		exitButton = new JButton("Exit");
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setBounds(650, 250, 650, 500);
		frame.setLayout(gridlayout);
		frame.add(playButton);
		frame.add(optionsButton);
		frame.add(exitButton);
		
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new MainMenu();
	}
}