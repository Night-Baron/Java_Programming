public class test2{
	public static void main(String args[]){
		int [][] arr = {{1,7,5},{2,3,4}};
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++)
				System.out.printf("%d ", arr[i][j]);
			System.out.println();
		}


		for(int [] x: arr)
			for(int y: x)
				System.out.print("%d ", y);
	}
}
