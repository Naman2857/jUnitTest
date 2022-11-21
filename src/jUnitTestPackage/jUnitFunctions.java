package jUnitTestPackage;
import java.util.Scanner;
public class jUnitFunctions {
	static void addinteger() {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(a+b);
	}
	static void addstring(){
		Scanner t = new Scanner(System.in);
		String c = t.next();
		String d = t.next();
		System.out.println(c+d);
	}
	public static void main(String[] args) {
//		jUnitFunctions obj = new jUnitFunctions();
//		obj.addinteger();
//		obj.addstring();
		addinteger();
		addstring();
	}
}
