
import java.awt.*;

public class CreateButton{
	public static void main(String[] args){
		System.out.println("Affichage de mon application");
		Frame f = new Frame();
		f.setBounds(10,10,300,500);
		f.setBackground(Color.red);
		Button b = new Button("Quitter");
		b.setBackground(new Color(120,98,100));
		f.setLayout(new FlowLayout());
		MyActionForQuitter a =new MyActionForQuitter();
		b.addActionListener(a);
		f.add(b);
		f.setVisible(true);
	}
}