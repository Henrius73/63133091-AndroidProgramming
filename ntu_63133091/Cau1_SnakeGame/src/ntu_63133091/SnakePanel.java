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
	public void paintComponent(Graphics graphic) {
        super.paintComponent(graphic);
        draw(graphic);
    }
    public void draw(Graphics graphic) {
        if(game_flag){
            graphic.setColor(Color.yellow);
            graphic.fillOval(foodX, foodY,Game_unit_size,Game_unit_size);
            for(int i=0;i<bodylength;i++){
                if(i==0){
                    graphic.setColor(Color.green);
                    graphic.fillRect(x_snake[i],y_snake[i],Game_unit_size,Game_unit_size);
                }
                else{
                    graphic.setColor(new Color(50,180,0));
                    graphic.fillRect(x_snake[i],y_snake[i],Game_unit_size,Game_unit_size);
                }
            }
           graphic.setColor(Color.blue);
           graphic.setFont(new Font("Ink Free",Font.BOLD,40));
           FontMetrics font_me=getFontMetrics(graphic.getFont());
           graphic.drawString("Score:"+foodEAten,(S_Width-font_me.stringWidth("Score:"+foodEAten))/2,graphic.getFont().getSize());
        }
        else{
            gameOver(graphic);
        }
    }
    public void newfoodPosition() {
        foodX=random.nextInt((int)(S_Width/Game_unit_size))*Game_unit_size;
        foodY=random.nextInt((int)(S_Height/Game_unit_size))*Game_unit_size;
    }
    public class MyKey extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if(dir!='R'){
                        dir='L';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if (dir != 'D') {
                        dir = 'U';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (dir != 'L') {
                        dir = 'R';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if (dir != 'U') {
                        dir = 'D';
                    }
                    break;
                case KeyEvent.VK_R:
                if(!game_flag){
                    foodEAten=0;
                    bodylength=2;
                    dir='R';
                   Arrays.fill(x_snake,0);
                   Arrays.fill(y_snake,0);
                    Game_start();
                }
                break;
            }            
        }
    }
}
