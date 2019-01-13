package lotto_view;

import java.awt.Font;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import lotto_controller.LottoViewEvt;
import lotto_model.LottoVO;


@SuppressWarnings("serial")
public class LottoView extends JFrame {

	private JTextField jtfGame;
	private JButton jbExe, jbExit, jbShowNum;
	private JComboBox<String> jcbNum;

	public LottoView(List<LottoVO> list) {
		super("Lotto");

		JLabel jlLotto = new JLabel("Lotto!", JLabel.CENTER);
		jlLotto.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 40));
		JLabel jlInfo = new JLabel("게임 수 입력(1~5) : ");
		jtfGame = new JTextField(10);
		jbExe = new JButton("실행");
		jbExit = new JButton("종료");
		
		jcbNum = new JComboBox<String>();
		
		LottoVO tempVO = null;
		for(int i=0; i<list.size(); i++) {
			tempVO = list.get(i);
			jcbNum.addItem(String.valueOf(tempVO.getNum()));
		}
		
		jbShowNum = new JButton("확인");
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 2));
		panel.setBorder(new TitledBorder("지난회 결과 보기"));
		panel.add(jcbNum); panel.add(jbShowNum);

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

		panel.setBounds(30, 240, 240, 60);
		add(panel);
		
		LottoViewEvt le = new LottoViewEvt(this);
		jbExe.addActionListener(le);
		jbExit.addActionListener(le);
		jbShowNum.addActionListener(le);

		setBounds(300, 250, 305, 350);
		setResizable(false);
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
	public JButton getJbShowNum() {
		return jbShowNum;
	}
	public JComboBox<String> getJcbNum() {
		return jcbNum;
	}
}
