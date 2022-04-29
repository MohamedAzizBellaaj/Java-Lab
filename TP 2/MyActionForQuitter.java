import java.awt.event.*;

public class MyActionForQuitter implements ActionListener{
		public void actionPerformed(ActionEvent e){
		System.out.println("boutton quitter action");
		System.exit(1);
	}

}