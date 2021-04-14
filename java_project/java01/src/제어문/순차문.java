package 제어문;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		// 입력
		String name = JOptionPane.showInputDialog("이름을 입력하세요");//홍길동
		
		
		
		// 처리
		String result = name + "님 환영합니다.";

		JFrame f = new JFrame();
		f.setSize(300, 300);
		f.setVisible(true);
		
		// 출력
		JOptionPane.showMessageDialog(f, "나는 실행 결과 출력하는 곳 " + result);

	}

}
