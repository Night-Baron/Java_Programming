import java.util.Scanner;
public class num8{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int num;

		System.out.println("직각 삼각형 출력");
		System.out.print("라인수: ");
		num = s.nextInt();
		for(int i=0;i<num;i++){
			for(int j=num-i;j>0;j--)
				System.out.print("*");
		System.out.println("");
		}
		System.out.println("직각 삼각형 역출력");
		for(int i=0;i<num;i++){
			for(int j=0;j<i;j++)
				System.out.print(" ");
			for(int k=0;k<num-i;k++)
				System.out.print("*");
			System.out.println("");
		}
		 
		System.out.println("피라미드 출력");
		System.out.print("라인 수: ");
		num = s.nextInt();
		for(int i =0;i<num;i++){
			for(int j=num-i-2;j>=0;j--)
				System.out.print(" ");
			for(int k=1;k<(i+1)*2;k++)
				System.out.print("*");
			System.out.println("");
		}

		System.out.println("역피라미드 출력");
		for(int i=num;i>0;i--){
			for(int j=0;j<num-i;j++)
				System.out.print(" ");
			for(int k=(i*2)-1;k>0;k--)
				System.out.print("*");
		System.out.println("");
		}
	}
}
