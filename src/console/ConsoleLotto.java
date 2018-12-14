package console;

public class ConsoleLotto {

	int[] num = new int[45];

	public ConsoleLotto() {
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
	}

	public int[] pickNum() {
		int temp;
		int[] picked = new int[6];
		for (int i = 0; i < num.length; i++) {
			int idx = (int) (Math.random() * 45);
			temp = num[i];
			num[i] = num[idx];
			num[idx] = temp;
		}
		for (int i = 0; i < picked.length; i++) {
			picked[i] = num[i];
		}
		return picked;
	}

	public int[] sortNum(int[] picked) {
		int temp;
		for (int i = 0; i < picked.length - 1; i++) {
			for (int j = i + 1; j < picked.length; j++) {
				if (picked[i] > picked[j]) {
					temp = picked[i];
					picked[i] = picked[j];
					picked[j] = temp;
				}
			}
		}
		return picked;
	}

	public void printNum(int[] picked) {
		int[][] table = new int[7][];
		table[0] = new int[7];
		table[1] = new int[7];
		table[2] = new int[7];
		table[3] = new int[7];
		table[4] = new int[7];
		table[5] = new int[7];
		table[6] = new int[3];

		/*for (int i = 0; i < picked.length; i++) {
			System.out.print(picked[i] + " ");
		}
		System.out.println();*/

		int idx = 1;
		int flag = 0;
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				for (int k = 0; k < 6; k++) {
					if (idx == picked[k]) {
						System.out.print("[бс]\t");
						flag = 1;
						break;
					}
				}
				if (flag != 1) {
					if (idx < 10) {
						System.out.print("[0" + idx + "]\t");
					} else {
						System.out.print("[" + idx + "]\t");
					}
					idx++;
					flag = 0;
				} else {
					idx++;
					flag = 0;
					continue;
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------------");
	}
}
