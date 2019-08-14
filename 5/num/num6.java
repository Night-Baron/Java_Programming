import java.util.Scanner;
public class num6{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String s1; char c1, c2; int count=0;
		System.out.print("문자열: ");
		s1 = s.nextLine();
		System.out.print("문자: ");
		c1 = s.next().charAt(0);
		
		for(int i=0;i<s1.length();i++){
			c2 = s1.charAt(i);
			if(c2 == c1){
				System.out.printf("%d 번째 ", i+1);
				count++;
			}
		}

		System.out.printf("\n문자열 \"%s\"에서 문자 \'%c\'는 %d번 검색되었습니다.\n",s1 ,c1, count);

	}
}
