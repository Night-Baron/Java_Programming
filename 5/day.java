import java.util.Scanner;
public class day{
	public static void main(String args[]){
		int year=0, month=0, day=0;
		int ck1, ck2;
		Scanner s = new Scanner(System.in);

		System.out.print("몇 년: ");
		year = s.nextInt();
		System.out.print("몇 월: ");
		month = s.nextInt();

		ck1 = ((year / 4 == 0) && (year /100 != 0) ? 1:0);
		ck2 = (year / 400 == 0 ? 1 : 0);
		
		switch(month){
			case 1:case 3:case 5:case 7:case 8:case 10:case 12:
				day = 31;
				break;
			case 4:case 6:case 9:case 11:
				day = 30;
				break;
			case 2:
				if(ck1 + ck2 > 0)
					day = 29; 
				else
					day = 28;	
				break;
			default:
				System.out.println("[입력오류]잘못된 월을 입력하셨습니다.");
				System.exit(1);//return;
		}
		if(month <12 && month>0)
			System.out.printf("%d년 %d월은 %d일까지 있습니다.\n", year, month, day);
	}
}
