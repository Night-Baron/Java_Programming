import java.util.Scanner;
public class HW2_2{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int num;


		System.out.print("정수를 입력하세요:");
		num = s.nextInt();
		System.out.print((num >> 31 == 0) ?num + "는(은) 양수입니다. 이 수의 절대값은 37이고,\n"+
				"\t절대값을 4로 나눈 몫은 "+(num>>2)+"이고,\n"+
				"\t\t나머지는 "+(num - ((num>>2)<<2)+"입니다.\n")
				:num+ "는(은) 음수입니다. 이 수의 절대값은 "+(~num+1)+"이고,\n"+
				"\t절대값은 4로 나눈 몫은 "+((~num+1)>>2)+",이고,\n"+
				"\t\t나머지는 "+((~num+1) - (((~num+1)>>2)<<2)+"입니다.\n"));
	}
}	
