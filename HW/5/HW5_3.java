import java.util.Scanner;
public class HW5_3{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String state1, state2;
		int cnt=1, check=0, cnt2=0;
		int [] index;

		System.out.print("문장: ");
		state1 = s.nextLine();
		System.out.print("검색할 단어: ");
		state2 = s.next();

		index = new int[state1.length()];
		for(int i=0;i<state1.length();i++){
			if(state1.charAt(i) == ' ')
				cnt++;
			if(Character.toLowerCase(state2.charAt(0)) == Character.toLowerCase(state1.charAt(i))){
				for(int j=0;j<state2.length();j++){
					if(Character.toLowerCase(state2.charAt(0+j)) == Character.toLowerCase(state1.charAt(i+j)))
						check++;
				}
				if(check == state2.length()){
					index[cnt2] = cnt;
					cnt2++;
				}
				check =0;
			}
		}
		if(cnt2 == 0)
			System.out.println("총 0회 검색되었습니다.");
		else{
			for(int i=0;i<cnt2-1;i++)
				System.out.printf("%d 번째, ", index[i]);
			for(int i=cnt2-1;i<cnt2;i++)
				System.out.printf("%d 번째 ", index[i]);
			System.out.printf("어절에서 \"%s\"가(이) 검색되어, 총 %d회 검색되었습니다.", state2, cnt2);
		}
		System.out.println();
	}
}
		
