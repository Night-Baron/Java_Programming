public class test{
	public static void main(String args[]){
		double [] numbers = {10.0, 20.0, 30.0};
		System.out.println("For문");
		for(int i=0;i<numbers.length;i++)
			System.out.println(numbers[i]);
		
		System.out.println("For-each문");
		for(double x: numbers)
			System.out.printf("%.0f ", x);
	}
}
