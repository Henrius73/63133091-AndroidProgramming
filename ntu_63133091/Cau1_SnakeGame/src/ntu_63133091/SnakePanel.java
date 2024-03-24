package ntu_63133091;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Random;

public class SnakePanel extends JPanel implements ActionListener{
	static final int S_Width=600;
    static final int S_Height=600;
    static final int Game_unit_size=50;
    Timer timer;
    Random random;
    int foodEAten;
    int foodX;
    int foodY;
    int bodylength = 2;
    char dir = 'R';
    static final int DELAY = 160;
    boolean game_flag = false;
    static final int G_Size=(S_Width*S_Height)/(Game_unit_size*Game_unit_size);
    final int x_snake[]=new int[G_Size];
    final int y_snake[]=new int[G_Size];
	SnakePanel(){
		this.setPreferredSize(new Dimension(S_Width,S_Height));
		this.setBackground(Color.darkGray);
		this.setFocusable(true);
		this.addKeyListener(new MyKey());
		random = new Random();
		Game_start();
	}
	public void Game_start() {
		newfoodPostion();
		game_flag=true;
		timer = new Timer(DELAY,this);
		timer.start();
	}
	
}
