public class Integer_test{
	public static void main(String args[]){
		int a = 14, b = 15, c = 16; // 10진수: 14,15,16과 같이 소스 코드에 쓰여져 있는 값을 상수 또는 리터럴(literal)이라고 함
		int d = 014, e = 015, f = 016; // 8진수: 상수 앞에 0을 붙임
		int g = 0x14, h = 0x15, i = 0x16; // 16진수: 상수 앞에 0x을 붙임
		int j = 0b10010, k = 0b10, l = 0b1111; // 2진수: JDK 7부터 가능

		System.out.println("a = " + a + ", b = " + c + ", c = " + c);
		System.out.printf("a = %d, %#o, %#x\n", a, a, a);
		System.out.printf("a = %1$d, %1$o, %1%#x\n", a);
		System.out.printf("d = " + d + ", e = " + e + ", f = " + f + "\n");
		System.out.printf("g = " + g + ", h = " + h + ", i = " + i + "\n");
		System.out.printf("j = " + j + ", k = " + k + ", l = ", + l + "\n");

		String s = "Hello";
		System.out.printf("\"s\"\n", s);
		System.out.printf("\"%15s\"\n", s); // 오른쪽 정렬
		System.out.printf("\"-15s\"\n", s); // 왼쪽 정렬
		System.out.format("%+15d, %#15o, %#15x\n", a, a, a);
	    System.out.format("%15d, %1$#15o, %1$#15x\n", a);	

//		byte number = 300;
//		System.out.println("number = " + number);
//		int e2 = 018, f2 = 019;
//		System.out.println("e2 = " + e2 + ", f2 = " + f2);		
	}
}
