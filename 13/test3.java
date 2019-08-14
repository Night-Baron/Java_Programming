class 연주자{
	String 악기;
	void play(Object o){
		System.out.print(((연주자)o).악기+"(을)를 연주합니다.");
	}
}

class 피아니스트 extends 연주자{
	String 악기 = "피아노";
}
class 첼리스트 extends 연주자{
	String 악기 = "첼로";
}
class 바이올리니스트 extends 연주자{
	String 악기 = "바이올린";
}
class 지휘자{
	void direct(Object o){
		((연주자)o).play(((연주자)o).악기);
	}
}

class test3{
	public static void main(String args[]){
		지휘자 j = new 지휘자();
		파아니스트 p = new 피아니스트();
		첼리스트 c = new 첼리스트();
		바이올리니스트 b = new 바이올리니스트();

		j.direct(p);
		j.direct(c);
		j.direct(b);
	}
}
