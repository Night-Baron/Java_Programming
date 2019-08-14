public class loop6{
	public static void main(String args[]){
		int [] ary = {23, 1, 5, 20, 39}; int temp;

		for(int i =0;i<ary.length;i++){
			for(int j =0;j<ary.length-i-1;j++){
				if(ary[j] > ary[j+1]){
					temp = ary[j];
					ary[j] = ary[j+1];
					ary[j+1] = temp;
				}
			}
		}
		
		for(int x: ary)
			System.out.println(x);
	}
}
