class test1{
	public static void main(String args[]){
		sum(1,2);
		sum(1,2,3);
		sum(1,2,3,1,2,3);
	}
	static void sum(int ... nbrs){
		int sum =0;
		for(int x: nbrs)
			sum += x;
		System.out.println("인자들의 합: " + sum);
	}
}
