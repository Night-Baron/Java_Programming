import java.util.*;
class StringManipulate{
	String concat(String s1, String s2){
		return s1 + s2; 
	}
	
	String toUpper(String s){
		String rslt = "";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
				rslt += (char)(s.charAt(i)-32);
		}
		return rslt;
	}

	boolean equals(String s1, String s2){
		int cnt;

		if(s1.length() == s2.length()){
			cnt = 0;
			for(int i =0;i<s1.length();i++){
				if(s1.charAt(i) == s2.charAt(i))
					cnt++;
			}
			if(s1.length() == cnt)
				return true;
			return false;
		}else
			return false;
	}	
}

class hw6_1{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		StringManipulate sm = new StringManipulate();
		String s1, s2;
		
		System.out.print("문장 1: ");
		s1 = s.nextLine();
		System.out.print("문장 2: ");
		s2 = s.nextLine();
		System.out.print("문장 1과 문장 2 연결 결과: ");
		System.out.println(sm.concat(s1,s2));
		System.out.print("문장 1 대문자 변환 결과: ");
		System.out.println(sm.toUpper(s1));
		System.out.print("문장 1과 문장 2의 일치 여부: ");
		System.out.println(sm.equals(s1, s2));

	}
}
