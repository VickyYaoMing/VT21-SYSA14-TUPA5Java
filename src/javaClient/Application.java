package javaClient;

import java.awt.EventQueue;

public class Application {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaClientGUI gui = new JavaClientGUI();
					Controller controller = new Controller(gui);
					gui.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
