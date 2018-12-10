package toyProjectLotto;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class LottoAwtMain extends Frame {

	public LottoAwtMain() {
		
		super("Lotto");
		
		Label lblLotto = new Label("Lotto!", Label.CENTER);
		lblLotto.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
		Label lblInfo = new Label("���� �� �Է�(0~5) : ");
		TextField tfGame = new TextField(10);
		Button btnExe = new Button("����");
		Button btnExit = new Button("����");
		Panel panelNorth = new Panel();
		Panel panelCenter = new Panel();
		
		panelNorth.add(lblLotto);
		
		setLayout(new GridLayout(2, 1));
		
		add(panelNorth);
		add(panelCenter);

		panelCenter.setLayout(new GridLayout(2, 2));
		panelCenter.add(lblInfo);
		panelCenter.add(tfGame);
		panelCenter.add(btnExe);
		panelCenter.add(btnExit);
		
		setBounds(300, 250, 300, 150);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
	}
	
	public static void main(String[] args) {
		
		new LottoAwtMain();
	}
}
