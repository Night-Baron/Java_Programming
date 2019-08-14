import java.util.*;
public class arrtest{
	public static void initArr(double [] arr){
		Random r = new Random();

		for(int i=0;i<arr.length;i++)
			arr[i] = r.nextDouble()*10;
	}

	public static void printArr(double [] arr){
		for(double num: arr)
			System.out.printf("%.2f ", num);
		System.out.println();
	}

	public static double sumArr(double [] arr){
		double sum=0;
		for(double num: arr)
			sum += num;
		return sum;
	}

	public static double maxArr(double [] arr){
		double max = arr[0];
		for(int i=1;i<arr.length;i++)
			max = (arr[i] >= max) ? arr[i] : max;
		return max;
	}

	public static int indexMaxArr(double [] arr){
		int cnt = 0;
		for(int i=0;i<arr.length;i++){
			if(maxArr(arr) == arr[i])
				return cnt+1;
			cnt++;
		}
		return 0;
	}

	public static void shuffleArr(double [] arr){
		double temp; int index;
		Random r = new Random();
		
		for(int i = arr.length-1;i>=0; i--){
			index = r.nextInt(i+1);
			if(index !=i){
				temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			}
		}
	}

	public static void rotateR1Arr(double [] arr){
		double temp;
		for(int i=arr.length-2;i>=0;i--){
			temp = arr[i+1];
			arr[i+1] =	arr[i];
			arr[i] = temp;
		}
	}

	public static void rotateL1Arr(double [] arr){
		double temp;
		for(int i=0;i<arr.length-1;i++){
			temp = arr[i+1];
			arr[i+1] = arr[i];
			arr[i] = temp;
		}
	}

	public static void rotateRnArr(double [] arr, int n){
		n %= arr.length;
		for(int i=0;i<n;i++)
			rotateR1Arr(arr);
	}
	
	public static void rotateLnArr(double [] arr, int n){
		n %= arr.length;
		for(int i=0;i<n;i++)
			rotateL1Arr(arr);
	}

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		double [] arr1; int num;
		
		System.out.print("배열의 원소 개수: ");
		arr1 = new double [s.nextInt()];
		initArr(arr1);

		System.out.println("\n배열의 성분:");
		printArr(arr1);
		
		System.out.printf("합: %.2f\n", sumArr(arr1));
		System.out.printf("배열의 최댓값: %.2f\n", maxArr(arr1));
		System.out.printf("배열의 최댓값의 인덱스: %d\n", indexMaxArr(arr1));
		
		shuffleArr(arr1);
		System.out.println("\n셔플 후 배열 성분:");
		printArr(arr1);

		rotateR1Arr(arr1);
		System.out.println("오른쪽으로 1칸 로테이션:");
		printArr(arr1);
		
		rotateL1Arr(arr1);
		System.out.println("왼쪽으로 1칸 로테이션:");
		printArr(arr1);

		System.out.print("\n오른쪽으로 시프트 횟수: ");
		num = s.nextInt();
		System.out.printf("오른쪽으로 %d칸 로테이션: \n", num);
		rotateRnArr(arr1, num);
		printArr(arr1);

		System.out.print("\n왼쪽으로 시프트 횟수: ");
		num = s.nextInt();
		System.out.printf("왼쪽으로 %d칸 로테이션: \n", num);
		rotateLnArr(arr1, num);
		printArr(arr1);
	}
}
