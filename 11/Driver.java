class car{
	private int mileage;
	
	void goStraight(int num){
		System.out.printf("%dm 직진했습니다.\n", num);
		mileage += num;
	}

	void turnLeft(){
		System.out.print("좌회전 후 ");
	}
	void turnRight(){
		System.out.print("우회전 후 ");
	}
	public int getMileage(){
		return mileage;
	}
}

class Driver{
	public static void main(String args[]){
		car mycar = new car();

		//mycar.goStraight(10);
		//mycar.turnRight();
		//mycar.goStraight(9);
		//System.out.printf("총 주행거리는 %dm입니다.\n", mycar.getMileage());
		mycar.goStraight(25);
		mycar.turnLeft();
		mycar.goStraight(30);
		mycar.turnRight();
		mycar.goStraight(15);
		mycar.turnLeft();
		mycar.goStraight(20);
		System.out.printf("총 주행거리는 %dm입니다.\n", mycar.getMileage());
	}
}
