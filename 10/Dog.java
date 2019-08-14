class Dog{
	private int full;  // 0
	private	String name;
/*
	boolean a; // false
	String b;  // NULL 
	double c;  // 0.0
*/
	//setter(): private한 필드값을 set하기 위한 메소드
	void SetName(String name){
		if(n.length() >= 10) 
			this.name = "개똥이";
		else
			this.name = name;
	}

	//getter(): private한 필드값을 get하기 위한 메소드

	String getName(){
		return name;
	}

	int getFull(){
		return full;
	}

	void play(){
		System.out.println("재미있다~~");
	}

	void eat(int food){
		if(food >0){
			full += food;
			System.out.printf("먹이를 %d개 먹었습니다.\n", food);
		}else
			System.out.println("먹이를 주세요");
	}
}
