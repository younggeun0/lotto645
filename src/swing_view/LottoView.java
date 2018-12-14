package swing_view;

import java.awt.Font;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import swing_evt.LottoEvt;


public class LottoView extends JFrame {

	private JTextField jtfGame;
	private JButton jbExe, jbExit;

	public LottoView() {
		super("Lotto");

		JLabel jlLotto = new JLabel("Lotto!", JLabel.CENTER);
		jlLotto.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
		JLabel jlInfo = new JLabel("게임 수 입력(1~5) : ");
		jtfGame = new JTextField(10);
		jbExe = new JButton("실행");
		jbExit = new JButton("종료");

		setLayout(null);

		jlLotto.setBounds(80, 30, 150, 40);
		add(jlLotto);
		jlInfo.setBounds(30, 130, 150, 25);
		add(jlInfo);

		jtfGame.setBounds(170, 130, 100, 25);
		add(jtfGame);

		jbExe.setBounds(30, 170, 110, 45);
		add(jbExe);

		jbExit.setBounds(160, 170, 110, 45);
		add(jbExit);

		LottoEvt le = new LottoEvt(this);
		jbExe.addActionListener(le);
		jbExit.addActionListener(le);

		setBounds(300, 250, 315, 280);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JTextField getJtfGame() {
		return jtfGame;
	}

	public JButton getJbExe() {
		return jbExe;
	}

	public JButton getJbExit() {
		return jbExit;
	}
}
