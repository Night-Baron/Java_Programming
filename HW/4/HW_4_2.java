import java.util.Scanner;
public class HW_4_2{
	public static void main(String args[]){
		int num, sum, cnt;
		Scanner s = new Scanner(System.in);
		sum=0;cnt=0;	
		do{
			System.out.print("정수: ");
			num = s.nextInt();
			if(num % 7 != 0 && num % 2 == 1){
			   sum += num;
			   cnt++;
			}
		}while( num != 1111);
		sum -= 1111;cnt--;
		if(sum ==0)
			System.out.println("평균을 계산할 홀수가 없습니다.");
		else
			System.out.printf("조건을 만족하는 %d개의 홀수들의 평균은 %.2f입니다.\n", cnt, sum/(double)cnt);
	}
}
