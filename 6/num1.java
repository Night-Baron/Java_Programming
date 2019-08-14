import java.util.Scanner;
public class num1{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int a;
		int [] b = new int[100];
		double [] c = new double[5];
		String [] d = new String[10];

		int [] e = {5, 7, 3, 1, 10};
		
		System.out.println("배열 e의 첫번째 성분:" + e[0]);
		System.out.println("배열 e의 길이(성분 개수): " + e.length);

		for(int i=0;i<e.length;i++)
			System.out.println(e[i]);
		


		//for-each:배열 성분 출력할때만 사용하기
		for(int x:e)
			System.out.println(x);

	}
}
