import java.util.Scanner;
public class exam1{
	public static void main(String args[]){
		System.out.println("초기 비밀 번호:");
		for(int i=0;i<6;i++)
			System.out.print((int)(Math.random()*9.9));
		System.out.println();
	}
}
