package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class fortune_cookie implements ActionListener{
    public void showButton() {
        JFrame frame = new JFrame();
        JButton button = new JButton();
        frame.add(button);
        frame.pack();
        button.addActionListener(this);
        int rand = new Random().nextInt(5);
        if(rand == 0) {
        	System.out.println("You will have long life");
        }
        else if(rand == 1) {
        	System.out.println("You will be rich");
        }
        if(rand == 0) {
        	System.out.println("You will have many friends");
        }
        if(rand == 0) {
        	System.out.println("You will know many different things");
        }
   }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
