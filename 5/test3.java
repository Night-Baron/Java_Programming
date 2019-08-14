import java.util.Scanner;
public class test3{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int size;
		
		System.out.print("size: ");
		size = s.nextInt();
		if(size >= 200){
			System.out.println("large");
		}else if(size >= 100){
			System.out.println("medium");
		}else{
			System.out.println("small");
		}
	}
}
