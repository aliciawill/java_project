package 반복문;

import javax.swing.JOptionPane;

public class 반복문while {

	public static void main(String[] args) {

		int iu = 0;// 변수는 초기화를 시켜주어야 한다.
		int you = 0;
		int park = 0;

		while (true) {
			String data = JOptionPane.showInputDialog("0)아이유, 1)유재석, 2)박명수, 3)종료");
			if (data.equals("3")) {
				System.out.println("투표 시스템을 종료합니다.");
				System.out.println("아이유 : " + iu + "표");
				System.out.println("유재석 : " + you + "표");
				System.out.println("박명수 : " + park + "표");
				break;
			}

			switch (data) {
			case "0":
				System.out.println("아이유 선택하심.");
				iu++; // 증감연산자, iu = iu + 1;
				break;
			case "1":
				System.out.println("유재석 선택하심.");
				you++;
				break;
			case "2":
				System.out.println("박명수 선택하심.");
				park++;
				break;
			default:
				System.out.println("해당 연예인이 없습니다.");
				break;
			}

		}//while문!
		System.out.println("나는 실행이 될까요.");

	}

}
