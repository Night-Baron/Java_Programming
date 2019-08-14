class printnum{
	public static void main(String args[]) throws Exception{
		print(1, 10);
		System.out.println();
	}
	
	static void print(int num1, int num2)throws Exception{
		for(int i=num1; i<num2+1;i++){
			System.out.print(i+" ");
			Thread.sleep(1000);
		}
	}
}
