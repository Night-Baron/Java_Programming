import java.util.Scanner;
public class exam5{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int year,month,day,after,tday;

		System.out.print("년도: ");
		year = s.nextInt();
		System.out.print("월: ");
		month = s.nextInt();
		System.out.print("일: ");
		day = s.nextInt();
		System.out.print("며칠 전: ");
		after = s.nextInt();

		tday = 0;
		while(tday!=after){
			tday++;
			day--;
			switch(month){
				case 5: case 7: case 10: case 12:
					if(day == 0){
						month--;
						day = 30;
					}
					break;
				case 3:
					if(day == 0){
						month--;
						if((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0))
							day = 29;
						else 
							day = 28;
					}
					break;
				case 2: case 4: case 6: case 8: case 9: case 11:
					if(day == 0){
						month--;
						day = 31;
					}
					break;
				case 1:
					if(day == 0){
						month = 12;
						year--;
						day = 31;
					}
					break;
			}
		}
		
		System.out.printf("해당날짜로부터 %d일 전의 날짜: %d년 %d월 %d일\n", after, year, month, day);
	}
}
