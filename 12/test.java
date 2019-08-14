class Animal{
	int age;
	void eat(){
		System.out.println("먹는다.");
	}
	void speak(){
		System.out.println("...");
	}


	Animal(){
		System.out.println("동물생성");
	}
	Animal(int age){
		this.age = age;
	}
}

class Human extends Animal{
	String name="홍길동";

	//나이와 이름이 같으면 같은 사람으로 간주하도록 equals()메소드로 재정의
	public boolean equals(Human h){
		if ((h.name).equals(this.name) && h.age == this.age)
			//지금 name이 NULL이라서 컴파일 오류....
			return true;
		return false;
	}

	Human(int age, String name){
		//super.age = age;
		super(age);
		
		this.name = name;
	}

	@Override
	void eat(){
		super.eat();
		System.out.println("잘먹었습니다.");
	}
	@Override
	void speak(){ //부모클래스의 speak() 메소드를재정의(override)
		System.out.println("말할 수 있다~~");
	}
	
	Human(){
		System.out.println("사람생성");
	}
	void walk(){
		System.out.println("걷는다.");
	}
}

class test{
	public static void main(String args[]){
		Animal a = new Animal();
		System.out.println(a.toString());
		Human h = new Human();
		Human h1 = new Human();
	   //h랑 h1이랑 같은 사람??
		System.out.println("결과 값: "+h.equals(h1));	

		System.out.println("a는 무슨 객체??:" + a.getClass().getName());
		System.out.println("h는 어떤 클래스로부터 생성되었는가?"+h.getClass());
	}
}
