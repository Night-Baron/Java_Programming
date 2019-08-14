import java.util.Scanner;
public class HW_4{
	public static void main(String args[]){
		int num, sum=0;
		Scanner s = new Scanner(System.in);
	
		System.out.print("1보다 큰 정수: ");
		num = s.nextInt();
		while(num < 1){
			System.out.println("[입력오류]1보다 큰 정수를 입력해주세요.");
			System.out.print("1보다 큰 정수: ");
			num = s.nextInt();
		}

		System.out.printf("%d^2", 1);
		sum += 1;
		for(int i=2;i<num+1;i++){
			if(i%2==0){
				System.out.printf("-%d^2 ", i);
				sum -= (int)Math.pow((double)i,(double)2);
			}else{
				System.out.printf("+%d^2 ", i);
				sum += (int)Math.pow((double)i,(double)2);
			}
		}
		System.out.printf(" = %d\n", sum);
	}
}
