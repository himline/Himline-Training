

	package TicTacToe;

	import java.awt.Color;
	import java.awt.Graphics;
	
	import javax.swing.JPanel;
	import javax.swing.border.LineBorder;
	

	public class Cell extends JPanel{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private char token= ' ';
		
		public Cell(){
			setBorder(new LineBorder(Color.BLACK,1));
		
		}
	public void setToken(char c){
		token = c;
		repaint();
	}
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		if(token =='X'){
			g.drawLine(10, 10, getWidth()-10, getHeight()-10);
			g.drawLine(getWidth()-10,10,10, getHeight()-10);
		}
		else if (token == 'O'){
			 g.drawOval(10, 10, getWidth()-20, getHeight()-20);
		}
	}
	public char getToken() {
		// TODO Auto-generated method stub
		return 0;
	}
	

	}



