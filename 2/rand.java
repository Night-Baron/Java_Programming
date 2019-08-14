import java.lang.Math;

public class rand{
	public static void main(String args[]){
		int num2, num3;	
		System.out.println("0이상 10미만의 실수형 난수: " + 10*Math.random());
		num2 = (int)(16*Math.random());
		System.out.println("0이상 15이하의 정수형 난수: " + num2);
		num3 = (int)(31*Math.random()-15);
		System.out.println("-15이상 15이하의 정수형 난수: " + num3);
	}
}
