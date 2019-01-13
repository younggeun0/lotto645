package lotto_model;

public class LottoVO {
	
	private int num, ball1, ball2, ball3, ball4, ball5, b_ball;
	private String input_date;
	
	public LottoVO(int num, int ball1, int ball2, int ball3, int ball4, int ball5, int b_ball, String input_date) {
		this.num = num;
		this.ball1 = ball1;
		this.ball2 = ball2;
		this.ball3 = ball3;
		this.ball4 = ball4;
		this.ball5 = ball5;
		this.b_ball = b_ball;
		this.input_date = input_date;
	}

	public int getNum() {
		return num;
	}
	public int getBall1() {
		return ball1;
	}
	public int getBall2() {
		return ball2;
	}
	public int getBall3() {
		return ball3;
	}
	public int getBall4() {
		return ball4;
	}
	public int getBall5() {
		return ball5;
	}
	public int getB_ball() {
		return b_ball;
	}
	public String getInput_date() {
		return input_date;
	}
	@Override
	public String toString() {
		return "LottoVO [num=" + num + ", ball1=" + ball1 + ", ball2=" + ball2 + ", ball3=" + ball3 + ", ball4=" + ball4
				+ ", ball5=" + ball5 + ", b_ball=" + b_ball + ", input_date=" + input_date + "]";
	}
}
