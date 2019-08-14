import java.util.Scanner;
public class HW4_2{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int num, rslt=0, cnt=0;
		
		do{
			System.out.print("정수: ");
			num = s.nextInt();

			if(num % 7 != 0 && num % 2 != 0){
				rslt += num;
				cnt++;
			}
		}while(num != 1111);

		cnt--;
		rslt -= 1111; //보정

		if(cnt == 0)
			System.out.println("평균은 계산할 홀수가 없습니다.");
		else
			System.out.printf("조건을 만족하는 %d개의 홀수들의 평균은 %.2f입니다.\n", cnt, rslt/(double)cnt);
	}
}


