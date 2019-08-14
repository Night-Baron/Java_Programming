public class num7{
	public static void main(String args[]){
		double sum;
		if(args.length < 2){
			System.out.println("[Usage] java num7.java String1 String2");
			return;
		}
		sum = Double.parseDouble(args[0]) + Double.parseDouble(args[1]);
		System.out.printf("%.0f\n", sum);
	}
}
