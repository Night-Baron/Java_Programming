public class test8{
	public static void main(String args[]){
		int [] arr1 = {1,2,3};
		int [] arr2 = new int [arr1.length];

		arr2 = arr1;

		for(int num: arr2)
			System.out.println(num);
	}
}
