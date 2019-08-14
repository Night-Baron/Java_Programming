public class HW5_2_1{
	public static void main(String args[]){
		if(args.length < 1){
			System.out.println("[Usage] java HW5_2_1 num1 num2 ...");
			return;
		}

		System.out.println("커맨드 라인 인자들 중 짝수:");
		for(int i=0;i<args.length;i++){
			if(Integer.parseInt(args[i]) % 2 == 0)
				System.out.print(args[i] + " ");
		}
		System.out.println();
	}
}
