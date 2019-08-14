public class HW5_2_2{
	public static void main(String args[]){
		String temp;
		if(args.length < 1){
			System.out.println("[Usage]java HW5_2_2 num1 num2 ...");
			return;
		}
		
		System.out.println("커맨드 라인 인자들 오름차순 정렬: ");
		for(int i=0;i<args.length;i++){
			for(int j=0;j<args.length-i-1;j++){
				if(Integer.parseInt(args[j]) > Integer.parseInt(args[j+1])){
					temp = args[j];
					args[j] = args[j+1];
					args[j+1] = temp;
				}
			}
		}
		
		for(String x: args)
			System.out.print(x + " ");
		System.out.println();
	}
}
