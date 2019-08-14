import java.util.*;
class Elevator{
	private int floor;
	private boolean state;

	Elevator(){
	}

	void open(){
		System.out.println("문이 열립니다.");
		state = true;
	}
	void close(){
		System.out.println("문이 닫힙니다.");
		state = false;
	}

	void printfloor(int i){
		switch(i){
			case -2: case -1:
				System.out.print("B%d ", -i);
				break;
			case 0:
				System.out.print("L ");
				break;
			case 1: case 2: case 3: case 4: case 5:
			case 6: case 7: case 8: case 9: case 10:
				System.out.printf("%d ", i);
				break;
			default:
				System.out.println("유효하지 않은 층수 입니다.");
		}
	}
	void move(int num){
		close();
		setFloor(num);

		report();
		open();
	}

	void setFloor(int num){
		if(num >= -2 && num <= 10)
			if(num < floor){
				while(int i=num;i<=floor;i++)
					printfloor(i);
			}else if(num > floor){
				while(int i=num;i>=floor;i--)
					printfloor(i);
			}
	}

	public String report(){
		return String.format("%d층입니다.", floor);
	}
	
}




class ElevatorTest{
	public static void main(String args[]){
		Elevator e = new Elevator();
		Scanner s = new Scanner(System.in);
		int num;
		while(1){
			System.out.print("몇층으로 갈까요? ");
			
			e.move(s.nextInt());
		}
	}
}
