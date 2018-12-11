package toyProjectLotto;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class LottoMain extends Frame {

	TextField tfGame;
	
	public LottoMain() {
		
		super("Lotto");
		
		Label lblLotto = new Label("Lotto!", Label.CENTER);
		lblLotto.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
		Label lblInfo = new Label("게임 수 입력(0~5) : ");
		tfGame = new TextField(10);
		Button btnExe = new Button("실행");
		Button btnExit = new Button("종료");
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
		
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
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
		
		new LottoMain();
	}
}
