package 배열응용;

import java.util.Random;
//기본 셋팅이 되어있는 import, 프로그래머가 안써줌.
import java.lang.*;//String, System, Integer, Double

public class 랜덤한값찾기 {

	public static void main(String[] args) {
		int[] num = new int[1000];
		//1002개가 생김
		//0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,...,0,1000
		//num에는 1000개가 들어있는 주소를 넣어준다.
		
		Random r = new Random(42);
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000);
		}
		for (int x : num) {
			System.out.print(x + " ");
		}
		System.out.println();

		int[] count = new int[4];
		// 전체를 하나씩 모두 꺼내서 일일이 다 체크해본다!
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
			System.out.println(start + "이상 되는 개수는 " + count[i]);
			start -= 100;
		}
	}
}