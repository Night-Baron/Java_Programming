import java.util.Scanner;

public class test1{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n;
		System.out.print("정수 n: ");
		n = s.nextInt();
		if(n >= 100){
			System.out.println("large");
		}else{
			System.out.println("small");
		}
	}
}
