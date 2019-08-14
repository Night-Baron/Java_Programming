class I{


	void eat(Object o){
		if(o instanceof food == true)
			System.out.println(((food)o).getClass().getName()+" 먹습니다.");
		else
			System.out.println(((notfood)o).getClass().getName()+"는 안먹습니다~~");
	}
}
class food{
	int num;

}
class notfood{
}

class hamburger extends food{
	hamburger(){
		this(1);
	}
	hamburger(int num){
		this.num = num;
	}
}

class icecream extends food{
	icecream(){
		this(2);
	}
	icecream(int num){
		this.num = num;
	}
}

class bingsu extends food{
	bingsu(){
		this(3);
	}
	bingsu(int num){
		this.num = num;
	}
}

class gimbob extends food{
	gimbob(){
		this(4);
	}
	gimbob(int num){
		this.num = num;
	}
}

class pizza extends food{
}
class stone extends notfood{}

class test2{
	public static void main(String args[]){
		I i = new I();
		food h = new hamburger();
		food ic = new icecream();
	   	food b = new bingsu();
		food g = new gimbob();	
		
		
		i.eat(h);
		i.eat(ic);
		i.eat(b);
		i.eat(g);
		i.eat(new pizza());
		i.eat(new stone());

		System.out.println(h.num);
		System.out.println(ic.num);
		System.out.println(b.num);
		System.out.println(g.num);
	}
}

//상속의 장점1: 메소드의 매개변수로 부모 클래스 타입을 설정하면, 자식클래스 모두 받을 수 있다.

