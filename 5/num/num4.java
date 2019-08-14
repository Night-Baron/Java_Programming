import java.util.Scanner;
public class num4{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int num, result1 = 1,result2;
		System.out.print("n: ");
		num = s.nextInt();

		//factorial argorithm
		for(int i =1;i<num+1;i++)
			result1 *= i;

		result2 = result1;
		for(int j = num; j>1;j--){
			result2 /= j;
		}

		if(result2 != 1)
			System.out.printf("%d!을 구하는 과정에서 overflow 발생\n", num);
		else
			System.out.printf("%d! = %d\n", num, result1);
	}
}

