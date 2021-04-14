package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 정답맞추기 {

	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(100);//0~99
		//int target = 55;
		int count = 0;
		
		while (true) {
			String data = JOptionPane.showInputDialog("숫자입력");
			int data2 = Integer.parseInt(data);
			count++;
			if (data2 == target) {
				System.out.println("축하드립니다.");
				System.out.println("정답입니다.");
				System.out.println("총 시도횟수는 " + count + "회");
				break;
			}else {
				System.out.println("정답이 아닙니다.");
				if (data2 > target) {
					System.out.println("정답보다 크다.");
				} else {
					System.out.println("정답보다 작다.");
				}
			}
		}

	}

}
