package �迭����;

import java.util.Random;
//�⺻ ������ �Ǿ��ִ� import, ���α׷��Ӱ� �Ƚ���.
import java.lang.*;//String, System, Integer, Double

public class �����Ѱ�ã�� {

	public static void main(String[] args) {
		int[] num = new int[1000];
		//1002���� ����
		//0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,...,0,1000
		//num���� 1000���� ����ִ� �ּҸ� �־��ش�.
		
		Random r = new Random(42);
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000);
		}
		for (int x : num) {
			System.out.print(x + " ");
		}
		System.out.println();

		int[] count = new int[4];
		// ��ü�� �ϳ��� ��� ������ ������ �� üũ�غ���!
		for (int x : num) {
			if (x >= 600) { // 600~999
				count[0]++;
			} else if (x >= 500) { // 500~599
				count[1]++;
			} else if (x >= 400) { // 400~499
				count[2]++;
			} else { // 399~
				count[3]++;
			}
		}

		int start = 600;
		for (int i = 0; i < count.length; i++) {
			System.out.println(start + "�̻� �Ǵ� ������ " + count[i]);
			start -= 100;
		}
	}
}