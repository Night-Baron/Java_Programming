public class Char_test{
	public static void main(String args[]){
		char c1,
			 c2,
			 c3;
		c1 = 'a';
		System.out.println("c1 : " + c1);
		c2 = '가';
		System.out.println("c2 : " + c2);
		c3 = '\uac00';
		System.out.println("c3 : " + c3);

		char c4=',';
		String s1 = "Hello", s2 = "java";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1+c4+" "+s2);
	}
}
