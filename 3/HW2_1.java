import java.util.Scanner;

public class HW2_1{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int num;


		System.out.print("1억 미만의 정수: ");
		num = s.nextInt();
		System.out.print((num/10000 == 0)?"":(num/1000 == 1)?"만 ":(num/10000)+"만 ");
		num = num - (num/10000)*10000;
		System.out.print((num/1000 == 0)?"":(num/1000 == 1)?"천 ":(num/1000)+"천 ");
		num = num - (num/1000)*1000;
		System.out.print((num/100 == 0)?"":(num/100 == 1)?"백 ":(num/100)+"백 ");
		num = num - (num/100)*100;
		System.out.print((num/10 == 0)?"":(num/10 == 1)?"십 ":(num/10)+"십 ");
		num = num - (num/10)*10;
		System.out.print((num/1 == 0)?"":(num/1));
	}
}
