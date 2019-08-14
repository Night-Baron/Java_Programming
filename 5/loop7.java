import java.util.Scanner;
public class loop7{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int num;

		System.out.print("라인 수: ");
		num = s.nextInt();
		for(i = 0;i<num;i++){
			for(int j=0;j<10;j++)
				System.out.print("*");
			System.out.println("");
		}
	}
}
