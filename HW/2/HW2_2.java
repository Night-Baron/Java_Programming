import java.util.Scanner;
public class HW2_2{
	public static void main(String args[]){
		int num, num2;
		Scanner s = new Scanner(System.in);
		System.out.print("정수: ");
		num = s.nextInt();
		num2 = ~num + 1;

		
		System.out.print((num & 0x80000000) == 0 ? num+"는(은) 양수입니다. 이 수의 절대값은 "+num+"이고,\n"+"\t절대값을 4로 나눈 몫은 "+(num>>2)+"이고,\n"+"\t\t나머지는 "+(num&3)+"입니다.\n": num+"는(은) 음수입니다. 이 수의 절대값은 "+num2+"이고,\n"+"\t절대값을 4로 나눈 몫은 "+ (num2>>2)+"이고,\n"+"\t\t나머지는 "+ (num2&3)+"입니다.\n");
	}
}
