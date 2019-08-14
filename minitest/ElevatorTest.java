import java.util.*;
class Elevator{
	Scanner s1 = new Scanner(System.in);
	private int floor;
	private boolean state;
	
	Elevator(){
		this.floor = 0;
		this.state = true;
	}

	void open(){
		System.out.println("문이 열립니다.");
		state = true;
	}
	void close(){
		System.out.println("문이 닫힙니다.");
		state = false;
	}
	void report(){
		switch(floor){
			case -2: case -1:
				System.out.printf("지하%d층입니다.\n", -floor);
			   	break;
			case 0:
				System.out.printf("로비입니다.\n");
				break;
			default:
				System.out.printf("%d층입니다.\n", floor);
		}
	}

	void move(int num)throws Exception{
		if(num < -2 || num > 10){
		    System.out.println("유효하지 않은 층수를 입력하셨습니다.");
			return;
		}
		close();
		
		switch(num){
			case -2: case -1:
				System.out.printf("지하%d층으로 이동합니다.\n", -num);
				break;
			case 0:
				System.out.printf("로비로 이동합니다.\n");
				break;
			default:
				System.out.printf("%d층으로 이동합니다.\n", num);
		}

		if(num < floor){
			for(int i=floor;i>=num;i--){
				switch(i){
					case -2: case -1:
						System.out.printf("B%d ", -i);
						Thread.sleep(1000);
						break;
					case 0:
						System.out.printf("L ");
						Thread.sleep(1000);
						break;
					default:
						System.out.printf("%d ", i);
						Thread.sleep(1000);
						break;
				}
			}
			this.floor = num;
		}else if(num > floor){
			for(int i=floor;i<=num;i++){
				switch(i){
					case -2: case -1:
						System.out.printf("B%d ", -i);
						Thread.sleep(1000);
						break;
					case 0:
						System.out.printf("L ");
						Thread.sleep(1000);
						break;
					default:
						System.out.printf("%d ", i);
						Thread.sleep(1000);
						break;
				}
			}
			this.floor = num;
		}		
		System.out.println();
		report();
		open();
	}
}




class ElevatorTest{
	public static void main(String args[])throws Exception{
		Elevator e = new Elevator();
		Scanner s2 = new Scanner(System.in);
		int num;

		while(true){
			System.out.print("몇층으로 갈까요? ");
			e.move(s2.nextInt());
		}
	}
}
