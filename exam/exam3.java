public class exam3{
	public static void main(String args[]){
		int num1=0, num2=0;
		if(args.length != 1){
			System.out.println("Usage: java exam3 문자열");
			return;
		}
		for(int i=0;i<args[0].length();i++){
			if((args[0].charAt(i) >= 'A' && args[0].charAt(i) <= 'Z') || (args[0].charAt(i) >= 'a' && args[0].charAt(i) <= 'z')){
				switch(args[0].charAt(i)){
					case 'A': case 'E': case 'I': case'O': case'U':
					case 'a': case 'e': case 'i': case'o': case'u':
						num1++;
						break;
					default:
						num2++;
				}
			}
		}
		System.out.printf("자음의 개수: %d\n", num2);
		System.out.printf("모음의 개수: %d\n", num1);
	}
}
