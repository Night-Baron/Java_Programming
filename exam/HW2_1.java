import java.util.Scanner;
public class HW2_1{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int num1;String rslt;

		System.out.print("1억 미만의 정수: ");
		num1 = s.nextInt();

		rslt = (num1<10000) ? "" :(num1/10000 == 1) ? "만 " :  (num1/10000) + "만 "; num1 -= (num1/10000)*10000;
		System.out.print(rslt);
		rslt = (num1<1000) ? "" :(num1/1000 == 1) ? "천 " : (num1/1000) + "천 "; num1 -= (num1/1000)*1000;
		System.out.print(rslt);
		rslt = (num1<100) ? "" :(num1/100 == 1) ? "백 " : (num1/100) + "백 "; num1 -= (num1/100)*100;
		System.out.print(rslt);	
		rslt = (num1<10) ? "" :(num1/10 == 1) ? "십 " : (num1/10) + "십 "; num1 -= (num1/10)*10;
		System.out.print(rslt);
		rslt = (num1<1) ? "" : num1+"";
		System.out.println(rslt);
	}
}
