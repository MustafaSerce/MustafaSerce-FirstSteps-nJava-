package week2java;

public class week2javamethods {

	public static void main(String[] args) {
		
		hello();
		hello("Mustafa","Serçe");
		topla(5,10);
		System.out.println(topla2(5,10));
		System.out.println(zerocontrol(1));
	}
	public static void hello() {
		System.out.println("hello");
	}
	public static void hello(String Name , String Surname) {
		System.out.println("Welcome "+Name+" "+Surname+".");
	}
	public static void topla(int x , int y) {
		System.out.println(x+y);
	}
	public static int topla2(int x, int y ) {
		int toplam = x+y;
		return toplam;
	}
	public static boolean zerocontrol(int x) {
		if(x>0)
			return true;
		return false;
	}

}
