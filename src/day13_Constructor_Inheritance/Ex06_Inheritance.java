package day13_Constructor_Inheritance;
class Calc06{
	public int n = 12345;
	public String s = "부모 문자열";
	private String ss = "private 변수";
	protected String sss = "protected 변수";
	// protected :다른 곳에서 사용은 막겠으나 자식한테는 허용해주겠다.
	public Calc06(String s) {
		System.out.println(s + "부모 생성자");
	}
	public void test() {System.out.println("부모 test 실행"); }
}
class Computer06 extends Calc06{
	public int n = 7777;
	public Computer06(String ss) {
		super(ss);
		System.out.println(ss + ": 자식 생성자");
		super.test(); // 앞에 super가 안붙으면 자식이 실행, 붙으면 부모가 실행
		// test(); 라고 써도 되지만 가독성 때문에 앞에 super또는 this를 붙여준다
		System.out.println("this.n : " + n);
		System.out.println("super.n : " + super.n);
		System.out.println("super.s : " + s);
		//System.out.println("super private ss : " + super.ss);
		System.out.println("super protected sss : " + super.sss);
	}
	public void test() {
		System.out.println("자식 test 실행");
	}
}
public class Ex06_Inheritance {
	public static void main(String[] args) {
		Computer06 com = new Computer06("전달");
	}
}
