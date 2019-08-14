public class HW5_2_2{
	public static void main(String args[]){
		int temp;
		int [] ary = new int[args.length];
		if(args.length < 1){
			System.out.println("[사용법]java HW5_2_2 정수1 정수2 ...");
			return;
		}
		
		for(int i=0;i<args.length;i++)
			ary[i] = Integer.parseInt(args[i]);

		for(int i=0;i<ary.length;i++){
			for(int j=0;j<ary.length-i-1;j++){
				if(ary[j] > ary[j+1]){
					temp = ary[j];
					ary[j] = ary[j+1];
					ary[j+1] = temp;
				}
			}
		}
		System.out.println("커맨드 라인 인자들 오름차순 정렬:");
		for(int x: ary)
			System.out.print(x + " ");
		System.out.println("");
	}
}
