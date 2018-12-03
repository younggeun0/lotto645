package toyProjectLotto;

public class Lotto {
	
	int[] num = new int[45];
	
	public Lotto() {
		for(int i=0; i<num.length; i++) {
			num[i] = i+1;
		}
	}
	
	public int[] mixNum() {
		int temp;
		for(int i=0; i<num.length; i++) {
			int idx=(int)(Math.random()*45);
			temp = num[i];
			num[i] = num[idx];
			num[idx] = temp;
		}
		return num;
	}
	
	public int[] pickNum(int[] num) {
		int[] picked = new int[6];
		
		for(int i=0; i<picked.length; i++) {
			// »ÌÀ» ¶§ Áßº¹µÇ°Ô »ÌÀ¸¸é ¾ÈµÊ
			picked[i] = num[(int)(Math.random()*45)];
		}
		
		return picked;
	}
	
	public int[] sortNum(int[] picked) {
		int temp;
		for(int i=0; i<picked.length-1; i++) {
			for(int j=i+1; j<picked.length; j++) {
				if (picked[i] > picked[j]) {
					temp = picked[i];
					picked[i] = picked[j];
					picked[j] = temp;
				}
			}
		}
		return picked;
	}

	public void printNum(int[] picked, int game) {
		switch(game) {
		case 1:
			int[][] table = new int[7][];
			table[0] = new int[7];
			table[1] = new int[7];
			table[2] = new int[7];
			table[3] = new int[7];
			table[4] = new int[7];
			table[5] = new int[7];
			table[6] = new int[3];
			
			for(int i=0; i<table.length; i++) {
				for(int j=0; j<table[i].length; j++) {
					System.out.print("["+table[i][j]+"]"+" ");
				}
				System.out.println();
			}
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		}
		
		for(int i=0; i<picked.length; i++) {
			System.out.print(picked[i]+" ");
		}
		System.out.println();
	}
}






























