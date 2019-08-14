class dog{
	int full;
	String name;
	double weight;
	double height;
	static int numofdog;

	dog(){
		this(15,30);//맨 첫줄만 가능!
		this.full = 10;
		this.name = "뽀삐";
	}

	dog(double weight, double height, String name, int full){
		this(weight, height);
		this.name = name;
		this.full = full;
	}
	dog(double weight, double height){
		numofdog++;
		if(weight>0 && weight<=50) this.weight = weight;
		else this.weight = 15;
		if(height>0 && height <=100) this.height = height;
		else this.height = 30;
	}

	void eat(int food){
		full += food;
		System.out.println("맛있다~");
	}
	void eat(String n){
		full += 5;
		System.out.println("꺼777ㅓㄱ");
	}
	public String toString(){
		return String.format("이름: %s, 포만감: %d, 무게: %.1f, 키: %.1f", name, full, weight, height);
	}
}

class testdog{
	public static void main(String args[]){
		dog mydog = new dog();
		dog yourdog = new dog(150, 75, "개똥이");
		dog d3 = new dog();

		System.out.println("이제까지 생성된 강아지는 "+dog.numofdog+"마리");
		
		System.out.println("내강아지: "+mydog);
		System.out.println("니강아지: "+yourdog);
		yourdog.toString();
		mydog.eat(5);
		mydog.eat("빙수");
	}
}

