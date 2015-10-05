package TicTacToe;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class TicTacToeFrame extends JFrame {

private char whoseTurn = 'X'; 
private Cell [] [] cells = new Cell [3] [3];
JLabel jlblstatus = new JLabel("'X' YOUR TURN TO PLAY");

public TicTacToeFrame(){
	JPanel panel = new JPanel(new GridLayout(3,3,0,0));
	for(int i = 0 ; i < 3 ; i++)
		for(int j = 0 ; j<3 ; j++)
		panel.add(cells[i][j]=new Cell());
	
			panel.setBorder(new LineBorder(Color.RED,1));
			jlblstatus.setBorder(new LineBorder(Color.yellow,1));
			
		add(panel, BorderLayout.CENTER);
		add(jlblstatus, BorderLayout.SOUTH);
}
public boolean isFull(){
	for(int i = 0 ; i < 3 ; i++)
		for(int j = 0 ; j<3 ; j++)
			if(cells[i][j].getToken() == ' ')
				return false;
	return true;
	
}
public boolean isWon(char token){
	for(int i = 0 ; i<3 ; i++)
		if((cells[i][0].getToken() == token)
				&&(cells[i][1].getToken() == token)
				&&(cells[i][2].getToken() == token))
		{
			return true;
		}
	for(int j = 0 ; j<3 ; j++)
		if((cells[0][j].getToken() == token)
				&&(cells[1][j].getToken() == token)
				&&(cells[2][j].getToken() == token)){
			return true;
		}
	
	if((cells[0][0].getToken() == token)
			&&(cells[1][1].getToken() == token)
			&&(cells[2][2].getToken() == token)){
		return true;
	}
	return false;
}
@SuppressWarnings("unused")
private class MouseListener extends MouseAdapter{


	
	public void mouseClicked(MouseEvent e){
		
		if(whoseTurn != ' ')
			setToken(whoseTurn);
		if(isWon(whoseTurn)){
			jlblstatus.setText(whoseTurn+"you won");
			whoseTurn=' ';
		}
		else if(isFull()){
			jlblstatus.setText("tie game");
			whoseTurn=' ';
		}
		else 
			
		whoseTurn=( whoseTurn == 'X') ? 'O' :'X' ;
		jlblstatus.setText(whoseTurn+ "S  Turn");
	}
	
	

	
	
	
	
	
}
public void setToken(char whoseTurn2) {
	
}



}
