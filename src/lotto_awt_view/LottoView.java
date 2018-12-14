package lotto_awt_view;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

import lotto_awt_evt.LottoEvt;

public class LottoView extends Frame {

	private TextField tfGame;
	private Button btnExe, btnExit;

	public LottoView() {
		
		super("Lotto");
		
		Label lblLotto = new Label("Lotto!", Label.CENTER);
		lblLotto.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
		Label lblInfo = new Label("게임 수 입력(1~5) : ");
		tfGame = new TextField(10);
		btnExe = new Button("실행");
		btnExit = new Button("종료");
		
		setLayout(null);

		lblLotto.setBounds(80, 70, 150, 40);
		add(lblLotto);
		lblInfo.setBounds(30, 160, 100, 25);
		add(lblInfo);
		
		tfGame.setBounds(170, 160, 100, 25);
		add(tfGame);
		
		btnExe.setBounds(30, 200, 110, 45);
		add(btnExe);
		
		btnExit.setBounds(160, 200, 110, 45);
		add(btnExit);
		
		LottoEvt le = new LottoEvt(this);
		addWindowListener(le);
		btnExe.addActionListener(le);
		btnExit.addActionListener(le);
		
		setBounds(300, 250, 300, 280);
		setVisible(true);
	}
	public TextField getTfGame() {
		return tfGame;
	}
	public Button getBtnExe() {
		return btnExe;
	}
	public Button getBtnExit() {
		return btnExit;
	}
}
