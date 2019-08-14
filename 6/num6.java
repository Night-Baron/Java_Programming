import java.util.Scanner;
public class num6{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int [] a = {5,4,3,2,1}; int tmp;
		
		for(int i =0;i<a.length-1;i++){
			for(int j=i;i<a.length-1;j++){
				if(a[j] > a[j+1]){
					tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = a[j];
				}
			}
		}
			

	//	for(int i =0;i<a.length-1;i++){
	//		for(int j=i+1;j<a.length;j++){
	//			if(a[i] > a[j]){
	//				tmp = a[i];
	//				a[i] = a[j];
	//				a[j] = tmp;
	//			}
	//		}
	//	}
		for(int x:a)
			System.out.print(x);
		System.out.println();
	}
}
