import java.util.Scanner;
public class HW2_2{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int num1, abs;
		
		System.out.print("정수: ");
		num1 = s.nextInt();
		
		if(num1 >> 31 == -1){
			abs = ~num1 +1;
			System.out.printf("\"%d는(은) 음수입니다. 이 수의 절대값은 %d이고,\n", num1, abs);
			System.out.printf("\t절대값을 4로 나눈 몫은 %d이고,", abs/4);
			System.out.printf("\n\t\t나머지는 %d입니다.\"\n", abs%4);
		}else{
			System.out.printf("\"%d는(은) 양수입니다. 이 수의 절대값은 %d이고,\n",num1 , num1);
			System.out.printf("\t절대값을 4로 나눈 몫은 %d이고,", num1/4);
			System.out.printf("\n\t\t나머지는 %d입니다.\"\n", num1%4);
		}
	}
}
