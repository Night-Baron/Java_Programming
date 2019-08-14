import java.util.Scanner;
public class HW4_1{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int num, rslt;

		System.out.print("1보다 큰 정수: ");
		num = s.nextInt();
		while(num < 2){
			System.out.println("[입력오류]1보다 큰 정수를 입력해주세요.");
			System.out.print("1보다 큰 정수: ");
			num = s.nextInt();
		}
		
		System.out.print("1^2 ");
		rslt = 1;
		for(int i =2;i<num+1;i++){
			if(i%2 == 0){
				System.out.printf("-%d^2 ", i);
				rslt -= Math.pow(i,2);
			}else{
				System.out.printf("+%d^2 ", i);
				rslt += Math.pow(i,2);
			}
		}
		System.out.printf("= %d\n", rslt);
	}
}

