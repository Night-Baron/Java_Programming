class Pet{
	int age;

	Pet(){
		this(1);
	}

	Pet(int age){
		this.age = age;
	}

	void print(){
		System.out.println("나는 뭘까?");
	}
}

class Dog extends Pet{
	String name;

	Dog(){
		this(1, "누렁이");
	}

	Dog(int age, String name){
		super(age);
		this.name = name;
	}
	@Override
	void print(){
		System.out.println("나는 강아지");
	}
}

class Jindo extends Dog{
	String color;

	Jindo(){
		this(1, "누렁이", "누런색");
	}

	Jindo(int age, String name, String color){
		super(age, name);
		this.color = color;
	}
	@Override
	void print(){
		System.out.println("나는 진돗개");
	}

	@Override
	public boolean equals(Object o){ //업캐스팅, 다운캐스팅, instanceof
	if(o instanceof Jindo == true){ //o가 Jindo인가...
		if(this.age == ((Jindo)o).age && this.name.equals(((Jindo)o).name) && this.color.equals(((Jindo)o).color))
			return true;
		else
			return false;
	}else
		return false;
	}
}

class stone{}

class test{
	public static void main(String args[]){
		Jindo j1 = new Jindo(); //j1은 짓돗개이고 방금 생성한 객체를 j1이라고 하겠다.
		//j1의 자료형은 Jindo이다.
		Dog j2 = new Jindo(); // 업캐스팅: 자식 클래스 객체를 부모클래스로 참조하는 것
		Pet j3 = new Jindo(); // 업캐스팅
		Jindo j4 = new Jindo();
		stone s = new stone();
		int a=1, b=1;

		//==: 기초 자료형은 내용비교, 참조자료형은 주소비교
		System.out.println(a==b);
		//j1, j4가 같은 진돗개인지 판단
		System.out.println(j1.equals(s));


		//업캐스팅의 한계
		System.out.println(((Jindo)j2).color); //(Jindo)j2 => 다운캐스팅
		System.out.println(((Dog)j3).name); //(Dog)j3 => 다운캐스팅

		j3.print(); // 나는 진돗개
		//컴파일 할때는 자료형을 보고 컴파일
		//실행할 때는 실제 객체를 보고 실행
		
		//동적 바인딩(Dynamic binding): 메소드가 호출될때 실제 객체의 메소드를 호출

		System.out.println(j2.getClass().getName());
		//컴파일이 됨: Pet이 Object를 상속받고 있음.
		//동적 바인딩 발생 결과: Jindo

		//다형성(oplymorphism) : 한 객체를 여러가지 타입으로 참조할 수 있는 성질
	}
}
