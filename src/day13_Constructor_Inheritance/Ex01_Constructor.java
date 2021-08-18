package day13_Constructor_Inheritance;
class Constructor01{
	public Constructor01(String s) {
		System.out.println(s + " : 생성자 실행");
	}
	public Constructor01() {
		System.out.println( "default 생성자 실행");
	}
	public void test(String s) {
		System.out.println(s + " : test 실행");
	}
	public void test() {
		System.out.println("기본 테스트");
	}
}
public class Ex01_Constructor {
	public static void main(String[] args) {
		
		/*
		 생성자 사용
		 - 보통 초기화 하고자 할때 사용한다.
		 - 객체가 생성될때 자동으로 호출된다.
		 생성자 만드는 방법
		 - 클래스 이름과 동일하게 만든다.
		 - 반환 타입은 없어야 된다.		 
		 */
		Constructor01 con = new Constructor01("생성자");
		Constructor01 con1 = new Constructor01();
		con.test("테스트");
		con.test();
	}
}
