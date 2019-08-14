import java.util.Scanner;
public class num2{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int num;

		System.out.print("몇 단: ");
		num = s.nextInt();
		for(int i=0;i<9;i++)
			System.out.printf("%d X %d = %d\n", num, (i+1), num*(i+1));
	}
}
