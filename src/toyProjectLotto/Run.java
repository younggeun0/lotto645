package toyProjectLotto;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		Lotto lotto = new Lotto();
		
		while(true) {
			
			System.out.print("������ ���� �������ּ���.(1~5, ����� 0)> ");
			try {
				int game = Integer.parseInt(sc.next());
				
				if(game == 0) {
					System.exit(0);
				} else if (game > 0 && game < 6) {
					System.out.println("------------------------------------------------------");
					System.out.printf("  %d ���� : %d��\n",game,(game*1000));
					System.out.println("------------------------------------------------------");
					for(int i=0; i<game; i++) {
						lotto.printNum(lotto.sortNum(lotto.pickNum()));
					}
				} else {
					System.out.println("**���� 0~5 �� �������ּ���.(���� 1~5, ���� 0)");
				}				
				
			} catch (NumberFormatException e) {
				System.out.println("**���ڸ� �Է°����մϴ�.(���� 1~5, ���� 0)");
			} 
		}
	}
}
