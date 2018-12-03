package toyProjectLotto;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		/*Lotto lotto = new Lotto();
		
		for(int i=0; i<5; i++) {
			lotto.printNum(lotto.sortNum(lotto.pickNum(lotto.mixNum())));
			System.out.println();
		}*/
		Scanner sc = new Scanner(System.in); 
		Lotto lotto = new Lotto();
		
		while(true) {
			
			System.out.print("게임의 수를 선택해주세요.(1~5, 종료는 0)> ");
			try {
				int game = Integer.parseInt(sc.next());
				
				switch(game) {
				case 0:
					System.out.println("종료합니다..");
					System.exit(0);
				case 1:
					System.out.println("한 게임 1000원");
					lotto.printNum(lotto.sortNum(lotto.pickNum(lotto.mixNum())), game);
					break;
				case 2:
					System.out.println("두 게임 2000원");
					break;
				case 3:
					System.out.println("세 게임 3000원");
					break;
				case 4:
					System.out.println("네 게임 3000원");
					break;
				case 5:
					System.out.println("다섯 게임 5000원");
					break;
				default :
					System.out.println("숫자 0~5 중 선택해주세요.(게임 1~5, 종료 0)");
				}
			} catch (NumberFormatException e) {
				System.out.println("숫자 0~5 중 선택해주세요.(게임 1~5, 종료 0)");
			} 
		}
	}
}
