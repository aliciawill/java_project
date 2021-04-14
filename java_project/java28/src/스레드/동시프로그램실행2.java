package 스레드;

public class 동시프로그램실행2 {

	public static void main(String[] args) {
		앤드스레드 and = new 앤드스레드();
		엣스레드 at = new 엣스레드();
		달러스레드 doll = new 달러스레드();
		
		//cpu한테 스레드 2개 만든 것  스레드등록
		and.start();
		at.start();
		doll.start();
		
	}

}
