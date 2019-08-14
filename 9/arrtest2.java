import java.util.*;

public class arrtest2{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int [][] arr1 = new int [3][2];

		initArr(arr1);
		System.out.println();

		System.out.println("배열 성분: ");
		printArr(arr1);
		
		System.out.printf("모든 성분의 합: %d", sumArr(arr1));
		System.out.printf("배열의 열 별 합: ");
		colSumArr(arr1);
		System.out.printf("행 별 합의 최댓값: ");
		rowSumMaxArr(arr1);
		//System.out.printf("배열의 최댓값의 인덱스: (%d,%d)", );
	
		//shuffleArr(arr1);
		//System.out.println("셔플 후 배열의 성분: ");
		//printArr(arr1);
	}

	public static void initArr(int [][] arr){
		Scanner s = new Scanner(System.in);

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.printf("%d행 %d열 성분: ",i+1, j+1);
				arr[i][j] = s.nextInt();
			}
		}	
	}

	public static void printArr(int [][] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++)
				System.out.printf(arr[i][j] + " ");
			System.out.println();
		}
	}

	public static int sumArr(int [][] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++)
				sum += arr[i][j];
		}
		return sum;
	}

	public static void colSumArr(int [][] arr){
		int [] arr2 = new int[arr[0].length];
		for(int j=0;j<arr[0].length;j++){
			for(int i=0;i<arr.length;i++){
				arr2[i] += arr[i][j];
			}
		}
		
		for(int j=0;arr[0].length;j++)
			System.out.printf("%d ", arr2[j]);
	}

	public static void rowSumMaxArr(int [][] arr){
		int [] arr2 = new int[arr.length];

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;i++)
				arr2[i] += arr[i][j];
		}

		for(int i =0;i<arr.length;i++)
			System.out.println(arr2[i]);
	}
	
//	public static int[] indexMaxArr(int [][] arr){
//		return 0;
//	}
	
	public static void shuffleArr(int [][] arr){

	}

}
