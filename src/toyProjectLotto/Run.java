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
			
			System.out.print("������ ���� �������ּ���.(1~5, ����� 0)> ");
			try {
				int game = Integer.parseInt(sc.next());
				
				switch(game) {
				case 0:
					System.out.println("�����մϴ�..");
					System.exit(0);
				case 1:
					System.out.println("�� ���� 1000��");
					lotto.printNum(lotto.sortNum(lotto.pickNum(lotto.mixNum())), game);
					break;
				case 2:
					System.out.println("�� ���� 2000��");
					break;
				case 3:
					System.out.println("�� ���� 3000��");
					break;
				case 4:
					System.out.println("�� ���� 3000��");
					break;
				case 5:
					System.out.println("�ټ� ���� 5000��");
					break;
				default :
					System.out.println("���� 0~5 �� �������ּ���.(���� 1~5, ���� 0)");
				}
			} catch (NumberFormatException e) {
				System.out.println("���� 0~5 �� �������ּ���.(���� 1~5, ���� 0)");
			} 
		}
	}
}
