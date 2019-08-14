public class loop6{
	public static void main(String args[]){
		System.out.println("정방향으로 11 ~ 127 출력");
		for(int i = 11;i<128;i+=4){
			System.out.printf("%d\n", i);
		}
		System.out.println("\n역방향으로 11 ~ 127 출력");
		for(int i=127; i>10;i-=4){
			System.out.printf("%d\n", i);
		}
	}
}
