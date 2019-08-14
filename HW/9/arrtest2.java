import java.util.*;
public class arrtest2{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int [][] arr1 = new int [3][2];

		initArr(arr1);
		System.out.println("배열 성분:");
		printArr(arr1);
		System.out.println();

		System.out.printf("모든 성분의 합: %d\n", sumArr(arr1));
		System.out.print("배열의 열 별 합: ");
		colSumArr(arr1);
		System.out.println();

		shuffleArr(arr1);
		System.out.println("셔플 후 배열 성분:");
		printArr(arr1);
	}

	public static void initArr(int [][] arr){
		Scanner s = new Scanner(System.in);

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.printf("%d행 %d열 성분: ", i+1, j+1);
				arr[i][j] = s.nextInt();
			}
		}
	}
	public static void printArr(int [][] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++)
				System.out.printf("%d ", arr[i][j]);
			System.out.println();
		}
		System.out.println();
	}
	public static int sumArr(int [][] arr){
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++)
				sum += arr[i][j];
		}
		return sum;
	}
	public static void colSumArr(int [][] arr){
		int [] colsum = new int [arr[0].length];
		for(int j=0;j<arr[0].length;j++){
			for(int i=0;i<arr.length;i++)
				colsum[j] += arr[i][j];
		}

		for(int i=0;i<arr[0].length;i++)
			System.out.printf("배열의 %d열 합: %d\n", i+1, colsum[i]);	
	}

	public static void shuffleArr(int [][] arr){
		Random r = new Random();
		int num1, num2, temp;

		for(int i =0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				num1 = r.nextInt(i+1);
				num2 = r.nextInt(j+1);
				
				temp = arr[i][j];
				arr[i][j] = arr[num1][num2];
				arr[num1][num2] = temp;
			}
		}
	}
					

}
