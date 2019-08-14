import java.util.Scanner;
public class num6{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int [] a = {3, 4, 1, 2, 5};
		int tmp;

		for(int i =0;i<a.length;i++){
				for(int j=0;j<a.length-i-1;j++){
					if(a[j] > a[j+1]){
					tmp = a[j+1];
					a[j+1] = a[j];
					a[j] = tmp;
					}
				}
		}

		for(int x:a)
			System.out.println(x);
	}
}
