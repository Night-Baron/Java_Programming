import java.util.Scanner;
public class num5{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int num1, num2, temp;

		System.out.print("a: ");
		num1 = s.nextInt();
		System.out.print("b: ");
		num2 = s.nextInt();
		
		if(num1 > num2){
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		for(int i = num1; i < num2 + 1;i++){
			System.out.printf("%d의 약수: 1", i);
			for(int j = 2; j < i +1; j++){
				if(i % j == 0)
					System.out.printf(", %d", j);
			}
			System.out.println("");
		}
	}
}
