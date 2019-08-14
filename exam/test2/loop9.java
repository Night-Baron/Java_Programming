public class loop9{
	public static void main(String args[]){
		String temp;
		if(args.length < 1){
			System.out.println("[Usage] java loop9 단어1 단어2 단어3 ...");
			return;
		}

		for(int i=0;i<args.length;i++){
			for(int j=0;j<args.length-i-1;j++){
				if(args[j].compareToIgnoreCase(args[j+1]) > 0){
					temp = args[j];
					args[j] = args[j+1];
					args[j+1] = temp;
				}
			}
		}
		for(String x: args)
			System.out.println(x);
	}
}
