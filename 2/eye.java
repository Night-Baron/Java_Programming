import java.util.Scanner;

public class eye{
	public static void main(String[] args){
		double eyeR, eyeL;
		String name;

		Scanner myScanner = new Scanner(System.in);
	  	System.out.print("오른쪽 시력: ");
		eyeR = myScanner.nextDouble();
		System.out.print("왼쪽 시력: ");
		eyeL = myScanner.nextDouble();

		System.out.print("이름: ");
		name = myScanner.next();

		System.out.println("당신의 이름은: " + name);
		System.out.printf("당신의 이름은: %s\n", name);
		
		System.out.println("평균 시력: " + (eyeR + eyeL)/2);
		System.out.printf("평균 시력: %f\n", (eyeR + eyeL)/2);
	}
}
