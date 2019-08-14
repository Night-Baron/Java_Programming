import java.util.Scanner;
public class exam2{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String str;
		

		System.out.print("문자열:");
		str = s.nextLine();

		
		System.out.println("약어 출력");
		System.out.print(str.charAt(0));
		for(int i=0;i<str.length()-1;i++){
			if(str.charAt(i) == ' '){
				if(str.charAt(i+1) != ' ')
					System.out.print(str.charAt(i+1));
			}
		}
		System.out.println("\n역순 문장 출력");
		for(int i=0;i<str.length();i++)
			System.out.print(str.charAt(str.length()-i-1));
		System.out.println();
	}
}
