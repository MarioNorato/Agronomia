package controller;

import javax.swing.JFrame;


import view.MainFrame;

public class App {
	public App() {
		
		mframe = new MainFrame( "Pruebas v0.001" );
	}

public static void main(String[] args) {
		
		App app = getInstance();
		app.run();

	}

private void run() {
	mframe.setBounds(10, 10, 800, 600 );
	mframe.setExtendedState( JFrame.MAXIMIZED_BOTH );
	mframe.setResizable(false);
	mframe.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	mframe.setVisible( true );	
}

public static App getInstance()
{
	if ( instance == null )
	{
		instance = new App();
	}
	
	return instance;
}

private static App instance;
public MainFrame mframe;

}
