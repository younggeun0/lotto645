package toyProjectLotto;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		Lotto lotto = new Lotto();
		
		while(true) {
			
			System.out.print("게임의 수를 선택해주세요.(1~5, 종료는 0)> ");
			try {
				int game = Integer.parseInt(sc.next());
				
				if(game == 0) {
					System.exit(0);
				} else if (game > 0 && game < 6) {
					System.out.println("------------------------------------------------------");
					System.out.printf("  %d 게임 : %d원\n",game,(game*1000));
					System.out.println("------------------------------------------------------");
					for(int i=0; i<game; i++) {
						lotto.printNum(lotto.sortNum(lotto.pickNum()));
					}
				} else {
					System.out.println("**숫자 0~5 중 선택해주세요.(게임 1~5, 종료 0)");
				}				
				
			} catch (NumberFormatException e) {
				System.out.println("**숫자만 입력가능합니다.(게임 1~5, 종료 0)");
			} 
		}
	}
}
