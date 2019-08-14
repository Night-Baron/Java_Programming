import java.util.Scanner;
public class loop8{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int num, i,j;
		
		System.out.print("라인 수: ");
		num = s.nextInt();
		for(i=0;i<num;i++){
			for(j=0;j<num-1-i;j++)
				System.out.print(" ");
			for(int k=0;k<num-j;k++)
				System.out.print("*");
			System.out.println("");
		}

		System.out.println("좌우 대칭 출력");
		System.out.print("라인 수: ");
		num = s.nextInt();
		for(i=0;i<num;i++){
			for(j=0;j<i+1;j++)
				System.out.print("*");
			for(int k=0;k<num-j;k++)
				System.out.print(" ");
			System.out.println("");
		}

	}
}
