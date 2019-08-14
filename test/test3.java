import java.util.Scanner;
public class test3{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String s1 = "Hello", s2;
		
		System.out.print("출력: \n");
		s2 = s.nextLine();

		System.out.println(s1.equals(s2));
	}
}
