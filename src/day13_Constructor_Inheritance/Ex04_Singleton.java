package day13_Constructor_Inheritance;

import java.util.Calendar;

class Singleton04{
	private static Singleton04 si;
	private Singleton04() {
		System.out.println("기본 생성자 실행");
	}
	public static Singleton04 getInstance() {
		System.out.println("si : " + si);
		if(si == null)
		si = new Singleton04();		
		return si;
	}
}

public class Ex04_Singleton {
	public static void main(String[] args) {
		//Calendar cal = Calendar.getInstance();
		Singleton04 si01 = Singleton04.getInstance();
		System.out.println("si01 : " + si01);
		Singleton04 si02 = Singleton04.getInstance();
		System.out.println("si02 : " + si02);
	}
}
