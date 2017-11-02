import java.awt.*;

public class LinesAndShapes extends DrawableAdapter {
	static LinesAndShapes ga = new LinesAndShapes();
	static GameBoard gb = new GameBoard(ga, "Lines and Shapes");
	
	public static void main(String[] args) {
		showGameBoard(gb);
	}
	
	public void draw (Graphics g){
		int x=0;
		int y=4;
		g.setColor(Color.ORANGE);
		g.fillRect(0, 0, 500, 600);
		while(x<600) {
			Color lightorange = new Color(242, 159, y);
			g.setColor(lightorange);
			g.fillRect(0, x, 500, 30);
			y+=10;
			x+=30;
		}
		g.setColor(Color.YELLOW);
		g.fillArc(0,300, 500, 475, 0, 180);
		g.setColor(Color.pink);
		Font myFont = new Font("Noteworthy",Font.PLAIN, 50);
		g.setFont(myFont);
		g.drawString("SET Designs", 125, 400);
		g.setColor(Color.white);
		g.fillOval(380, 90, 100, 75);
		g.fillOval(370, 130, 100, 75);
		g.fillOval(350, 110, 100, 75);
		g.fillOval(410, 110, 100, 75);
		
		g.fillOval(410, 110, 100, 75);
	}

}
