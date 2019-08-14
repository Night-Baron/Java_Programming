import java.util.*;

public class arrtest{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		double [] arr1;
		int num;

		System.out.print("배열의 원소 개수:");
		arr1 = new double [s.nextInt()];
		System.out.println();
		
		initArr(arr1);
		System.out.println("배열 성분");
		printArr(arr1);
		System.out.printf("합: %.2f\n", sumArr(arr1));
		System.out.printf("배열의 최댓값: %.2f\n", maxArr(arr1));
		System.out.printf("배열의 최댓값의 인덱스: %d\n", indexMaxArr(arr1));
		System.out.println();

		shuffleArr(arr1);
		System.out.println("셔플 후 배열 성분:");
		printArr(arr1);
		rotateR1Arr(arr1);
		System.out.println("오른쪽으로 1칸 로테이션:");
		printArr(arr1);
		rotateL1Arr(arr1);
		System.out.println("왼쪽으로 1칸 로테이션:");
		printArr(arr1);
		System.out.println();

		System.out.print("오른쪽으로 시프트 횟수:");
		num = s.nextInt();
		rotateRnArr(arr1, num);
		System.out.printf("오른쪽으로 %d칸 로테이션:\n", num);
		printArr(arr1);
		System.out.println();

		System.out.print("왼쪽으로 시프트 횟수:");
		num = s.nextInt();
		rotateLnArr(arr1, num);
		System.out.printf("왼쪽으로 %d칸 로테이션:\n", num);
		printArr(arr1);

	}
	public static void initArr(double [] arr){
		Random r = new Random();
		for(int i=0;i<arr.length;i++)
			arr[i] = r.nextDouble()*10;
	}
	public static void printArr(double [] arr){
		for(int i=0;i<arr.length;i++)
			System.out.printf("%.2f ", arr[i]);
		System.out.println();
	}
	public static double sumArr(double [] arr){
		double sum = 0;
		for(int i=0;i<arr.length;i++)
			sum += arr[i];
		return sum;
	}
	public static double maxArr(double [] arr){
		double max = arr[0];
		for(int i = 1;i<arr.length;i++)
			max = (max < arr[i]) ? arr[i] : max;
		return max;
	}
	public static int indexMaxArr(double [] arr){
		double max = maxArr(arr);
		for(int i=0;i<arr.length;i++){
			if(arr[i] == max)
				return i+1;
		}
		return 0;
	}
	public static void shuffleArr(double [] arr){
		Random r = new Random();
		int index; double tmp;

		for(int i = arr.length-1;i>=0;i--){
			index = r.nextInt(i+1);
			if(index != i){
				tmp = arr[i];
				arr[i] = arr[index];
				arr[index] = tmp;
			}
		}
	}
	public static void rotateR1Arr(double [] arr){
		double tmp;
		for(int i = arr.length-2;i>=0;i--){
			tmp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = tmp;
		}
	}
	public static void rotateL1Arr(double [] arr){
		double tmp;

		for(int i =0;i<arr.length-1;i++){
			tmp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = tmp;
		}
	}	
	public static void rotateRnArr(double [] arr, int num){
		for(int i=0;i<num;i++)
			rotateR1Arr(arr);
	}
	public static void rotateLnArr(double [] arr, int num){
		for(int i=0;i<num;i++)
			rotateL1Arr(arr);
	}
}
