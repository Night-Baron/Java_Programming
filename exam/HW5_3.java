import java.util.Scanner;
public class HW5_3{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String sentence, word;
		int [] var; int cnt=0, cnt2, cnt3=0, index=0;

		System.out.print("문장: ");
		sentence = s.nextLine();
		System.out.print("단어: ");
		word = s.nextLine();
		
		var = new int[sentence.length()];
		for(int i =0;i<sentence.length();i++){
			if(sentence.charAt(i) == ' ')
				index++;
			if(Character.toLowerCase(word.charAt(0)) == Character.toLowerCase(sentence.charAt(i))){
				cnt2 = 0;
				for(int j=0;j<word.length();j++){
					if(Character.toLowerCase(word.charAt(0+j)) == Character.toLowerCase(sentence.charAt(i+j)))
						cnt2++;
				}
				if(cnt2 == word.length())
					var[cnt3++] = index+1;
			}
			
		}
		for(int i=0;i<cnt3;i++)
			System.out.printf("%d번째, ", var[i]);
		if(cnt3 !=0)
			System.out.printf("\b\b 어절에서 \"%s\"가(이) 검색되어, ", word);
	   	System.out.printf("총 %d회 검색되었습니다.\n", cnt3);
	}
}



