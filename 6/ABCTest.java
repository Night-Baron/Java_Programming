public class ABCTest{
	public static void main(String args[]){
		String temp;
		if(args.length<1){
			System.out.println("[Usage]java ABCTest string1 string2 string3 ...");
			return;
		}

		//args 배열의 길이
		System.out.println(args.length);
		System.out.println(args[0]);

		System.out.println("abcd".compareTo("abcd")); // 0
		System.out.println("abcd".compareTo("abc")); // 1
		System.out.println("ab".compareTo("abc")); // -1

		System.out.println("xyz".compareToIgnoreCase("Xyz"));
		System.out.println("Xyz".compareToIgnoreCase("xyz"));



		for(int i =0;i<args.length-1;i++){
			for(int j=i+1;j<args.length;j++){
				if(args[i].compareToIgnoreCase(args[j])>0){
					temp = args[i];
					args[i] = args[j];
					args[j] = temp;
				}	
			}
		}
		for(int i =0;i<args.length;i++)
			System.out.print(args[i]+" ");
		System.out.println();
	}
}
